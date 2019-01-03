package com.imooc.girl.exception;

import com.imooc.girl.enums.ResultEnum;

/**
 * @author 1639489689@qq.com
 * @date 2018/6/13 0013 上午 10:13
 */
public class GirlException extends RuntimeException{
    private Integer code;
    public GirlException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code=resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
