package com.atguigu.gulimall.ums;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.atguigu.gulimall.ums.dao")
@SpringBootApplication
public class GulimallUmsApplication {

    public static void main(String[] args) {

        SpringApplication.run(GulimallUmsApplication.class, args);
    }

}
