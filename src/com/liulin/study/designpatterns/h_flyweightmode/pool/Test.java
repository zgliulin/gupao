package com.liulin.study.designpatterns.h_flyweightmode.pool;

import java.sql.Connection;

/**
 * Create by DbL on 2020/3/10
 */
public class Test {
    public static void main(String[] args) {
        ConnectionPool pool = new ConnectionPool();
        Connection connection = pool.getConnection();
    }
}
