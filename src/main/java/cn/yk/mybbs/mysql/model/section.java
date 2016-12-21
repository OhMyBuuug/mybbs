package cn.yk.mybbs.mysql.model;

import java.util.Date;

public class section {
    private Integer sectionid;

    private String sectionname;

    private Integer articlecount;

    private Integer moduleid;

    private Date lastestcreatetime;

    private byte[] sectionicon;

    public Integer getSectionid() {
        return sectionid;
    }

    public void setSectionid(Integer sectionid) {
        this.sectionid = sectionid;
    }

    public String getSectionname() {
        return sectionname;
    }

    public void setSectionname(String sectionname) {
        this.sectionname = sectionname == null ? null : sectionname.trim();
    }

    public Integer getArticlecount() {
        return articlecount;
    }

    public void setArticlecount(Integer articlecount) {
        this.articlecount = articlecount;
    }

    public Integer getModuleid() {
        return moduleid;
    }

    public void setModuleid(Integer moduleid) {
        this.moduleid = moduleid;
    }

    public Date getLastestcreatetime() {
        return lastestcreatetime;
    }

    public void setLastestcreatetime(Date lastestcreatetime) {
        this.lastestcreatetime = lastestcreatetime;
    }

    public byte[] getSectionicon() {
        return sectionicon;
    }

    public void setSectionicon(byte[] sectionicon) {
        this.sectionicon = sectionicon;
    }
}