package com.yqx.hibernate.users;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UsersTest {
	private static Logger logger = Logger.getLogger(UsersTest.class);

	private Session session = null;
	private SessionFactory sessionFactory = null;

	/*
	 * 获取session
	 * 
	 * @return
	 */

	public Session getSession() {
		// 读取配置文件，创建sessionfactory对象

		sessionFactory = new Configuration().configure().buildSessionFactory();
		// 创建session对象
		session = sessionFactory.openSession();
		return session;
	}

	// 关闭session、

	public void closeSession() {
		if (session != null)
			session.close();
		if (sessionFactory != null)
			sessionFactory.close();
	}
	/*
	 * 插入数据
	 * 
	 * @Param users
	 * 
	 * @return
	 */

	public Long insert(Users users) {
		session = getSession();
		Transaction transaction = session.beginTransaction();// 开始事物
		Long id = (Long) session.save(users);// 保存类
		transaction.commit();
		closeSession();
		return id;
	}

	/*
	 * 更新数据
	 * 
	 * @Param users
	 */
	public void update(Users users) {
		session = getSession();
		Transaction transaction = session.beginTransaction();// 开始事物
		session.update(users);
		transaction.commit();
		closeSession();
	}
	/*
	 * 删除表数据
	 * 
	 * @Param users
	 */

	public void delete(Users users) {
		session = getSession();
		Transaction transaction = session.beginTransaction();// 开始事物
		transaction.commit();
		closeSession();
	}

	/*
	 * 获取一条数据
	 * 
	 * @Param id
	 * 
	 * @return
	 */

	public Users getUsersById(Long id) {

		session = getSession();
		Users users = session.get(Users.class, id);
		closeSession();
		return users;
	}

	/*
	 * 获取列表
	 * 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<Users> getUsersList() {
		session = getSession();
		List<Users> usersList = (List<Users>) session.createQuery("from Users").getResultList();
		closeSession();
		return usersList;
	}

	public static void main(String[] args) {
		UsersTest test = new UsersTest();
		
		//  Long userId=test.insert(new Users(null,"jack11","jack11"));增加数据
		//  logger.info(userId); logger.info(test.getUsersById(userId));
		 // test.update(new Users(7L,"tom17","tom18")); //修改数据
		 

		//Users users = new Users();
		//users.setId(6L);
		// test.delete(3L); // 删除数据
		// logger.info("");

		List<Users> usersList = test.getUsersList();
		for (Users users1 : usersList) {

			logger.info(users1);
		}

	}

}
