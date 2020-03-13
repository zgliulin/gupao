package com.liulin.study.designpatterns.m_templatemethodmode.jdbc.dao;



import com.liulin.study.designpatterns.m_templatemethodmode.jdbc.entity.Member;
import com.liulin.study.designpatterns.m_templatemethodmode.jdbc.framework.JdbcTemplate;
import com.liulin.study.designpatterns.m_templatemethodmode.jdbc.framework.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;


/**
 * Create by DbL on 2020/3/13
 */
public class MemberDao extends JdbcTemplate {
    public MemberDao(DataSource dataSource) {
        super(dataSource);
    }

    public List<?> selectAll(){
        String sql = "select * from t_member";
        return super.executeQuery(sql, new RowMapper<Member>() {
            public Member mapRow(ResultSet rs, int rowNum) throws Exception {
            Member member = new Member();
            //字段过多，原型模式
            member.setUsername(rs.getString("username"));
            member.setPassword(rs.getString("password"));
            member.setAge(rs.getInt("age"));
            member.setAddr(rs.getString("addr"));
            return member;
            }
        },null);
    }
}
