package com.liulin.study.designpatterns.h_flyweightmode.ticket;

/**
 * Create by DbL on 2020/3/10
 */
public class Test {
    public static void main(String[] args) {
        ITicket ticket = TicketFactory.queryTicket("成都东","重庆北");
        ticket.showInfo("硬座");

        ticket = TicketFactory.queryTicket("成都东","重庆北");
        ticket.showInfo("软座");

        ticket = TicketFactory.queryTicket("成都东","重庆南");
        ticket.showInfo("软卧");


    }
}
