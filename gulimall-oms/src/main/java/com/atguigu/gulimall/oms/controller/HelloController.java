package com.atguigu.gulimall.oms.controller;

import com.atguigu.gulimall.oms.feign.WorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Helin
 * @date 19/10/03 - 00:16
 */

@RestController
public class HelloController {

    @Autowired
    WorldService worldService;

/*
* feign是声明式调用
*
*
* */
    @GetMapping("/hello")
    public String hello(){
        String msg ="";
        //远程调用gulimall-pms服务的 /world 请求对应的方法。并接受返回值
        msg  = worldService.world();

        return "hello" + msg;
    }
}
