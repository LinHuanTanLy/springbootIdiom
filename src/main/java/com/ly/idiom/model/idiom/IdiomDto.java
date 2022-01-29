package com.ly.idiom.model.idiom;


public class IdiomDto {
    private int groupId;
    private String imgUrl;
    private String answer;

    public IdiomDto(int groupId, String imgUrl, String answer) {
        this.groupId = groupId;
        this.imgUrl = imgUrl;
        this.answer = answer;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
