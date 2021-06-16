# 关于 DocSDK
> DocSDK 是一个智能文件转换的工具包。我们支持各类文档的转换，其中包括 pdf、doc、docx、xls、xlsx、ppt、pptx、dwg、caj、svg、html、json、png、jpg 和 gif 等等各种格式的转换，更多转换格式可查看我们的[新版首页](http://www.docsdk.com/home) 。现有八种 SDK 的支持，其中包括 Java、Node.js、PHP、Python、Swift、CLI、AWS-Lambda 和 Laravel。
> 
> **关键词： 文档转换，文件转换，PDF转Word，PDF转PPT，PDF转HTML，JavaSDK**

# docsdk-java

> 这是 [九云图 DocSDK](http://www.9yuntu.cn/v2/ApiDoc) _API v2_ 官方的 Java 开发工具包.

## 安装
添加以下依赖到 pom.xml:
```
<dependency>
    <groupId>com.docsdk</groupId>
    <artifactId>docsdk-java</artifactId>
    <version>1.0.3</version>
</dependency>
```

## 创建 API Client

###### 配置
默认情况下 API Key 和 Webhook Signing Secret 是从 `application.properties` 文件读取的
```properties
DOCSDK_API_KEY=<api-key>
DOCSDK_WEBHOOK_SIGNING_SECRET=<secret>
```
可以使用环境变量，自定义属性文件，系统属性和字符串变量来提供上述配置。
对于所有选项，应使用 `DOCSDK_API_KEY` 和 `DOCSDK_WEBHOOK_SIGNING_SECRET` 变量名称。

###### 默认（同步） client
```java
// Using configuration from `application.properties` file
new DocSDKClient();

// Using configuration from environment variables
new DocSDKClient(new EnvironmentVariableSettingsProvider());

// Using configuration from custom properties file
new DocSDKClient(new PropertyFileSettingsProvider("custom.properties"));

// Using configuration from string variables
new DocSDKClient(new StringSettingsProvider("api-key", "webhook-signing-secret", false));

// Using configuration from system properties
new DocSDKClient(new SystemPropertySettingsProvider()); 
```

###### 异步 client
```java
// Using configuration from `application.properties` file
new AsyncDocSDKClient();

// Using configuration from environment variables
new AsyncDocSDKClient(new EnvironmentVariableSettingsProvider());

// Using configuration from custom properties file
new AsyncDocSDKClient(new PropertyFileSettingsProvider("custom.properties"));

// Using configuration from string variables
new AsyncDocSDKClient(new StringSettingsProvider("api-key", "webhook-signing-secret", false));

// Using configuration from system properties
new AsyncDocSDKClient(new SystemPropertySettingsProvider());
```

## 创建 Jobs

###### 默认（同步） client
```java
// Create a client
final DocSDKClient docSDKClient = new DocSDKClient();

// Create a job
final JobResponse createJobResponse = docSDKClient.jobs().create(
    ImmutableMap.of(
        "ImportURL", new UrlImportRequest().setUrl("https://file-url"),
        "ConvertFile", new ConvertFilesTaskRequest()
                    .setInput("ImportURL"),
        "ExportResult", new UrlExportRequest().setInput("ConvertFile")
    )
).getBody();

// Get a job id
final String jobId = createJobResponse.getId();

// Wait for a job completion
final JobResponse waitJobResponse = docSDKClient.jobs().wait(jobId).getBody();

// Get an export/url task id
final String exportUrlTaskId = waitJobResponse.getTasks().stream().filter(taskResponse -> taskResponse.getName().equals("ExportResult")).findFirst().get().getId();
```

###### 异步 client
```java
// Create a client
final AsyncDocSDKClient asyncDocSDKClient = new AsyncDocSDKClient();

// Create a job
final JobResponse createJobResponse = asyncDocSDKClient.jobs().create(
    ImmutableMap.of(
        "ImportURL", new UrlImportRequest().setUrl("https://file-url"),
        "ConvertFile", new ConvertFilesTaskRequest()
                    .setInput("ImportURL")
                    .set("width", 100)
                    .set("height", 100),
        "ExportResult", new UrlExportRequest().setInput("ConvertFile")
    )
).get().getBody();

// Get a job id
final String jobId = createJobResponse.getId();

// Wait for a job completion
final JobResponse waitJobResponse = asyncDocSDKClient.jobs().wait(jobId).get().getBody();

// Get an export/url task id
final String exportUrlTaskId = waitJobResponse.getTasks().stream().filter(taskResponse -> taskResponse.getName().equals("export-my-file")).findFirst().get().getId();
```

## 下载文件
DocSDK 可以使用 `export/url` 生成公开的链接，您可以使用这些URL下载输出文件。

###### 默认（同步） client
```java
// Wait for an export/url task to be finished
final TaskResponse waitUrlExportTaskResponse = docSDKClient.tasks().wait(exportUrlTaskId).getBody();

// Get url and filename of export/url task
final String exportUrl = waitUrlExportTaskResponse.getResult().getFiles().get(0).get("url");
final String filename = waitUrlExportTaskResponse.getResult().getFiles().get(0).get("filename");

// Get file as input stream using url of export/url task
final InputStream inputStream = docSDKClient.files().download(exportUrl).getBody();

// Save to local file
OutputStream outputStream = new FileOutputStream(new File(filename));
IOUtils.copy(inputStream, outputStream);
```

###### 异步 client
```java
// Wait for an export/url task to be finished
final TaskResponse waitUrlExportTaskResponse = asyncDocSDKClient.tasks().wait(exportUrlTaskId).get().getBody();

// Get a url of export/url task
final String exportUrl = waitUrlExportTaskResponse.getResult().getFiles().get(0).get("url");
final String filename = waitUrlExportTaskResponse.getResult().getFiles().get(0).get("filename");

// Get file as input stream using url of export/url task
final InputStream inputStream = asyncDocSDKClient.files().download(exportUrl).get().getBody();

// Save to local file
OutputStream outputStream = new FileOutputStream(new File(filename));
IOUtils.copy(inputStream, outputStream);
```

## 上传文件
通过 `import/upload` 上传文件 (请参考 [docs](http://www.9yuntu.cn/v2/ApiDoc)).
这是一种简单的上传方法：

###### 默认（同步） client
```java
// Create a client
final DocSDKClient docSDKClient = new DocSDKClient();

// File as input stream
final InputStream inputStream = getClass().getClassLoader().getResourceAsStream("file.jpg");

// Upload file using import/upload task
final TaskResponse uploadImportTaskResponse = docSDKClient.importUsing().upload(new UploadImportRequest(), inputStream).getBody();

// Wait for import/upload task to be finished
final TaskResponse waitUploadImportTaskResponse = docSDKClient.tasks().wait(uploadImportTaskResponse.getId()).getBody();
```

###### 异步 client
```java
// Create a client
final AsyncDocSDKClient asyncDocSDKClient = new DocSDKClient();

// File as input stream
final InputStream inputStream = getClass().getClassLoader().getResourceAsStream("file.jpg");

// Upload file using import/upload task
final TaskResponse uploadImportTaskResponse = asyncDocSDKClient.importUsing().upload(new UploadImportRequest(), inputStream).get().getBody();

// Wait for import/upload task to be finished
final TaskResponse waitUploadImportTaskResponse = asyncDocSDKClient.tasks().wait(uploadImportTaskResponse.getId()).get().getBody();
```

## 签署 Webhook
可以验证从 DocSDK 收到的 Webhook 请求。

```java
// Create a client
final DocSDKClient docSDKClient = new DocSDKClient();

// The JSON payload from the raw request body.
final String payload = "payload";

// The value of the "DocSDK-Signature" header.
final String signature = "signature";

// Returns true if signature is valid, and false if signature is invalid
final boolean isValid = docSDKClient.webhooks().verify(payload, signature);
```

## 单元测试
```
$ mvn clean install -U -Punit-tests
```

## 集成测试
```
$ mvn clean install -U -Pintegration-tests
```

默认情况下，这会使用官方 DocSDK 帐户针对 Sandbox API 运行集成测试。 如果您想使用自己的帐户，则可以在 `application.properties` 文件中设置API密钥。
在这种情况下，您需要将以下用于 Sandbox API 的 MD5 hash 值添加到白名单（使用 DocSDK 仪表板）。

    07db6477193bf8313e8082a1e1b5eaf6  image-test-file-1.jpg
    7ef166ecc65949f6f2e7eb94a3dac0d4  image-test-file-2.jpg
    ccbb000ef5bd9dad0fab600d2fff02fb  odt-test-file-1.odt
    3a3b4d07338b51db19056a73a89a186b  odt-test-file-2.odt

## 其他参考
* [API v2 文档](https://docsdk.com/docAPI)
* [DocSDK 主页](https://www.docsdk.com/home)
