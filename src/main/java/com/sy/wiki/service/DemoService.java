package com.sy.wiki.service;

import com.sy.wiki.entity.Demo;
import com.sy.wiki.mapper.DemoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 李旺
 * @project_name wiki
 * @ClassName:DemoService
 * @company 思盈网络科技-技术部
 * @Level P6
 * @create 2022/2/8-11:56 PM
 * @Package com.sy.wiki.service
 * @Description: (用一句话描述该文件做什么)
 */
@Service
public class DemoService {
    @Resource
    private DemoMapper demoMapper;
    public List<Demo> list(){
        return demoMapper.selectByExample(null);
    }
}
