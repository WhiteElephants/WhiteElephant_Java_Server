package com.whiteelephant.nineplus.dao;

/**
 * Created by gordon on 16/9/3.
 */
public interface Mapper {
    void insertPost(String postId, String author, String title, int readCount, int wordCount, String category);

    void insertPostNode(String postId, int nodeType, boolean isSubtitle, String mediaId, String content, String mediaIds);
}
