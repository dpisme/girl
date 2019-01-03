package com.imooc.girl.enums;

/**
 * @author 1639489689@qq.com
 * @date 2018/6/13 0013 上午 10:43
 */
public enum ResultEnum {
    UNKOWN_ERROR(-1,"未知错误"),
    PRIMARY_SCHOOL(100,"你可能还在上小学"),
    MIDDLE_SCHOOL(101,"你可能在上初中"),
    ;
    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
