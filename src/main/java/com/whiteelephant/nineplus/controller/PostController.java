package com.whiteelephant.nineplus.controller;

import com.whiteelephant.nineplus.dao.Mapper;
import com.whiteelephant.nineplus.network.PostResponse;
import com.whiteelephant.nineplus.pojo.Post;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by gordon on 16/9/3.
 */
@Controller
@RequestMapping("/")
public class PostController {

    @Autowired
    Mapper dao;

    @Autowired
    SqlSessionFactory sf;

    @ResponseBody
    @RequestMapping("/index")
    public String hello() {
        return "hello world";
    }

    @ResponseBody
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public PostResponse insertPost(@RequestBody Post post) {
        try {
            SqlSession session = sf.openSession();
            session.getMapper(Mapper.class).insertPost(post);
            session.commit();
            return new PostResponse(true, "");
        } catch (Exception e) {
            e.printStackTrace();
            return new PostResponse(false, "");
        }

    }
}
