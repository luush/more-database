package org.lszjaf.dagger.moredatabase.controller;

import org.lszjaf.dagger.moredatabase.bean.Post;
import org.lszjaf.dagger.moredatabase.config.DataSourceEnum;
import org.lszjaf.dagger.moredatabase.config.TargetDataSource;
import org.lszjaf.dagger.moredatabase.mapper.PostMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/post/")
public class PostController {
    private static final Logger logger = LoggerFactory.getLogger(PostController.class);

    @Autowired
    PostMapper postMapper;

    @TargetDataSource(DataSourceEnum.SLAVE)
    @RequestMapping(value = "/show/{id}")
    public Post getFront(@PathVariable String id) {
        return postMapper.selectById(Long.parseLong(id));
    }

    @TargetDataSource(DataSourceEnum.SLAVE)
    @RequestMapping(value = "/delete/{id}")
    public Boolean delete(@PathVariable String id) {
        return postMapper.deleteById(Long.parseLong(id));
    }

    @TargetDataSource(DataSourceEnum.SLAVE)
    @RequestMapping(value = "/update/{id}")
    public Integer update(@PathVariable Long id) {
        Post post = new Post();
        post.setId(id);
        post.setChannelId("999");
        return postMapper.updateById(post);
    }

    @TargetDataSource(DataSourceEnum.SLAVE)
    @RequestMapping(value = "/insert/")
    public String insert() {
        Post post = new Post();
        post.setChannelId("8888888888888xxxxx");
        post.setId(77777L);
        post.setClientType(121);
        post.setCustomerType(213);
        post.setFinancialProductId("897");
        post.setOperationSubType(2213);
        post.setOperationType(43);
        postMapper.insert(post);
        return "insert";
    }
}
