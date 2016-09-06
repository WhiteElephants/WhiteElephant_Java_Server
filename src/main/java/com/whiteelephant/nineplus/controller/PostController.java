package com.whiteelephant.nineplus.controller;

import com.alibaba.fastjson.JSON;
import com.whiteelephant.nineplus.beans.PostRequestType;
import com.whiteelephant.nineplus.dao.Mapper;
import com.whiteelephant.nineplus.network.PostResponse;
import com.whiteelephant.nineplus.beans.PostNode;
import com.whiteelephant.nineplus.pojo.PostNodeRecord;
import com.whiteelephant.nineplus.pojo.PostRecord;
import com.whiteelephant.nineplus.utils.UuidUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public PostResponse insertPost(@RequestBody PostRequestType post) {
        try {
            SqlSession session = sf.openSession();
            Mapper mapper = session.getMapper(Mapper.class);
            String distinctId = UuidUtil.generateId();
            mapper.insertPost(new PostRecord(distinctId, post.getAuthor(), post.getTitle(), post.getWordCount(), post.getCategory()));
            for (PostNode postNode : post.nodes) {
               PostNodeRecord record= new PostNodeRecord(distinctId, postNode.getNodeType(), postNode.isSubtitle(),
                        postNode.getMediaId(), postNode.getContent(), JSON.toJSONString(postNode.getMediaIds()));
                mapper.insertPostNode(record);
            }
            session.commit();
            return new PostResponse(true, "");
        } catch (Exception e) {
            e.printStackTrace();
            return new PostResponse(false, "");
        }

    }
}
