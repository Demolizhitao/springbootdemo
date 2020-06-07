package com.example.demo.domain;

/**
 * @ClassName Chapter
 * @Description TODO
 * @Author lizhitao
 * @Data 2020/6/6 23:57
 * @Version 1.0
 **/
public class Chapter {

    private int id;

    private String chapter_title;

    private int viderId;

    public Chapter() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChapter_title() {
        return chapter_title;
    }

    public void setChapter_title(String chapter_title) {
        this.chapter_title = chapter_title;
    }

    public int getViderId() {
        return viderId;
    }

    public void setViderId(int viderId) {
        this.viderId = viderId;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "id=" + id +
                ", chapter_title='" + chapter_title + '\'' +
                ", viderId=" + viderId +
                '}';
    }
}
