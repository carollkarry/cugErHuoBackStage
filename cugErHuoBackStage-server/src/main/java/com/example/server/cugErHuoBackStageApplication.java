package com.example.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
启动类
 */
@SpringBootApplication
@MapperScan("com.example.server.mapper")
public class cugErHuoBackStageApplication {
    public static void main(String[] args){
        SpringApplication.run(cugErHuoBackStageApplication.class,args);
    }
}
