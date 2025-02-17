package com.itbaizhan.springbootandmybatisdemo1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.itbaizhan.springbootandmybatisdemo1.mapper")
public class SpringbootAndMybatisdemo1Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootAndMybatisdemo1Application.class, args);
    }

}
