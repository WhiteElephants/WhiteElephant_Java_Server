package com.whiteelephant.nineplus.dao;

import com.whiteelephant.nineplus.beans.PostNode;
import com.whiteelephant.nineplus.pojo.PostNodeRecord;
import com.whiteelephant.nineplus.pojo.PostRecord;

/**
 * Created by gordon on 16/9/3.
 */
public interface Mapper {
    void insertPost(PostRecord postRecord);
    void insertPostNode(PostNodeRecord p);
}
