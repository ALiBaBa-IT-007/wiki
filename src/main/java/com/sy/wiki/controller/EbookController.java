package com.sy.wiki.controller;

import com.sy.wiki.common.CommonResp;
import com.sy.wiki.entity.Ebook;
import com.sy.wiki.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 李旺
 * @project_name wiki
 * @ClassName:EbookController
 * @company 思盈网络科技-技术部
 * @Level P6
 * @create 2022/2/9-10:57 AM
 * @Package com.sy.wiki.controller
 * @Description: (用一句话描述该文件做什么)
 */
@RestController
public class EbookController {
    @Resource
    private EbookService ebookService;
    @GetMapping("/ebook/list")
    public CommonResp list(){
        CommonResp<List<Ebook>> resp = new CommonResp<>();
        List<Ebook> list = ebookService.list();
        resp.setData(list);
        return resp;
    }
}
