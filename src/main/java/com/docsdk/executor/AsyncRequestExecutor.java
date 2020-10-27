package com.docsdk.executor;

import com.docsdk.client.http.AsyncCloseableHttpClientProvider;
import com.docsdk.dto.result.AsyncResult;
import com.docsdk.dto.result.FutureAsyncResult;
import com.docsdk.extractor.ResultExtractor;
import com.fasterxml.jackson.core.type.TypeReference;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.concurrent.FutureCallback;
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.util.concurrent.Future;

public class AsyncRequestExecutor extends AbstractRequestExecutor<AsyncCloseableHttpClientProvider, CloseableHttpAsyncClient> {

    public AsyncRequestExecutor(
        final ResultExtractor resultExtractor,
        final AsyncCloseableHttpClientProvider asyncCloseableHttpClientProvider
    ) throws IOException {
        this(resultExtractor, asyncCloseableHttpClientProvider, null);
    }

    public AsyncRequestExecutor(
        final ResultExtractor resultExtractor,
        final AsyncCloseableHttpClientProvider asyncCloseableHttpClientProvider,
        @Nullable final FutureCallback<HttpResponse> httpResponseFutureCallback
    ) throws IOException {
        super(resultExtractor, asyncCloseableHttpClientProvider);
    }

    public <T> AsyncResult<T> execute(@NotNull final HttpUriRequest httpUriRequest, @NotNull final TypeReference<T> typeReference) throws IOException {
        final Future<HttpResponse> httpResponseFuture = getCloseableHttpClient().execute(httpUriRequest, null);

        return FutureAsyncResult.<T>builder().resultExtractor(getResultExtractor()).future(httpResponseFuture).typeReference(typeReference).build();
    }
}
