package com.docsdk.resource.sync;

import com.docsdk.client.mapper.ObjectMapperProvider;
import com.docsdk.client.setttings.SettingsProvider;
import com.docsdk.dto.request.OptimizeFilesTaskRequest;
import com.docsdk.dto.response.TaskResponse;
import com.docsdk.dto.result.Result;
import com.docsdk.executor.RequestExecutor;
import com.docsdk.resource.AbstractOptimizeFilesResource;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.net.URISyntaxException;

@Slf4j
public class OptimizeFilesResource extends AbstractOptimizeFilesResource<Result<TaskResponse>> {

    private final RequestExecutor requestExecutor;

    public OptimizeFilesResource(
        final SettingsProvider settingsProvider,
        final ObjectMapperProvider objectMapperProvider, final RequestExecutor requestExecutor
    ) {
        super(settingsProvider, objectMapperProvider);

        this.requestExecutor = requestExecutor;
    }

    @Override
    public Result<TaskResponse> optimize(
        @NotNull final OptimizeFilesTaskRequest optimizeFilesTaskRequest
    ) throws IOException, URISyntaxException {
        return requestExecutor.execute(getOptimizeHttpUriRequest(optimizeFilesTaskRequest), TASK_RESPONSE_TYPE_REFERENCE);
    }

    @Override
    public void close() throws IOException {
        requestExecutor.close();
    }
}
