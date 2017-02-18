package service.impl;

import dao.UserDao;
import entity.User;
import lombok.Setter;
import service.Userservice;

public class UserServiceImpl implements Userservice {
	@Setter
private UserDao dao;
	@Override
	public void addNewUser(User user) {
		// TODO Auto-generated method stub
		dao.save(user);
	}

}
