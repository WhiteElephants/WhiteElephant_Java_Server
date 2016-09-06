package com.whiteelephant.nineplus.network.requests;

import com.whiteelephant.nineplus.beans.PostNode;

import java.util.List;

/**
 * Created by gordon on 16/9/3.
 */

public class PostRequest {
    public String author;
    public String title;
    public List<PostNode> nodes;
    public int wordCount;
    public String category;

    public PostRequest() {
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
