package com.joyfey.telear;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.joyfey.telear.mapper")
public class DbApplication {


    public static void main(String[] args) {
        SpringApplication.run(DbApplication.class, args);
    }

}
