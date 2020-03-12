package com.liulin.study.designpatterns.j_adaptermode.passport;

/**
 * Create by DbL on 2020/3/12
 */
public class PassportService {

    public ResultMsg regist(String username,String password){
        return  new ResultMsg(200,"OK",new Member());
    }

    public ResultMsg login(String username,String password){
        return null;
    }
}
