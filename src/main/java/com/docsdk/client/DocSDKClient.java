package com.docsdk.client;

import com.docsdk.client.http.CloseableHttpClientProvider;
import com.docsdk.client.mapper.ObjectMapperProvider;
import com.docsdk.client.setttings.PropertyFileSettingsProvider;
import com.docsdk.client.setttings.SettingsProvider;
import com.docsdk.dto.response.JobResponse;
import com.docsdk.dto.response.OperationResponse;
import com.docsdk.dto.response.Pageable;
import com.docsdk.dto.response.TaskResponse;
import com.docsdk.dto.response.UserResponse;
import com.docsdk.dto.response.WebhookResponse;
import com.docsdk.dto.result.Result;
import com.docsdk.executor.RequestExecutor;
import com.docsdk.extractor.ResultExtractor;
import com.docsdk.resource.sync.*;

import java.io.IOException;
import java.io.InputStream;

public class DocSDKClient extends AbstractDocSDKClient<Result<Void>,
    Result<InputStream>, Result<TaskResponse>, Result<Pageable<TaskResponse>>,
    Result<JobResponse>, Result<Pageable<JobResponse>>, Result<WebhookResponse>,
    Result<Pageable<WebhookResponse>>, Result<UserResponse>, Result<Pageable<OperationResponse>>> {

    public DocSDKClient() throws IOException {
        this(new PropertyFileSettingsProvider());
    }

    public DocSDKClient(
        final SettingsProvider settingsProvider
    ) throws IOException {
        this(settingsProvider, new ObjectMapperProvider());
    }

    public DocSDKClient(
        final SettingsProvider settingsProvider, final ObjectMapperProvider objectMapperProvider
    ) throws IOException {
        this(settingsProvider, objectMapperProvider, new RequestExecutor(new ResultExtractor(objectMapperProvider), new CloseableHttpClientProvider()));
    }

    public DocSDKClient(
        final SettingsProvider settingsProvider,
        final ObjectMapperProvider objectMapperProvider, final RequestExecutor requestExecutor
    ) {
        this(settingsProvider, objectMapperProvider, requestExecutor,
            new TasksResource(settingsProvider, objectMapperProvider, requestExecutor,
                new ConvertFilesResource(settingsProvider, objectMapperProvider, requestExecutor),
                new OptimizeFilesResource(settingsProvider, objectMapperProvider, requestExecutor),
                new CaptureWebsitesResource(settingsProvider, objectMapperProvider, requestExecutor),
                new MergeFilesResource(settingsProvider, objectMapperProvider, requestExecutor),
                new CreateArchivesResource(settingsProvider, objectMapperProvider, requestExecutor),
                new ExecuteCommandsResource(settingsProvider, objectMapperProvider, requestExecutor),
                new CreateThumbnailsResource(settingsProvider, objectMapperProvider, requestExecutor),
                new GetMetadataResource(settingsProvider, objectMapperProvider, requestExecutor)
            ),
            new JobsResource(settingsProvider, objectMapperProvider, requestExecutor)
        );
    }

    public DocSDKClient(
        final SettingsProvider settingsProvider,
        final ObjectMapperProvider objectMapperProvider, final RequestExecutor requestExecutor,
        final TasksResource tasksResource, final JobsResource jobsResource
    ) {
        super(tasksResource, jobsResource,
            new ImportFilesResource(settingsProvider, objectMapperProvider, requestExecutor, tasksResource),
            new ExportFilesResource(settingsProvider, objectMapperProvider, requestExecutor),
            new UsersResource(settingsProvider, objectMapperProvider, requestExecutor),
            new WebhookResource(settingsProvider, objectMapperProvider, requestExecutor),
            new FilesResource(settingsProvider, objectMapperProvider, requestExecutor)
        );
    }
}
