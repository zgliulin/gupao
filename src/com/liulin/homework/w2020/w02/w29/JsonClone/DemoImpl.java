package com.liulin.homework.w2020.w02.w29.JsonClone;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.awt.event.InputMethodListener;
import java.util.ArrayList;
import java.util.List;

/**
 * Create by DbL on 2020/3/1
 */
public class DemoImpl {
    public static void main(String[] args) {
        List<String> listHobby = new ArrayList<String>();
        listHobby.add("coding");
        listHobby.add("game");
        DemoBean oldBean = new DemoBean();
        oldBean.setId("1");
        oldBean.setName("LIN");
        oldBean.setHobby(listHobby);
        DemoBean simpleCloneBean = oldBean.clone();
        DemoBean deepCloneBean = oldBean.JsonClone();
        deepCloneBean.getHobby().add("climb");
        simpleCloneBean.getHobby().add("swim");
        System.out.println("oldBean:"+oldBean.toString());
        System.out.println("deepCloneBean:"+deepCloneBean.toString());
        System.out.println("simpleCloneBean:"+simpleCloneBean.toString());
        System.out.println("oldBean==simpleCloneBean:"+(oldBean.getHobby()==simpleCloneBean.getHobby()));
        System.out.println("oldBean==deepCloneBean:"+(oldBean.getHobby()==deepCloneBean.getHobby()));
    }

}
