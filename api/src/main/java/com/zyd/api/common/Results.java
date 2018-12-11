package com.zyd.api.common;

public class Results {
    private Results() {
    }

    public static ApiResult fail() {
        return new ApiResult(ResultCode.FAIL.getCode(), ResultCode.FAIL.getMessage());
    }

    public static ApiResult fail(String message) {
        return new ApiResult(ResultCode.FAIL.getCode(), message);
    }

    public static <T> ApiResult<T> fail(T data) {
        return new ApiResult(ResultCode.FAIL.getCode(), data);
    }

    public static <T> ApiResult<T> fail(String message, T data) {
        return new ApiResult(ResultCode.FAIL.getCode(), message, data);
    }

    public static ApiResult success() {
        return new ApiResult(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage());
    }

    public static ApiResult success(String message) {
        return new ApiResult(ResultCode.SUCCESS.getCode(), message);
    }

    public static <T> ApiResult<T> success(T data) {
        return new ApiResult(ResultCode.SUCCESS.getCode(), data);
    }

    public static <T> ApiResult<T> success(String message, T data) {
        return new ApiResult(ResultCode.SUCCESS.getCode(), message, data);
    }

    public static <T> ApiResult<T> custom(int code, String message, T data) {
        return new ApiResult(code, message, data);
    }

    public static <T> ApiResult<T> custom(ResultCode gc) {
        return new ApiResult(gc.getCode(), gc.getMessage(), null);
    }

    public static <T> ApiResult<T> custom(int code, String message) {
        return new ApiResult(code, message, null);
    }

    public static <T> boolean isSuccess(ApiResult<T> result) {
        if (result == null) {
            return false;
        } else {
            return result.getE().getErrid() == ResultCode.SUCCESS.getCode();
        }
    }
}