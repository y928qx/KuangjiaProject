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
	 * ��ȡsession
	 * 
	 * @return
	 */

	public Session getSession() {
		// ��ȡ�����ļ�������sessionfactory����

		sessionFactory = new Configuration().configure().buildSessionFactory();
		// ����session����
		session = sessionFactory.openSession();
		return session;
	}

	// �ر�session��

	public void closeSession() {
		if (session != null)
			session.close();
		if (sessionFactory != null)
			sessionFactory.close();
	}
	/*
	 * ��������
	 * 
	 * @Param users
	 * 
	 * @return
	 */

	public Long insert(Users users) {
		session = getSession();
		Transaction transaction = session.beginTransaction();// ��ʼ����
		Long id = (Long) session.save(users);// ������
		transaction.commit();
		closeSession();
		return id;
	}

	/*
	 * ��������
	 * 
	 * @Param users
	 */
	public void update(Users users) {
		session = getSession();
		Transaction transaction = session.beginTransaction();// ��ʼ����
		session.update(users);
		transaction.commit();
		closeSession();
	}
	/*
	 * ɾ��������
	 * 
	 * @Param users
	 */

	public void delete(Users users) {
		session = getSession();
		Transaction transaction = session.beginTransaction();// ��ʼ����
		transaction.commit();
		closeSession();
	}

	/*
	 * ��ȡһ������
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
	 * ��ȡ�б�
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
		
		//  Long userId=test.insert(new Users(null,"jack11","jack11"));��������
		//  logger.info(userId); logger.info(test.getUsersById(userId));
		 // test.update(new Users(7L,"tom17","tom18")); //�޸�����
		 

		//Users users = new Users();
		//users.setId(6L);
		// test.delete(3L); // ɾ������
		// logger.info("");

		List<Users> usersList = test.getUsersList();
		for (Users users1 : usersList) {

			logger.info(users1);
		}

	}

}
