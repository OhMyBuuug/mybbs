package cn.yk.mybbs.model;

import java.util.Date;

public class article {
    private Integer artcileid;

    private Integer sectionid;

    private String articletitle;

    private Integer articleauthorid;

    private String articlecontent;

    private String articletag;

    private Integer articlepv;

    private Boolean istop;

    private Date createtime;

    public Integer getArtcileid() {
        return artcileid;
    }

    public void setArtcileid(Integer artcileid) {
        this.artcileid = artcileid;
    }

    public Integer getSectionid() {
        return sectionid;
    }

    public void setSectionid(Integer sectionid) {
        this.sectionid = sectionid;
    }

    public String getArticletitle() {
        return articletitle;
    }

    public void setArticletitle(String articletitle) {
        this.articletitle = articletitle == null ? null : articletitle.trim();
    }

    public Integer getArticleauthorid() {
        return articleauthorid;
    }

    public void setArticleauthorid(Integer articleauthorid) {
        this.articleauthorid = articleauthorid;
    }

    public String getArticlecontent() {
        return articlecontent;
    }

    public void setArticlecontent(String articlecontent) {
        this.articlecontent = articlecontent == null ? null : articlecontent.trim();
    }

    public String getArticletag() {
        return articletag;
    }

    public void setArticletag(String articletag) {
        this.articletag = articletag == null ? null : articletag.trim();
    }

    public Integer getArticlepv() {
        return articlepv;
    }

    public void setArticlepv(Integer articlepv) {
        this.articlepv = articlepv;
    }

    public Boolean getIstop() {
        return istop;
    }

    public void setIstop(Boolean istop) {
        this.istop = istop;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}