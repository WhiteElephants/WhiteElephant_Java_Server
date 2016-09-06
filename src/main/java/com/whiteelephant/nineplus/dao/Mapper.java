package com.whiteelephant.nineplus.dao;

import com.whiteelephant.nineplus.records.PostNodeRecord;
import com.whiteelephant.nineplus.records.PostRecord;

/**
 * Created by gordon on 16/9/3.
 */
public interface Mapper {
    void insertPost(PostRecord postRecord);

    void insertPostNode(PostNodeRecord postNodeRecord);
}
