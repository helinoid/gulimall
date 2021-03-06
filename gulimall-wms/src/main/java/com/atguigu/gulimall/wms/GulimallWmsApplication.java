package com.atguigu.gulimall.wms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.atguigu.gulimall.wms.dao")
@SpringBootApplication
public class GulimallWmsApplication {

    public static void main(String[] args) {

        SpringApplication.run(GulimallWmsApplication.class, args);
    }

}
