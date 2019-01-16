package org.lszjaf.dagger.moredatabase.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.lszjaf.dagger.moredatabase.bean.Front;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface FrontMapper {
    Front selectByOrderNo(String orderNo);

    boolean deleteByOrderNo(String OrderNo);

    Integer updateById(Front front);

    void insert(Front front);
}
