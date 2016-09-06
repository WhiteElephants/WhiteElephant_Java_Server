package com.whiteelephant.nineplus.pojo;

import org.apache.ibatis.type.Alias;

/**
 * Created by gordon on 9/6/16.
 */
@Alias("PostRecord")
public class PostRecord {
    private String postId;
    private String author;
    private String title;
    private int wordCount;
    private String category;

    public PostRecord() {
    }

    public PostRecord(String postId, String author, String title,  int wordCount, String category) {
        this.postId = postId;
        this.author = author;
        this.title = title;
        this.wordCount = wordCount;
        this.category = category;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getWordCount() {
        return wordCount;
    }

    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
