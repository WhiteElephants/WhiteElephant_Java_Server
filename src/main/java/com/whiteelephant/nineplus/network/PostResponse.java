package com.whiteelephant.nineplus.network;

/**
 * Created by gordon on 16/9/3.
 */
public class PostResponse {
    private boolean status;
    private String postId;

    public PostResponse() {
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public PostResponse(boolean status, String postId) {
        this.status = status;
        this.postId = postId;
    }
}
