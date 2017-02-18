package dao.impl;

import dao.UserDao;
//import javax.print.attribute.standard.PrinterLocation;
import entity.User;

public class UserDaoimpl implements UserDao {
          @Override
	public void save(User user) {
		System.out.println("保存用户信息的数据库！");

	}
}