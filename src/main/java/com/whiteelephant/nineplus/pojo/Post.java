package com.whiteelephant.nineplus.pojo;

import org.apache.ibatis.type.Alias;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by gordon on 16/9/3.
 */
@Alias("Post")
public class Post {
    public String author;
    public String title;
    public List<PostNode> nodes;
    public int readCount;
    public int wordCount;
    public String category;

    public Post() {
    }

    public Post(String author, String category, List<PostNode> nodes, int readCount, String title, int wordCount) {
        this.author = author;
        this.category = category;
        this.nodes = nodes;
        this.readCount = readCount;
        this.title = title;
        this.wordCount = wordCount;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<PostNode> getNodes() {
        return nodes;
    }

    public void setNodes(List<PostNode> nodes) {
        this.nodes = nodes;
    }

    public int getReadCount() {
        return readCount;
    }

    public void setReadCount(int readCount) {
        this.readCount = readCount;
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


}
