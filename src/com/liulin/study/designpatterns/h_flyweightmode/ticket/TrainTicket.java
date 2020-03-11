package com.liulin.study.designpatterns.h_flyweightmode.ticket;

import java.util.Random;

/**
 * Create by DbL on 2020/3/10
 */
public class TrainTicket implements ITicket {

    private String from ;
    private String to;
    private int price;
    @Override
    public void showInfo(String bunk) {
        this.price = new Random().nextInt(500);
        System.out.println(from +"-->"+to+":"+bunk+"价格："+price);
    }

    public TrainTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }


}
