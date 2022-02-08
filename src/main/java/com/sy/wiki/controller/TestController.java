package com.sy.wiki.controller;

import com.sy.wiki.entity.Test;
import com.sy.wiki.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 李旺
 * @project_name wiki
 * @ClassName:TestController
 * @company 思盈网络科技-技术部
 * @Level P6
 * @create 2022/2/8-7:41 PM
 * @Package com.sy.wiki.controller
 * @Description: (用一句话描述该文件做什么)
 */
@RestController // 返回字符串
public class TestController {
    @RequestMapping("/hello")
    public String hello(){
        return "测试接口";
    }
    @Resource
    private TestService testService;
    @GetMapping("/test/list")
    public List<Test> list(){
        return testService.list();
    }
}
