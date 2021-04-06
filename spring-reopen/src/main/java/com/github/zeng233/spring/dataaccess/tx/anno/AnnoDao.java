package com.github.zeng233.spring.dataaccess.tx.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @Description
 * @Author zenghua
 * @Email hua.zeng@dmall.com
 * @Date 2021/4/6 16:41
 * @Version 1.0
 */
@Repository
public class AnnoDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insert() {
        int random = (int)(Math.random() * 1000);
        jdbcTemplate.execute(
                "INSERT INTO USER(user_name, create_time) VALUES('" + random + "', NOW())");
    }

    public void update(int id) {
        jdbcTemplate.execute(
                "UPDATE USER SET user_name = 'updated', create_time=now() WHERE id = " + id);
    }



    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}