package com.koryx.wiki.service;

import com.koryx.wiki.domain.Ebook;
import com.koryx.wiki.domain.EbookExample;
import com.koryx.wiki.mapper.EbookMapper;
import com.koryx.wiki.req.EbookReq;
import com.koryx.wiki.resp.EbookResp;
import com.koryx.wiki.util.CopyUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EbookService {

    @Resource
    private EbookMapper ebookMapper;

    public List<EbookResp> list(EbookReq req) {
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%" + req.getName() + "%");
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);

        //List<EbookResp> respList = new ArrayList<>();
        //for (Ebook ebook : ebookList) {
        //    // EbookResp ebookResp = new EbookResp();
        //    // BeanUtils.copyProperties(ebook, ebookResp);
        //    EbookResp ebookResp = CopyUtil.copy(ebook, EbookResp.class);
        //    // item copy
        //    respList.add(ebookResp);
        //}

        // list copy
        List<EbookResp> list = CopyUtil.copyList(ebookList, EbookResp.class);

        return list;
    }
}
