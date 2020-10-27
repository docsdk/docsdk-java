package com.docsdk.resource.async;

import com.docsdk.client.mapper.ObjectMapperProvider;
import com.docsdk.client.setttings.SettingsProvider;
import com.docsdk.dto.result.AsyncResult;
import com.docsdk.executor.AsyncRequestExecutor;
import com.docsdk.resource.AbstractFilesResource;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;

@Slf4j
public class AsyncFilesResource extends AbstractFilesResource<AsyncResult<InputStream>> {

    private final AsyncRequestExecutor asyncRequestExecutor;

    public AsyncFilesResource(
        final SettingsProvider settingsProvider,
        final ObjectMapperProvider objectMapperProvider, final AsyncRequestExecutor asyncRequestExecutor
    ) {
        super(settingsProvider, objectMapperProvider);

        this.asyncRequestExecutor = asyncRequestExecutor;
    }

    @Override
    public AsyncResult<InputStream> download(
        @NotNull final String path
    ) throws IOException, URISyntaxException {
        return asyncRequestExecutor.execute(getDownloadHttpUriRequest(path), INPUT_STREAM_TYPE_REFERENCE);
    }

    @Override
    public void close() throws IOException {
        asyncRequestExecutor.close();
    }
}
