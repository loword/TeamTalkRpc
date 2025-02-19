package com.webjava.enums.global;

/**
 * <p>
 * api响应状态码枚举
 * </p>
 *
 * @author lanjerry
 * @since 2019-09-03
 */
public enum ApiResultCodeEnum {
    SUCCESS(200, "成功"),
    FAIL(201, "操作失败"),
    SYSTEM_ERROR(202, "系统异常"),
    NOT_SING_IN(203, "用户未登录或身份异常"),
    ARG_ERROR(400, "参数错误"),
    UN_AUTHORIZED(401, "权限不足");

    public final Integer value;

    public final String text;

    ApiResultCodeEnum(Integer value, String text) {
        this.value = value;
        this.text = text;
    }

}