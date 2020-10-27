package com.docsdk.resource;

import com.docsdk.client.mapper.ObjectMapperProvider;
import com.docsdk.client.setttings.SettingsProvider;
import com.docsdk.dto.response.UserResponse;
import com.docsdk.dto.result.AbstractResult;
import com.google.common.collect.ImmutableList;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public abstract class AbstractUsersResource<URAR extends AbstractResult<UserResponse>> extends AbstractResource {

    public static final String PATH_SEGMENT_USERS = "users";
    public static final String PATH_SEGMENT_ME = "me";

    public AbstractUsersResource(
        final SettingsProvider settingsProvider, final ObjectMapperProvider objectMapperProvider
    ) {
        super(settingsProvider, objectMapperProvider);
    }

    /**
     * Show the current user. Requires the user.read scope.
     *
     * @return {@link URAR}
     * @throws IOException
     * @throws URISyntaxException
     */
    public abstract URAR me() throws IOException, URISyntaxException;

    protected HttpUriRequest getMeHttpUriRequest() throws URISyntaxException {
        final URI uri = getUri(ImmutableList.of(PATH_SEGMENT_USERS, PATH_SEGMENT_ME));
        return getHttpUriRequest(HttpGet.class, uri);
    }
}
