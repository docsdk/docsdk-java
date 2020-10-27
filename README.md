## docsdk-java

[![Build Status](https://travis-ci.org/docsdk/docsdk-java.svg?branch=master)](https://travis-ci.org/docsdk/docsdk-java)

This is the official Java SDK v2 for the [DocSDK](https://docsdk.com/api/v2) _API v2_.

## Installation
Add the following dependency to your pom.xml:
```
<dependency>
    <groupId>com.docsdk</groupId>
    <artifactId>docsdk-java</artifactId>
    <version>1.0</version>
</dependency>
```

## Creating API Client

###### Configuration
By default, API Key, Sandbox and Webhook Signing Secret are being read from `application.properties` file
```properties
DOCSDK_API_KEY=<api-key>
DOCSDK_SANDBOX=<true|false>
DOCSDK_WEBHOOK_SIGNING_SECRET=<secret>
```
It is also possible to provide configuration above using environment variables, custom properties file, system properties and string variables.
For all options, `DOCSDK_API_KEY`, `DOCSDK_SANDBOX` and `DOCSDK_WEBHOOK_SIGNING_SECRET` variable names should be used.

###### Default (synchronous) client
```java
// Using configuration from `application.properties` file
new DocSDKClient();

// Using configuration from environment variables
new DocSDKClient(new EnvironmentVariableSettingsProvider());

// Using configuration from custom properties file
new DocSDKClient(new PropertyFileSettingsProvider("custom.properties"));

// Using configuration from string variables
new DocSDKClient(new StringSettingsProvider("api-url", "webhook-signing-secret", false));

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
new AsyncDocSDKClient(new StringSettingsProvider("api-url", "webhook-signing-secret", false));

// Using configuration from system properties
new AsyncDocSDKClient(new SystemPropertySettingsProvider());
```

## Creating Jobs

###### Default (synchronous) client
```java
// Create a client
final DocSDKClient docSDKClient = new DocSDKClient();

// Create a job
final JobResponse createJobResponse = docSDKClient.jobs().create(
    ImmutableMap.of(
        "import-my-file", new UrlImportRequest().setUrl("import-url"),
        "convert-my-file", new ConvertFilesTaskRequest()
                    .setInput("import-my-file")
                    .set("width", 100)
                    .set("height", 100),
        "export-my-file", new UrlExportRequest().setInput("convert-my-file")
    )
).getBody();

// Get a job id
final String jobId = createJobResponse.getId();

// Wait for a job completion
final JobResponse waitJobResponse = docSDKClient.jobs().wait(jobId).getBody();

// Get an export/url task id
final String exportUrlTaskId = waitJobResponse.getTasks().stream().filter(taskResponse -> taskResponse.getName().equals("export-my-file")).findFirst().get().getId();
```

###### Asynchronous client
```java
// Create a client
final AsyncDocSDKClient asyncDocSDKClient = new AsyncDocSDKClient();

// Create a job
final JobResponse createJobResponse = asyncDocSDKClient.jobs().create(
    ImmutableMap.of(
        "import-my-file", new UrlImportRequest().setUrl("import-url"),
        "convert-my-file", new ConvertFilesTaskRequest()
                    .setInput("import-my-file")
                    .set("width", 100)
                    .set("height", 100),
        "export-my-file", new UrlExportRequest().setInput("convert-my-file")
    )
).get().getBody();

// Get a job id
final String jobId = createJobResponse.getId();

// Wait for a job completion
final JobResponse waitJobResponse = asyncDocSDKClient.jobs().wait(jobId).get().getBody();

// Get an export/url task id
final String exportUrlTaskId = waitJobResponse.getTasks().stream().filter(taskResponse -> taskResponse.getName().equals("export-my-file")).findFirst().get().getId();
```

## Downloading Files
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

## Uploading Files
Uploads to DocSDK are done via `import/upload` tasks (see the [docs](https://docsdk.com/api/v2/import#import-upload-tasks)).
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

## Signing Webhook 
The node SDK allows to verify webhook requests received from DocSDK.

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

## Unit Tests
```
$ mvn clean install -U -Punit-tests
```

## Integration Tests
```
$ mvn clean install -U -Pintegration-tests
```

By default, this runs the integration tests against the Sandbox API with an official DocSDK account. If you would like to use your own account, you can set your API key in the `application.properties` file. In this case you need to whitelist the following MD5 hashes for Sandbox API (using the DocSDK dashboard).

    07db6477193bf8313e8082a1e1b5eaf6  image-test-file-1.jpg
    7ef166ecc65949f6f2e7eb94a3dac0d4  image-test-file-2.jpg
    ccbb000ef5bd9dad0fab600d2fff02fb  odt-test-file-1.odt
    3a3b4d07338b51db19056a73a89a186b  odt-test-file-2.odt

## Resources
* [API v2 Documentation](https://docsdk.com/api/v2)
* [DocSDK Blog](https://docsdk.com/blog)
