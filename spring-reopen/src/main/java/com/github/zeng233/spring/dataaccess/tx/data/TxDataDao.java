package com.github.zeng233.spring.dataaccess.tx.data;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author zenghua
 * @version 1.0.0
 * @email zenghua@haixue.com
 * @date 2019/11/12 下午4:30
 */
public class TxDataDao {
	private JdbcTemplate jdbcTemplate;

	public void insert() {
		int random = (int)(Math.random() * 1000);
		jdbcTemplate.execute(
				"INSERT INTO t_user(user_name, create_time) VALUES('" + random + "', NOW())");
	}

	public void update(int id) {
		jdbcTemplate.execute(
				"UPDATE t_user SET user_name = 'updated', create_time=now() WHERE id = " + id);
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
}
