package com.sy.wiki.controller;

import com.sy.wiki.entity.Demo;
import com.sy.wiki.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 李旺
 * @project_name wiki
 * @ClassName:DemoController
 * @company 思盈网络科技-技术部
 * @Level P6
 * @create 2022/2/8-11:59 PM
 * @Package com.sy.wiki.controller
 * @Description: (用一句话描述该文件做什么)
 */
@RestController
public class DemoController {
    @Resource
    private DemoService demoService;
    @GetMapping("demo/list")
    public List<Demo> list(){
        return demoService.list();
    }
}
