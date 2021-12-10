package com.joyfey.telear.controller;

import com.joyfey.telear.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @Autowired
    private UserMapper userMapper;
    /**
     * 在这里使用@RequestMapping建立映射请求:http://127.0.0.1:8080/hello
     */
    @RequestMapping("/hello")
    public String hello(){
        System.out.println(userMapper);
        return "hello";

    }
}
