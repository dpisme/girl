package com.imooc.girl.controller;

import com.imooc.girl.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 1639489689@qq.com
 * @date 2018/6/11 0011 下午 8:35
 */
@RestController
public class HelloController {

   @Autowired
   private GirlProperties girlProperties;
    @RequestMapping(value = "/say/{id}",method = RequestMethod.POST)
    public String say(@PathVariable("id") Integer id){
//        return girlProperties.getCupSize()+girlProperties.getAge();
        return "id: "+id;
    }

    @RequestMapping(value = "/say2",method = RequestMethod.GET)
    public String say1(@RequestParam("id") Integer id){
        return "id: "+id;
    }

    @RequestMapping(value ="/say3",method = RequestMethod.GET)
    public String say2(@RequestParam(value = "id",required = false,defaultValue ="0") Integer id){
        return "id: "+id;
    }
    @GetMapping(value = "/say4")
    public String say3(@RequestParam(value = "id",required = false,defaultValue ="0") Integer id){
        return "id: "+id;
    }

}
