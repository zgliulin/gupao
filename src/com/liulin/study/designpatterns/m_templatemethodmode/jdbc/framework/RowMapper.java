package com.liulin.study.designpatterns.m_templatemethodmode.jdbc.framework;

import java.sql.ResultSet;

/**
 * Create by DbL on 2020/3/13
 */
public interface RowMapper<T> {

    T mapRow(ResultSet rs, int rowNum) throws Exception;

}
