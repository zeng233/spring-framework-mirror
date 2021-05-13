package com.github.zeng233.spring.dataaccess.tx.anno;

import com.github.zeng233.spring.dataaccess.tx.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

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
        System.out.println(jdbcTemplate);
        int random = (int)(Math.random() * 1000);
        jdbcTemplate.execute(
                "INSERT INTO t_user(user_name, create_time) VALUES('" + random + "', NOW())");
    }

    public void update(int id) {
        jdbcTemplate.execute(
                "UPDATE t_user SET user_name = 'updated', create_time=now() WHERE id = " + id);
    }

    public List<User> list() {
        return jdbcTemplate.query("select * from t_user", new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User user = new User();
                user.setId(rs.getLong(1));
                user.setUserName(rs.getString(2));
                user.setCreateTime(rs.getDate(3));
                return user;
            }
        });
    }



    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}