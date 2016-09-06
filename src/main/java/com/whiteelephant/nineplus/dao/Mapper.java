package com.whiteelephant.nineplus.dao;

<<<<<<< HEAD
import com.whiteelephant.nineplus.pojo.Post;
import com.whiteelephant.nineplus.pojo.PostNode;
=======
import com.whiteelephant.nineplus.records.PostNodeRecord;
import com.whiteelephant.nineplus.records.PostRecord;
>>>>>>> b34715323fe2bc68c854c18657cf9b05be5d43f6

/**
 * Created by gordon on 16/9/3.
 */
public interface Mapper {
<<<<<<< HEAD
    void insertPost(Post p);

    void insertPostNode(PostNode p);
=======
    void insertPost(PostRecord postRecord);

    void insertPostNode(PostNodeRecord postNodeRecord);
>>>>>>> b34715323fe2bc68c854c18657cf9b05be5d43f6
}
