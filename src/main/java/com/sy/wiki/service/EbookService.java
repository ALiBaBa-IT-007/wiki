package com.sy.wiki.service;

import com.sy.wiki.entity.Ebook;
import com.sy.wiki.mapper.EbookMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 李旺
 * @project_name wiki
 * @ClassName:EbookService
 * @company 思盈网络科技-技术部
 * @Level P6
 * @create 2022/2/9-10:55 AM
 * @Package com.sy.wiki.service
 * @Description: (用一句话描述该文件做什么)
 */
@Service
public class EbookService {
    @Resource
    private EbookMapper ebookMapper;
    public List<Ebook> list(){
        return ebookMapper.selectByExample(null);
    }
}
