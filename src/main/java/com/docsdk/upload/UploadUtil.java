package com.docsdk.upload;

import com.aliyun.oss.event.ProgressListener;
import net.sf.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

public class UploadUtil {

	private static String generateUUID() {
		return Base62Util.convertTo62(UUID.randomUUID().toString());
	}

	public static String uploadToOSS(File file) throws IOException {
		String token = generateUUID();

		int length = (int) file.length();
		String name = file.getName();

		String body = HttpUtils.get("https://server.9yuntu.cn", "/execute/UploadFileAction", null, null);

		if (body != null) {
			JSONObject resJsonObj = JsonUtil.parse(body);
			JSONObject jsonObj = null;

			jsonObj = resJsonObj.getJSONObject("authorizationInfo");

			if (jsonObj != null) {
				String accessKeyId = JsonUtil.getString(jsonObj, "AccessKeyId");
				String accessKeySecret = JsonUtil.getString(jsonObj, "AccessKeySecret");
				String securityToken = JsonUtil.getString(jsonObj, "SecurityToken");
				OSSUtil ossUtil = new OSSUtil(accessKeyId, accessKeySecret, securityToken);

				ossUtil.uploadFile(token, name, file, length, new ProgressListener() {
					@Override
					public void progressChanged(com.aliyun.oss.event.ProgressEvent progressEvent) {

					}
				});
				return "yuntu://"+token;
			} else {
				String reason = JsonUtil.getString(resJsonObj, "failReason");

				if (reason == null || reason.length() <= 0) {
					reason = "文件上传失败。";
				}
				return null;
			}
		}
		return null;
	}

	public static String uploadToOSS(InputStream inputStream, String fileName)
			throws IOException {

		String token = generateUUID();

		String body = HttpUtils.get("https://server.9yuntu.cn", "/execute/UploadFileAction", null, null);

		if (body != null) {
			JSONObject resJsonObj = JsonUtil.parse(body);
			JSONObject jsonObj = null;

			jsonObj = resJsonObj.getJSONObject("authorizationInfo");

			if (jsonObj != null) {
				String accessKeyId = JsonUtil.getString(jsonObj, "AccessKeyId");
				String accessKeySecret = JsonUtil.getString(jsonObj, "AccessKeySecret");
				String securityToken = JsonUtil.getString(jsonObj, "SecurityToken");
				OSSUtil ossUtil = new OSSUtil(accessKeyId, accessKeySecret, securityToken);

				ossUtil.uploadStream(token, fileName, inputStream, new ProgressListener() {
					@Override
					public void progressChanged(com.aliyun.oss.event.ProgressEvent progressEvent) {

					}
				});
				return "yuntu://"+token;
			} else {
				String reason = JsonUtil.getString(resJsonObj, "failReason");

				if (reason == null || reason.length() <= 0) {
					reason = "文件上传失败。";
				}
				return null;
			}
		}
		return null;
	}
}
