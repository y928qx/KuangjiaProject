package com.yqx.spring.jdbc;

import java.util.List;


import org.apache.log4j.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class Text {
	private static final Logger logger = Logger.getLogger(Text.class);
	private JdbcTemplate jdbcTemplate;
	private ApplicationContext ctx;

	public void init() {
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		this.jdbcTemplate = ctx.getBean("jdbcTemplate", JdbcTemplate.class);

	}

	public int insert(Users users) {
		String sql = "insert into users (name,pass) values('" + users.getName() + "','" + users.getPass() + "')";
		int count = this.jdbcTemplate.update(sql);
		return count;
	}

	public int update(Users users) {
		String sql = "update users set name=?,pass=? where id=?";
		int count = this.jdbcTemplate.update(sql, users.getName(), users.getPass(), users.getId());
		return count;
	}

	public int delete(Long id) {
		String sql = "delete from users where id=?";
		int count = this.jdbcTemplate.update(sql, id);
		return count;
	}

	public Users getOne(Long id) {
		String sql = "select * from users where id=" + id;
		Users users = this.jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Users>(Users.class));
		return users;
	}

	public long getCount(String name) {
		String sql = "select count(*) from users";
		return this.jdbcTemplate.queryForObject(sql, Long.class);
	}

	public List<Users> getUsersList() {
		String sql = "select * from users";
		List<Users> userslist = this.jdbcTemplate.query(sql, new BeanPropertyRowMapper<Users>(Users.class));
		return userslist;
	}

	public List<Users> getUsersList(Users users) {
		String sql = "select * from users where id=1 and name=? and pass=?";
		List<Users> usersList = this.jdbcTemplate.query(sql, new Object[] { users.getName(), users.getPass() },
				new BeanPropertyRowMapper<Users>(Users.class));

		return usersList;
	}

	public static void main(String[] args) {
		Text test = new Text();
		test.init();
		
		Users users=new Users();
		users.setId(3L);
		users.setName("lis22");
		users.setPass("56465");
		logger.info(test.insert(users));
		logger.info(test.update(users));
		Users users2=test.getOne(2L);
		logger.info(users2);
		
		
		List<Users> usersList = test.getUsersList();
		logger.info(usersList);

	
		         //List<Users> usersList1=test.getUsersList(users);
		logger.info(test.delete(5L));

	}
}
