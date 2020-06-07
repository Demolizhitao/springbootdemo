package com.example.demo.domain;

import com.fasterxml.jackson.annotation.*;
import jdk.nashorn.internal.ir.annotations.Ignore;

import java.util.Date;
import java.util.List;

/**
 * @ClassName Video
 * @Description TODO
 * @Author lizhitao
 * @Data 2020/6/6 23:55
 * @Version 1.0
 **/
public class Video {

    private int id;

    private String title;

    private String summary;

    @JsonIgnore
    //@JsonProperty("cover_img")
    private String coverImg;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss" , locale = "zh" ,timezone = "GMT+8")
    private Date createTime;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<Chapter> chapterList;

    public Video() {
    }

    public Video(int id, String title) {
        this.id = id;
        this.title = title;
        this.createTime = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getCoverImg() {
        return coverImg;
    }

    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public List<Chapter> getChapterList() {
        return chapterList;
    }

    public void setChapterList(List<Chapter> chapterList) {
        this.chapterList = chapterList;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", coverImg='" + coverImg + '\'' +
                ", createTime=" + createTime +
                ", chapterList=" + chapterList +
                '}';
    }
}
