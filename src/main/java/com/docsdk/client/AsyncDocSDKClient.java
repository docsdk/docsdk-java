package com.docsdk.client;

import com.docsdk.client.http.AsyncCloseableHttpClientProvider;
import com.docsdk.client.mapper.ObjectMapperProvider;
import com.docsdk.client.setttings.PropertyFileSettingsProvider;
import com.docsdk.client.setttings.SettingsProvider;
import com.docsdk.dto.response.JobResponse;
import com.docsdk.dto.response.OperationResponse;
import com.docsdk.dto.response.Pageable;
import com.docsdk.dto.response.TaskResponse;
import com.docsdk.dto.response.UserResponse;
import com.docsdk.dto.response.WebhookResponse;
import com.docsdk.dto.result.AsyncResult;
import com.docsdk.executor.AsyncRequestExecutor;
import com.docsdk.extractor.ResultExtractor;
import com.docsdk.resource.async.*;

import java.io.IOException;
import java.io.InputStream;

public class AsyncDocSDKClient extends AbstractDocSDKClient<AsyncResult<Void>,
    AsyncResult<InputStream>, AsyncResult<TaskResponse>, AsyncResult<Pageable<TaskResponse>>,
    AsyncResult<JobResponse>, AsyncResult<Pageable<JobResponse>>, AsyncResult<WebhookResponse>,
    AsyncResult<Pageable<WebhookResponse>>, AsyncResult<UserResponse>, AsyncResult<Pageable<OperationResponse>>> {

    public AsyncDocSDKClient() throws IOException {
        this(new PropertyFileSettingsProvider());
    }

    public AsyncDocSDKClient(
        final SettingsProvider settingsProvider
    ) throws IOException {
        this(settingsProvider, new ObjectMapperProvider());
    }

    public AsyncDocSDKClient(
        final SettingsProvider settingsProvider, final ObjectMapperProvider objectMapperProvider
    ) throws IOException {
        this(settingsProvider, objectMapperProvider, new AsyncRequestExecutor(new ResultExtractor(objectMapperProvider), new AsyncCloseableHttpClientProvider()));
    }

    public AsyncDocSDKClient(
        final SettingsProvider settingsProvider, final ObjectMapperProvider objectMapperProvider, final AsyncRequestExecutor asyncRequestExecutor
    ) {
        this(settingsProvider, objectMapperProvider, asyncRequestExecutor,
            new AsyncTasksResource(settingsProvider, objectMapperProvider, asyncRequestExecutor,
                new AsyncConvertFilesResource(settingsProvider, objectMapperProvider, asyncRequestExecutor),
                new AsyncOptimizeFilesResource(settingsProvider, objectMapperProvider, asyncRequestExecutor),
                new AsyncCaptureWebsitesResource(settingsProvider, objectMapperProvider, asyncRequestExecutor),
                new AsyncMergeFilesResource(settingsProvider, objectMapperProvider, asyncRequestExecutor),
                new AsyncCreateArchivesResource(settingsProvider, objectMapperProvider, asyncRequestExecutor),
                new AsyncExecuteCommandsResource(settingsProvider, objectMapperProvider, asyncRequestExecutor),
                new AsyncCreateThumbnailsResource(settingsProvider, objectMapperProvider, asyncRequestExecutor),
                new AsyncGetMetadataResource(settingsProvider, objectMapperProvider, asyncRequestExecutor)
            ),
            new AsyncJobsResource(settingsProvider, objectMapperProvider, asyncRequestExecutor)
        );
    }

    public AsyncDocSDKClient(
        final SettingsProvider settingsProvider, final ObjectMapperProvider objectMapperProvider,
        final AsyncRequestExecutor asyncRequestExecutor, final AsyncTasksResource asyncTasksResource, final AsyncJobsResource asyncJobsResource
    ) {
        super(asyncTasksResource, asyncJobsResource,
            new AsyncImportFilesResource(settingsProvider, objectMapperProvider, asyncRequestExecutor, asyncTasksResource),
            new AsyncExportFilesResource(settingsProvider, objectMapperProvider, asyncRequestExecutor),
            new AsyncUsersResource(settingsProvider, objectMapperProvider, asyncRequestExecutor),
            new AsyncWebhookResource(settingsProvider, objectMapperProvider, asyncRequestExecutor),
            new AsyncFilesResource(settingsProvider, objectMapperProvider, asyncRequestExecutor)
        );
    }
}
