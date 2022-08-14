package com.koryx.wiki.controller;

import com.koryx.wiki.domain.Demo;
import com.koryx.wiki.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
// @Controller
public class DemoController {

    @Resource
    private DemoService demoService;

    @GetMapping("/demo/list")
    public List<Demo> list() {

        return demoService.list();
    }
}
