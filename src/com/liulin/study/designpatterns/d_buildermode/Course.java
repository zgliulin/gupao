package com.liulin.study.designpatterns.d_buildermode;

/**
 * Create by DbL on 2020/3/1
 */
public class Course {
    private String name;
    private String ppt;
    private String video;
    private String note;
    private String homeWork;

    public String getName() {
        return name;
    }

    public Course setName(String name) {
        this.name = name;
        return this;
    }

    public String getPpt() {
        return ppt;
    }

    public Course setPpt(String ppt) {
        this.ppt = ppt;
        return this;
    }

    public String getVideo() {
        return video;
    }

    public Course setVideo(String video) {
        this.video = video;
        return this;
    }

    public String getNote() {
        return note;
    }

    public Course setNote(String note) {
        this.note = note;
        return this;
    }

    public String getHomeWork() {
        return homeWork;
    }

    public Course setHomeWork(String homeWork) {
        this.homeWork = homeWork;
        return this;
    }
}
