package com.docsdk.resource.sync;

import com.docsdk.client.mapper.ObjectMapperProvider;
import com.docsdk.client.setttings.SettingsProvider;
import com.docsdk.dto.request.AzureBlobExportRequest;
import com.docsdk.dto.request.GoogleCloudStorageExportRequest;
import com.docsdk.dto.request.OpenStackExportRequest;
import com.docsdk.dto.request.S3ExportRequest;
import com.docsdk.dto.request.SftpExportRequest;
import com.docsdk.dto.request.UrlExportRequest;
import com.docsdk.dto.response.TaskResponse;
import com.docsdk.dto.result.Result;
import com.docsdk.executor.RequestExecutor;
import com.docsdk.resource.AbstractExportFilesResource;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.net.URISyntaxException;

@Slf4j
public class ExportFilesResource extends AbstractExportFilesResource<Result<TaskResponse>> {

    private final RequestExecutor requestExecutor;

    public ExportFilesResource(
        final SettingsProvider settingsProvider,
        final ObjectMapperProvider objectMapperProvider, final RequestExecutor requestExecutor
    ) {
        super(settingsProvider, objectMapperProvider);

        this.requestExecutor = requestExecutor;
    }

    @Override
    public Result<TaskResponse> url(
        @NotNull final UrlExportRequest urlExportRequest
    ) throws IOException, URISyntaxException {
        return requestExecutor.execute(getUrlHttpUriRequest(urlExportRequest), TASK_RESPONSE_TYPE_REFERENCE);
    }

    @Override
    public Result<TaskResponse> s3(
        @NotNull final S3ExportRequest s3ExportRequest
    ) throws IOException, URISyntaxException {
        return requestExecutor.execute(getS3HttpUriRequest(s3ExportRequest), TASK_RESPONSE_TYPE_REFERENCE);
    }

    @Override
    public Result<TaskResponse> azureBlob(
        @NotNull final AzureBlobExportRequest azureBlobExportRequest
    ) throws IOException, URISyntaxException {
        return requestExecutor.execute(getAzureBlobHttpUriRequest(azureBlobExportRequest), TASK_RESPONSE_TYPE_REFERENCE);
    }

    @Override
    public Result<TaskResponse> googleCloudStorage(
        @NotNull final GoogleCloudStorageExportRequest googleCloudStorageExportRequest
    ) throws IOException, URISyntaxException {
        return requestExecutor.execute(getGoogleCloudStorageHttpUriRequest(googleCloudStorageExportRequest), TASK_RESPONSE_TYPE_REFERENCE);
    }

    @Override
    public Result<TaskResponse> openStack(
        @NotNull final OpenStackExportRequest openStackExportRequest
    ) throws IOException, URISyntaxException {
        return requestExecutor.execute(getOpenStackStorageHttpUriRequest(openStackExportRequest), TASK_RESPONSE_TYPE_REFERENCE);
    }

    @Override
    public Result<TaskResponse> sftp(
        @NotNull final SftpExportRequest sftpExportRequest
    ) throws IOException, URISyntaxException {
        return requestExecutor.execute(getSftpStorageHttpUriRequest(sftpExportRequest), TASK_RESPONSE_TYPE_REFERENCE);
    }

    @Override
    public void close() throws IOException {
        requestExecutor.close();
    }
}
