package com.whiteelephant.nineplus.pojo;

import org.apache.ibatis.type.Alias;

import java.sql.Timestamp;

/**
 * Created by gordon on 16/9/3.
 */
@Alias("Post")
public class Post {
    private Timestamp publishTime;
    private String author;
    private String title;
    private String serializedData;
    private int readCount;
    private int wordCount;
    private String category;

    public Post() {
    }

    public Post(Timestamp publishTime, String author, String title, String serializedData, int readCount, int wordCount, String category) {
        this.publishTime = publishTime;
        this.author = author;
        this.title = title;
        this.serializedData = serializedData;
        this.readCount = readCount;
        this.wordCount = wordCount;
        this.category = category;
    }

    public Timestamp getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Timestamp publishTime) {
        this.publishTime = publishTime;
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

    public String getSerializedData() {
        return serializedData;
    }

    public void setSerializedData(String serializedData) {
        this.serializedData = serializedData;
    }

    public int getReadCount() {
        return readCount;
    }

    public void setReadCount(int readCount) {
        this.readCount = readCount;
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
