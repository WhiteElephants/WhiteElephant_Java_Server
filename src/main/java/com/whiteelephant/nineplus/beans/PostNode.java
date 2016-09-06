package com.whiteelephant.nineplus.beans;

import org.apache.ibatis.type.Alias;

import java.util.List;

/**
 * Created by gordon on 9/5/16.
 */
public class PostNode {
    private int nodeType;
    private List<String> mediaIds;
    private String content;
    private String mediaId;
    private Boolean isSubtitle;

    public PostNode() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<String> getMediaIds() {
        return mediaIds;
    }

    public void setMediaIds(List<String> mediaIds) {
        this.mediaIds = mediaIds;
    }

    public Boolean getIsSubtitle() {
        return isSubtitle;
    }

    public void setIsSubtitle(Boolean isSubtitle) {
        this.isSubtitle = isSubtitle;
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public int getNodeType() {
        return nodeType;
    }

    public void setNodeType(int nodeType) {
        this.nodeType = nodeType;
    }
}
