package org.lszjaf.dagger.moredatabase.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.lszjaf.dagger.moredatabase.bean.Post;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface PostMapper {
    Post selectById(Long id);

    boolean deleteById(Long id);

    Integer updateById(Post post);

    void insert(Post post);
}
