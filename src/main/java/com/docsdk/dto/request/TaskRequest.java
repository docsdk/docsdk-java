package com.docsdk.dto.request;

import com.docsdk.dto.Operation;

public abstract class TaskRequest extends Request {

    public abstract Operation getOperation();
}
