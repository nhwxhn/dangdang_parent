package com.test.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: dangdang_parent
 * @author: yanye
 * @description:
 * @created: 2021/04/25 22:57
 */
@RefreshScope
@RestController
public class BookController {

    @Value("${server.port}")
    private String name;

    @GetMapping("/test")
    public String demo() {
        System.out.println("test ok ~~~");
        return name;
    }

    @GetMapping("/test1")
    public String demo1() {
        System.out.println("test1");
        return "test1";
    }
}
