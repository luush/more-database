package org.lszjaf.dagger.moredatabase.controller;

import org.lszjaf.dagger.moredatabase.bean.Front;
import org.lszjaf.dagger.moredatabase.mapper.FrontMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping(value = "/front/")
public class FrontController {
    @Autowired
    FrontMapper frontMapper;

    @RequestMapping(value = "/show/{orderNo}")
    public Front getFront(@PathVariable String orderNo) {
        return frontMapper.selectByOrderNo(orderNo);
    }


    @RequestMapping(value = "/delete/{orderNo}")
    public Boolean delete(@PathVariable String orderNo) {
        return frontMapper.deleteByOrderNo(orderNo);
    }

    @RequestMapping(value = "/update/{id}")
    public Integer update(@PathVariable Long id) {
        Front front = new Front();
        front.setId(id);
        front.setUuid("55555");
        return frontMapper.updateById(front);
    }

    @RequestMapping(value = "/insert/")
    public String insert() {
        Front front = new Front();
        front.setCreateTime(new Date());
        front.setId(99999L);
        front.setOrderNo("8888888888888xxxxx");
        front.setUpdateTime(new Date());
        front.setUuid("666666666666666xdd");
        frontMapper.insert(front);
        return "insert";
    }
}
