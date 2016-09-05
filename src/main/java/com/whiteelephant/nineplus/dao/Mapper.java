package com.whiteelephant.nineplus.dao;

import com.whiteelephant.nineplus.pojo.Post;
import com.whiteelephant.nineplus.pojo.PostNode;

/**
 * Created by gordon on 16/9/3.
 */
public interface Mapper {
    void insertPost(Post post);

    void insertPostNode(PostNode postNode);
}
