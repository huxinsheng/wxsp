package com.wxsp.core.exception;

import com.wxsp.result.ResponseInfo;

/**
 * @author HuXinsheng
 */
public class RmsException extends RuntimeException {
    private ResponseInfo responseInfo;

    public RmsException(ResponseInfo responseInfo) {
        this.responseInfo = responseInfo;
    }

    public ResponseInfo getResponseInfo() {
        return responseInfo;
    }

    public void setResponseInfo(ResponseInfo responseInfo) {
        this.responseInfo = responseInfo;
    }
}
