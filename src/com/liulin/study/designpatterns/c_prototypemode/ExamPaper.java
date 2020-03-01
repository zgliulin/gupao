package com.liulin.study.designpatterns.c_prototypemode;

import com.sun.istack.internal.Pool;

import java.io.*;

/**
 * 实现了Cloneable的都是浅克隆
 * Create by DbL on 2020/3/1
 */
public class ExamPaper implements Cloneable ,Serializable{
    private String id;
    private String leavTime;
    private String userId;
    private String postionCode;
    private String gradeCode;
    private String examStartTime;

    private static ExamPaper instance = new ExamPaper();

    private ExamPaper(){}

    private static ExamPaper getInstance(){
        return instance;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLeavTime() {
        return leavTime;
    }

    public void setLeavTime(String leavTime) {
        this.leavTime = leavTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPostionCode() {
        return postionCode;
    }

    public void setPostionCode(String postionCode) {
        this.postionCode = postionCode;
    }

    public String getGradeCode() {
        return gradeCode;
    }

    public void setGradeCode(String gradeCode) {
        this.gradeCode = gradeCode;
    }

    public String getExamStartTime() {
        return examStartTime;
    }

    public void setExamStartTime(String examStartTime) {
        this.examStartTime = examStartTime;
    }

    @Override
    public ExamPaper clone() {
        try {
            return (ExamPaper)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }

    }

    @Override
    public String toString() {
        return "ExamPaper{" +
                "id='" + id + '\'' +
                ", leavTime='" + leavTime + '\'' +
                ", userId='" + userId + '\'' +
                ", postionCode='" + postionCode + '\'' +
                ", gradeCode='" + gradeCode + '\'' +
                ", examStartTime='" + examStartTime + '\'' +
                '}';
    }

    /**
     * 深克隆
     * 实现方式  1.序列化  2.转JSON
     * @return
     */
    public ExamPaper deepClone(){
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return (ExamPaper) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
