package com.liulin.study.designpatterns.k_bridgemode.course;

/**
 * Create by DbL on 2020/3/11
 */
public class AbstractCourse  implements  ICourse{
    private INote note;
    private IVideo video;

    public void setNote(INote note) {
        this.note = note;
    }

    public void setVideo(IVideo video) {
        this.video = video;
    }

    @Override
    public String toString() {
        return "AbstractCourse{" +
                "note=" + note +
                ", video=" + video +
                '}';
    }
}
