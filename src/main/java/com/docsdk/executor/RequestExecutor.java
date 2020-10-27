package com.docsdk.executor;

import com.docsdk.client.http.CloseableHttpClientProvider;
import com.docsdk.dto.result.Result;
import com.docsdk.extractor.ResultExtractor;
import com.fasterxml.jackson.core.type.TypeReference;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class RequestExecutor extends AbstractRequestExecutor<CloseableHttpClientProvider, CloseableHttpClient> {

    public RequestExecutor(
        final ResultExtractor resultExtractor,
        final CloseableHttpClientProvider closeableHttpClientProvider
    ) throws IOException {
        super(resultExtractor, closeableHttpClientProvider);
    }

    public <T> Result<T> execute(
        @NotNull final HttpUriRequest httpUriRequest, @NotNull final TypeReference<T> typeReference
    ) throws IOException {
        return getResultExtractor().extract(getCloseableHttpClient().execute(httpUriRequest), typeReference);
    }
}
