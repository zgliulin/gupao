package com.liulin.study.designpatterns.i_compositemode.demo.transparent;

/**
 * Create by DbL on 2020/3/11
 */
public abstract  class CourseComponet {
    public void addChild(CourseComponet courseComponet){
        throw  new UnsupportedOperationException("不支持添加操作");
    }
    public void removeChild(CourseComponet courseComponet){
        throw  new UnsupportedOperationException("不支持删除操作");
    }
    public String getName(CourseComponet courseComponet){
        throw  new UnsupportedOperationException("不支持获取名称操作");
    }
    public Double getPrice(CourseComponet courseComponet){
        throw  new UnsupportedOperationException("不支持获取价格操作");
    }

    public void print(){
        throw  new UnsupportedOperationException("不支持打印操作");
    }
}
