package com.docsdk.upload;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;

public class HttpUtils {

    public static synchronized String get(String host, String path, Map<String, String> headers, Map<String, String> querys) {

        try {
            String url = buildUrl(host, path, querys);
            URL httpUrl = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) httpUrl.openConnection();

            if (headers != null) {
                for (Map.Entry<String, String> header : headers.entrySet()) {
                    conn.setRequestProperty(header.getKey(), header.getValue());
                }
            }

            if (conn.getResponseCode() == 200) {
                return getResponseAsString(conn);
            } else {
                return null;
            }
        } catch (IOException e) {

            e.printStackTrace();
            return null;
        }
    }

    public static synchronized String post(String host, String path, Map<String, String> headers,
                                           Map<String, String> querys, InputStream inStream, String mimeType) {

        try {
            String url = buildUrl(host, path, querys);
            URL httpUrl = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) httpUrl.openConnection();

            conn.setDoInput(true);
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", mimeType);
            for (Map.Entry<String, String> header : headers.entrySet()) {
                conn.setRequestProperty(header.getKey(), header.getValue());
            }

            BufferedOutputStream out = new BufferedOutputStream(conn.getOutputStream());

            byte[] bytes = new byte[1024];
            int numReadByte = 0;
            while ((numReadByte = inStream.read(bytes, 0, 1024)) > 0) {

                out.write(bytes, 0, numReadByte);
            }
            out.flush();
            inStream.close();
            if (conn.getResponseCode() == 200) {
                return getResponseAsString(conn);
            } else {
                return null;
            }
        } catch (IOException e) {
            e.printStackTrace();

            return null;
        }
    }

    private static String buildUrl(String host, String path, Map<String, String> querys)
            throws UnsupportedEncodingException {

        StringBuilder sbUrl = new StringBuilder();

        sbUrl.append(host);
        sbUrl.append(path);
        if (null != querys) {
            StringBuilder sbQuery = new StringBuilder();

            for (Map.Entry<String, String> query : querys.entrySet()) {
                if (query != null && query.getValue() != null) {
                    if (0 < sbQuery.length()) {
                        sbQuery.append("&");
                    }
                    sbQuery.append(query.getKey());
                    sbQuery.append("=");
                    sbQuery.append(URLEncoder.encode(query.getValue(), "utf-8"));
                }
            }
            if (0 < sbQuery.length()) {
                sbUrl.append("?").append(sbQuery);
            }
        }
        return sbUrl.toString();
    }

    private static String getResponseAsString(HttpURLConnection conn) throws IOException {

        InputStream es = conn.getErrorStream();

        if (es == null) {
            return getStreamAsString(conn.getInputStream(), "UTF-8");
        } else {
            String msg = getStreamAsString(es, "UTF-8");
            throw new IOException(conn.getResponseCode() + ":" + msg);
        }
    }

    private static String getStreamAsString(InputStream stream, String charset) throws IOException {

        try {
            int count;
            char[] chars = new char[256];
            StringWriter writer = new StringWriter();
            BufferedReader reader = new BufferedReader(new InputStreamReader(stream, charset));

            while ((count = reader.read(chars)) > 0) {
                writer.write(chars, 0, count);
            }
            return writer.toString();
        } finally {
            if (stream != null) {
                stream.close();
            }
        }
    }

}
