package com.example.springbootaop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 姚飞虎
 * @Date: 2022/4/11 2:53 PM
 * @Description:
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/test")
    public String test(){
        return "test";
    }
}
