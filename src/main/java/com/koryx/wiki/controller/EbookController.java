package com.koryx.wiki.controller;

import com.koryx.wiki.req.EbookReq;
import com.koryx.wiki.resp.CommonResp;
import com.koryx.wiki.resp.EbookResp;
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
    public CommonResp list(EbookReq req) {

        CommonResp<List<EbookResp>> resp = new CommonResp<>();
        List<EbookResp> list = ebookService.list(req);
        resp.setContent(list);
        return resp;
    }
}
