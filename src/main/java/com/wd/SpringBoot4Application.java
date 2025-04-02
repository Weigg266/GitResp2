package com.wd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wd.mapper")
public class SpringBoot4Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot4Application.class, args);
    }

}
