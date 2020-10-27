package com.docsdk.resource;

import com.docsdk.client.mapper.ObjectMapperProvider;
import com.docsdk.client.setttings.SettingsProvider;
import com.docsdk.dto.request.CreateThumbnailsTaskRequest;
import com.docsdk.dto.response.TaskResponse;
import com.docsdk.dto.result.AbstractResult;
import com.google.common.collect.ImmutableList;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public abstract class AbstractCreateThumbnailsResource<TRAR extends AbstractResult<TaskResponse>> extends AbstractResource {

    public static final String PATH_SEGMENT_CREATE_THUMBNAIL = "thumbnail";

    public AbstractCreateThumbnailsResource(
        final SettingsProvider settingsProvider, final ObjectMapperProvider objectMapperProvider
    ) {
        super(settingsProvider, objectMapperProvider);
    }

    /**
     * Create a task to create a thumbnail (png, jpg).
     *
     * @param createThumbnailsTaskRequest {@link CreateThumbnailsTaskRequest}
     * @return {@link TRAR}
     * @throws IOException
     * @throws URISyntaxException
     */
    public abstract TRAR thumbnail(
        @NotNull final CreateThumbnailsTaskRequest createThumbnailsTaskRequest
    ) throws IOException, URISyntaxException;

    protected HttpUriRequest getThumbnailHttpUriRequest(
        @NotNull final CreateThumbnailsTaskRequest createThumbnailsTaskRequest
    ) throws IOException, URISyntaxException {
        final URI uri = getUri(ImmutableList.of(PATH_SEGMENT_CREATE_THUMBNAIL));
        final HttpEntity httpEntity = getHttpEntity(createThumbnailsTaskRequest);

        return getHttpUriRequest(HttpPost.class, uri, httpEntity);
    }
}
