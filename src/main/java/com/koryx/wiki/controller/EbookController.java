package com.koryx.wiki.controller;

import com.koryx.wiki.domain.Ebook;
import com.koryx.wiki.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
// @Controller
public class EbookController {

    @Resource
    private EbookService ebookService;

    @GetMapping("/ebook/list")
    public List<Ebook> list() {

        return ebookService.list();
    }
}
