package com.liulin.homework.w2020.w03.w08;

/**
 * Create by DbL on 2020/3/12
 */
public class PassportService {

    public ResultMsg regist(String username, String password){
        System.out.println("注册成功");
        return  new ResultMsg(200,"OK",new Member());
    }

    public ResultMsg login(String username, String password){
        System.out.println("登录成功");
        return null;
    }
}
