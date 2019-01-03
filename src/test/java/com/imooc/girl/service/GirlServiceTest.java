package com.imooc.girl.service;

import com.imooc.girl.domain.Girl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author 1639489689@qq.com
 * @date 2018/6/13 0013 上午 11:16
 */
@RunWith(SpringRunner.class)  //表示在junit环境下跑
@SpringBootTest   //表示启动所有spring工程
public class GirlServiceTest {
    @Autowired
    private GirlService girlService;

    @Test
    public void findOne() {
        Girl girl=girlService.findOne(23);
        Assert.assertEquals(new Integer(15),girl.getAge());
    }
}