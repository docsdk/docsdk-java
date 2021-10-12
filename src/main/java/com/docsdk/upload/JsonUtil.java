package com.docsdk.upload;

import net.sf.json.JSONObject;

public class JsonUtil {

	public static JSONObject parse(String jsonStr) {
		if(jsonStr == null){
			return null;
		}
		if (!jsonStr.equals("") && !jsonStr.equals("{}")) {
			return JSONObject.fromObject(jsonStr);
		}
		return new JSONObject();
	}

	public static String getString(final JSONObject o, final String key) {
		String value = null;

		if (o != null && key != null && o.containsKey(key)) {
			Object obj = o.get(key);

			if (obj instanceof JSONObject) {
				if (!((JSONObject) obj).isNullObject()) {
					value = obj.toString();
				}
			} else if (obj instanceof String) {
				value = (String) obj;
			} else if (obj != null) {
				value = obj.toString();
			}
		}
		return value;
	}
}
