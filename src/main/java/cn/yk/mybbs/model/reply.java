package cn.yk.mybbs.model;

public class reply {
    private Integer replyid;

    private Integer articleid;

    private Integer replyfloor;

    private Integer replyerid;

    private String replycontent;

    private Integer referencefloor;

    public Integer getReplyid() {
        return replyid;
    }

    public void setReplyid(Integer replyid) {
        this.replyid = replyid;
    }

    public Integer getArticleid() {
        return articleid;
    }

    public void setArticleid(Integer articleid) {
        this.articleid = articleid;
    }

    public Integer getReplyfloor() {
        return replyfloor;
    }

    public void setReplyfloor(Integer replyfloor) {
        this.replyfloor = replyfloor;
    }

    public Integer getReplyerid() {
        return replyerid;
    }

    public void setReplyerid(Integer replyerid) {
        this.replyerid = replyerid;
    }

    public String getReplycontent() {
        return replycontent;
    }

    public void setReplycontent(String replycontent) {
        this.replycontent = replycontent == null ? null : replycontent.trim();
    }

    public Integer getReferencefloor() {
        return referencefloor;
    }

    public void setReferencefloor(Integer referencefloor) {
        this.referencefloor = referencefloor;
    }
}