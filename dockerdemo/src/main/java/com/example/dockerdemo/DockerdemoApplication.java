package com.example.dockerdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//@SpringBootApplication(scanBasePackages="com.example.dockerdemo.controller")
@SpringBootApplication
@MapperScan("com.example.dockerdemo.mapper")
public class DockerdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerdemoApplication.class, args);
    }

}
