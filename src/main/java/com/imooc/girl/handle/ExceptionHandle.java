package com.imooc.girl.handle;

import com.imooc.girl.domain.Result;
import com.imooc.girl.enums.ResultEnum;
import com.imooc.girl.exception.GirlException;
import com.imooc.girl.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author 1639489689@qq.com
 * @date 2018/6/13 0013 上午 10:01
 */
@RestControllerAdvice
public class ExceptionHandle {
    private final static Logger logger=LoggerFactory.getLogger(ExceptionHandle.class);
    @ExceptionHandler(value = Exception.class)
    public Result handle(Exception e){
        if(e instanceof GirlException){
            GirlException girlException= (GirlException) e;
            return ResultUtil.error(girlException.getCode(),girlException.getMessage());
        }
        logger.error("【系统异常】{}",e);
//        return ResultUtil.error(-1,"未知错误");
        return ResultUtil.error(ResultEnum.UNKOWN_ERROR.getCode(),ResultEnum.UNKOWN_ERROR.getMsg());
    }
}
