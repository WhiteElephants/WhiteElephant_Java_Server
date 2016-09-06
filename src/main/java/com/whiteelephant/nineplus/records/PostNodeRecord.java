package com.whiteelephant.nineplus.records;

import org.apache.ibatis.type.Alias;

/**
 * Created by gordon on 9/6/16.
 */
@Alias("PostNodeRecord")
public class PostNodeRecord {
    private String postId;
    private int nodeType;
    private boolean isSubtitle;
    private String mediaId;
    private String content;
    private String mediaIds;

    public PostNodeRecord() {
    }

    public PostNodeRecord(String postId, int nodeType, boolean isSubtitle, String mediaId, String content, String mediaIds) {
        this.postId = postId;
        this.nodeType = nodeType;
        this.isSubtitle = isSubtitle;
        this.mediaId = mediaId;
        this.content = content;
        this.mediaIds = mediaIds;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public int getNodeType() {
        return nodeType;
    }

    public void setNodeType(int nodeType) {
        this.nodeType = nodeType;
    }

    public boolean isSubtitle() {
        return isSubtitle;
    }

    public void setSubtitle(boolean subtitle) {
        isSubtitle = subtitle;
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMediaIds() {
        return mediaIds;
    }

    public void setMediaIds(String mediaIds) {
        this.mediaIds = mediaIds;
    }
}
