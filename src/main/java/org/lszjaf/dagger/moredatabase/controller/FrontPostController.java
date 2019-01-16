package org.lszjaf.dagger.moredatabase.controller;

import org.lszjaf.dagger.moredatabase.bean.Front;
import org.lszjaf.dagger.moredatabase.bean.Post;
import org.lszjaf.dagger.moredatabase.config.DataSourceEnum;
import org.lszjaf.dagger.moredatabase.config.TargetDataSource;
import org.lszjaf.dagger.moredatabase.mapper.FrontMapper;
import org.lszjaf.dagger.moredatabase.mapper.PostMapper;
import org.lszjaf.dagger.moredatabase.service.FrontPostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/fp/")
public class FrontPostController {

    @Autowired
    private FrontPostServiceImpl frontPostService;


    @RequestMapping(value = "/show/{id}/{orderNo}")
    public String getFP(@PathVariable String id,@PathVariable String orderNo){
        Post post = frontPostService.getPost(id);
        Front front =frontPostService.getFront(orderNo);
        return post.toString()+"------"+front.toString();
    }

}
