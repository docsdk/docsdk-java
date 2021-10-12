package com.docsdk.upload;

import com.aliyun.oss.OSSClient;
import com.aliyun.oss.event.ProgressListener;
import com.aliyun.oss.model.ObjectMetadata;
import com.aliyun.oss.model.PutObjectRequest;
import com.aliyun.oss.model.PutObjectResult;

import java.io.IOException;
import java.io.InputStream;

public class OSSUtil {

	public static final String DOCUMENT_TYPE = "pdf";

	public static final String SOURCE_TYPE = "source";

	public static final String IMAGES_BUCKET_NAME = "yuntu-images";

	private static final String OSS_DOCUMENTS_FOLDER = "documents";

	private static final String OSS_SOURCE_FOLDER = "source";

	private static final String OSS_ENDPOINT = "http://oss.aliyuncs.com/";

	private static final String DOCUMENTS_BUCKET_NAME = "yuntu-resources";

	private OSSClient client = null;

	public OSSUtil(String accessID, String accessKey, String securityToken) {
		client = new OSSClient(OSS_ENDPOINT, accessID, accessKey, securityToken);
	}

	public boolean uploadFile(String token, String title, final java.io.File file, final int length,
			ProgressListener progressListener) throws IOException {

		if (file == null) {
			return false;
		}

		try {
			ObjectMetadata objectMeta = new ObjectMetadata();
			String fileName;
			String bucketName;

			objectMeta.setContentLength(file.length());
			objectMeta.setContentType(MimeTypes.getMimeType(title));

			if (title.toLowerCase().endsWith(".pdf")) {
				String t = StringUtil.getFileName(title);
				String pdfFileName = (t == null ? null : java.net.URLEncoder.encode(t, "UTF-8"));

				if (pdfFileName == null || pdfFileName.length() <= 0) {
					pdfFileName = token;
				}

				objectMeta.setContentDisposition("attachment;filename*=UTF-8''" + pdfFileName + ".pdf");

				fileName = OSS_DOCUMENTS_FOLDER + "/" + token + "." + DOCUMENT_TYPE;
				bucketName = DOCUMENTS_BUCKET_NAME;
			} else {
				String sourceFileName = java.net.URLEncoder.encode(StringUtil.getFileName(title, false), "UTF-8");

				if (sourceFileName == null || sourceFileName.length() <= 0) {
					sourceFileName = token + "." + SOURCE_TYPE;
				}

				objectMeta.setContentDisposition("attachment;filename*=UTF-8''" + sourceFileName);

				fileName = OSS_SOURCE_FOLDER + "/" + token + "." + SOURCE_TYPE;

				bucketName = DOCUMENTS_BUCKET_NAME;
			}

			PutObjectResult result = client.putObject(new PutObjectRequest(bucketName, fileName, file, objectMeta)
					.<PutObjectRequest>withProgressListener(progressListener));

			return result.getETag() != null ? true : false;
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean uploadStream(String token, String title, final InputStream stream, ProgressListener progressListener)
			throws IOException {

		if (stream == null) {
			return false;
		}

		try {
			ObjectMetadata objectMeta = new ObjectMetadata();
			String fileName;
			String bucketName;

			objectMeta.setContentType(MimeTypes.getMimeType(title));

			if (title.toLowerCase().endsWith(".pdf")) {
				String t = StringUtil.getFileName(title);
				String pdfFileName = (t == null ? null : java.net.URLEncoder.encode(t, "UTF-8"));

				if (pdfFileName == null || pdfFileName.length() <= 0) {
					pdfFileName = token;
				}

				objectMeta.setContentDisposition("attachment;filename*=UTF-8''" + pdfFileName + ".pdf");

				fileName = OSS_DOCUMENTS_FOLDER + "/" + token + "." + DOCUMENT_TYPE;
				bucketName = DOCUMENTS_BUCKET_NAME;
			} else {
				String sourceFileName = java.net.URLEncoder.encode(StringUtil.getFileName(title, false), "UTF-8");

				if (sourceFileName == null || sourceFileName.length() <= 0) {
					sourceFileName = token + "." + SOURCE_TYPE;
				}

				objectMeta.setContentDisposition("attachment;filename*=UTF-8''" + sourceFileName);
				fileName = OSS_SOURCE_FOLDER + "/" + token + "." + SOURCE_TYPE;
				bucketName = DOCUMENTS_BUCKET_NAME;
			}

			PutObjectResult result = client.putObject(new PutObjectRequest(bucketName, fileName, stream, objectMeta)
					.<PutObjectRequest>withProgressListener(progressListener));

			return result.getETag() != null ? true : false;
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return false;
	}
}
