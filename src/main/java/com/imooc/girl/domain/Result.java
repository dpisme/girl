package com.imooc.girl.domain;

/**
 * http请求返回最外层对象
 * @author 1639489689@qq.com
 * @date 2018/6/12 0012 下午 10:55
 */
public class Result<T> {
    //错误码
    private Integer code;

    //提示信息
    private String msg;

    //具体的内容
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
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
}
