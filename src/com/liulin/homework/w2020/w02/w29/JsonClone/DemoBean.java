package com.liulin.homework.w2020.w02.w29.JsonClone;

import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * Create by DbL on 2020/3/1
 */
public class DemoBean implements Cloneable{
    private String id;
    private String name;
    private List<String> hobby;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getHobby() {
        return hobby;
    }

    public void setHobby(List<String> hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "DemoBean{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", hobby=" + hobby +
                '}';
    }
    public DemoBean clone(){
        try {
            return (DemoBean)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public  DemoBean JsonClone(){
        String oldBeanStr = JSON.toJSONString(this);
        return JSON.parseObject(oldBeanStr,this.getClass());
    }
}
