package com.koryx.wiki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

import javax.xml.ws.RequestWrapper;

@RestController
// @Controller
public class TestController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}
