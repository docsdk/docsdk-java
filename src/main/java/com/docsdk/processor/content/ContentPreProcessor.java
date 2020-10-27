package com.docsdk.processor.content;

import java.io.IOException;
import java.io.InputStream;

public interface ContentPreProcessor {

    String preProcess(final InputStream inputStream) throws IOException;
}
