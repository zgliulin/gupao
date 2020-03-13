package com.liulin.homework.w2020.w03.w11.course;

/**
 * Create by DbL on 2020/3/13
 */
public abstract class AbstractCourse {
    protected final void createCourse() {
        // 1、发布预习资料
        postPreResource();

        //制作PPT
        createPPT();

        // 直播授课
        liveVido();

        // 上传资料
        postResource();

        //布置作业
        postHomework();

        if (needCheckHomework()){
            checkHomework();
        }
    }

    protected abstract void checkHomework();

    protected boolean needCheckHomework() {
        return false;
    }

    protected void postHomework() {
        System.out.println("布置作业");
    }

    protected void postResource() {
        System.out.println("上传资料");
    }

    protected void liveVido() {
        System.out.println("直播授课");
    }

    protected void createPPT() {
        System.out.println("制作PPT");
    }

    protected void postPreResource() {
        System.out.println("发布预习资料");
    }
}
