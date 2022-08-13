package com.koryx.wiki.controller;

import com.koryx.wiki.domain.Test;
import com.koryx.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
// @Controller
public class TestController {

    @Value("${test.hello:TEST}")    // ":" gives default value
    private String testHello;

    @Resource
    private TestService testService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!" + testHello;
    }

    @PostMapping("/hello/post")
    public String helloPost(String name) {
        return "Hello World! Post. " + name;
    }

    @GetMapping("/test/list")
    public List<Test> list() {

        return testService.list();
    }
}
