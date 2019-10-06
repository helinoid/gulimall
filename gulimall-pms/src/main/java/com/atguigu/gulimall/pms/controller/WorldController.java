package com.atguigu.gulimall.pms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Helin
 * @date 19/10/03 - 00:24
 */

@RestController
public class WorldController {

    @GetMapping("/world")
    public String world(){

        //省略service调用
        String msg = "world";
        return msg;
    }
}
