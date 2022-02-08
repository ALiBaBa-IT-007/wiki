package com.sy.wiki.service;

import com.sy.wiki.entity.Test;
import com.sy.wiki.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 李旺
 * @project_name wiki
 * @ClassName:TestService
 * @company 思盈网络科技-技术部
 * @Level P6
 * @create 2022/2/8-11:21 PM
 * @Package com.sy.wiki.service
 * @Description: (用一句话描述该文件做什么)
 */
@Service
public class TestService {
    @Resource
    private TestMapper testMapper;
    public List<Test> list(){
        return testMapper.list();
    }
}
