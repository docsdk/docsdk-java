<p align="center">
  <img width="108px" src="https://yuntu-images.oss-cn-hangzhou.aliyuncs.com/xlogo.jpg" />
</p>

<h1 align="center">DocSDK</h1>
<p align="center">A smart file (document) conversion development kit</p>
<p align="center">English | <a href="doc/README-zh-CN.md">中文</a></p>

## About DocSDK
> DocSDK is a development kit for smart file conversion. We support the conversion of various types of documents, including pdf, doc, docx, xls, xlsx, ppt, pptx, dwg, caj, svg, html, json, png, jpg, gif and other formats, more conversion formats can be viewed on our [website](https://www.docsdk.com/). There are 8 kinds of SDK support, including Java, Node.js, PHP, Python, Swift, CLI, AWS-Lambda and Laravel.
> 
> **Keywords: document conversion, file conversion, PDF to Word, PDF to PPT, PDF to HTML, JavaSDK**

## docsdk-java

> This is the official Java SDK for the [DocSDK API](https://www.docsdk.com/docAPI#sdk).

### Installation
Add the following dependency to your pom.xml:
```
<dependency>
    <groupId>com.docsdk</groupId>
    <artifactId>docsdk-java</artifactId>
    <version>1.0.3</version>
</dependency>
```

### Creating API Client

###### Configuration
By default, API Key and Webhook Signing Secret are being read from `application.properties` file
```properties
DOCSDK_API_KEY=<api-key>
DOCSDK_WEBHOOK_SIGNING_SECRET=<secret>
```
It is also possible to provide configuration above using environment variables, custom properties file, system properties and string variables.
For all options, `DOCSDK_API_KEY` and `DOCSDK_WEBHOOK_SIGNING_SECRET` variable names should be used.

###### Default (synchronous) client
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

###### Asynchronous client
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

### Creating Jobs

###### Default (synchronous) client
```java
// Create a client
final DocSDKClient docSDKClient = new DocSDKClient();

// Create a job
final JobResponse createJobResponse = docSDKClient.jobs().create(
    ImmutableMap.of(
        "ImportURL", new UrlImportRequest().setUrl("https://file-url"),
        "ConvertFile", new ConvertFilesTaskRequest()
                    .setInput("ImportURL")
                    .setOutputFormat("pdf"),
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

###### Asynchronous client
```java
// Create a client
final AsyncDocSDKClient asyncDocSDKClient = new AsyncDocSDKClient();

// Create a job
final JobResponse createJobResponse = asyncDocSDKClient.jobs().create(
    ImmutableMap.of(
        "ImportURL", new UrlImportRequest().setUrl("https://file-url"),
        "ConvertFile", new ConvertFilesTaskRequest()
                    .setInput("ImportURL")
                    .setOutputFormat("pdf"),
        "ExportResult", new UrlExportRequest().setInput("ConvertFile")
    )
).get().getBody();

// Get a job id
final String jobId = createJobResponse.getId();

// Wait for a job completion
final JobResponse waitJobResponse = asyncDocSDKClient.jobs().wait(jobId).get().getBody();

// Get an export/url task id
final String exportUrlTaskId = waitJobResponse.getTasks().stream().filter(taskResponse -> taskResponse.getName().equals("ExportResult")).findFirst().get().getId();
```

### Downloading Files
DocSDK can generate public URLs using `export/url` tasks. You can use these URLs to download output files.

###### Default (synchronous) client
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

###### Asynchronous client
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

### Uploading Files
Uploads to DocSDK are done via `import/upload` tasks.
This SDK offers a convenient upload method:

###### Default (synchronous) client
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

###### Asynchronous client
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

### Resources
* [DocSDK API Documentation](https://www.docsdk.com/docAPI)
* [DocSDK home page](https://www.docsdk.com/)
