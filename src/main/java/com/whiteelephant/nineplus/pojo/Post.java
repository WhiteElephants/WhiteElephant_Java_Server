package com.whiteelephant.nineplus.pojo;

import java.util.List;

/**
 * Created by gordon on 16/9/3.
 */
public class Post {
    public String author;
    public String title;
    public List<PostNode> nodes;
    public int readCount;
    public int wordCount;
    public String category;

    public Post() {
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
