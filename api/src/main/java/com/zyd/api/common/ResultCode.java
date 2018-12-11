package com.zyd.api.common;

public enum ResultCode {
    SUCCESS(10000, "成功"),
    FAIL(10001, "失败");

    private int code;
    private String message;

    ResultCode(int code, String message) {
        this.message = message;
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}
