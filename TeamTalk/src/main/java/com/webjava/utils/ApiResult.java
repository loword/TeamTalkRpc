package com.webjava.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.webjava.enums.global.ApiResultCodeEnum;


/**
 * <p>
 * 返回结果
 * </p>
 *
 * @author lanjerry
 * @since 2019-09-03
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResult<T> extends BaseEntity {

    /**
     * 响应状态回执码
     */
    protected long code;

    /**
     * 响应回执消息
     */
    protected String msg;

    /**
     * 数据体
     */
    protected T data;

    /**
     * 响应时间戳
     */
    protected final long timestamps = System.currentTimeMillis();

    public static ApiResult<?> success() {
        return restResult(ApiResultCodeEnum.SUCCESS, null);
    }

    public static <T> ApiResult<T> success(T data) {
        return restResult(ApiResultCodeEnum.SUCCESS, data);
    }

    public static ApiResult<?> systemError(String message) {
        return restResult(ApiResultCodeEnum.SYSTEM_ERROR.value, message, null);
    }

    public static ApiResult<?> argError(String message) {
        return restResult(ApiResultCodeEnum.ARG_ERROR.value, message, null);
    }

    public static <T> ApiResult<T> restResult(ApiResultCodeEnum rEnum, T data) {
        return restResult(rEnum.value, rEnum.text, data);
    }

    private static <T> ApiResult<T> restResult(long code, String msg, T data) {
        ApiResult<T> apiResult = new ApiResult<>();
        apiResult.setCode(code);
        apiResult.setMsg(msg);
        apiResult.setData(data);
        return apiResult;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public long getTimestamps() {
        return timestamps;
    }
}