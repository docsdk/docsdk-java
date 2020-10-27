package com.docsdk.test.framework;

import com.docsdk.resource.AbstractResource;

public abstract class AbstractTest {

    public static final String API_URL = "https://api.sandbox.docsdk.com";
    public static final String API_KEY = "api-key";

    public static final String VALUE_AUTHORIZATION = AbstractResource.BEARER + " " + API_KEY;

    public static final long TIMEOUT = 300000L;
}
