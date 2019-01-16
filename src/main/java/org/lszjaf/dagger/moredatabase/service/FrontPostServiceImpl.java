package org.lszjaf.dagger.moredatabase.service;

import org.lszjaf.dagger.moredatabase.bean.Front;
import org.lszjaf.dagger.moredatabase.bean.Post;
import org.lszjaf.dagger.moredatabase.config.DataSourceEnum;
import org.lszjaf.dagger.moredatabase.config.TargetDataSource;
import org.lszjaf.dagger.moredatabase.mapper.FrontMapper;
import org.lszjaf.dagger.moredatabase.mapper.PostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FrontPostServiceImpl {
    @Autowired
    PostMapper postMapper;

    @Autowired
    FrontMapper frontMapper;

    @TargetDataSource(DataSourceEnum.SLAVE)
    public Post getPost(String id) {
        return postMapper.selectById(Long.parseLong(id));
    }

    public Front getFront(String orderNo) {
        return frontMapper.selectByOrderNo(orderNo);
    }
}
