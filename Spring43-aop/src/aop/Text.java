package aop;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.User;
import service.Userservice;



public class Text{
	private static AbstractApplicationContext ctx;
	public static void main(String[] args) {
		ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		Userservice uService=(Userservice) ctx.getBean("service");
		User user=new User();

		user.setEmail("yQX@qq.com");
		user.setId(1);
		user.setUsername("yqx");
		user.setPassword("123456");
		uService.addNewUser(user);
	}
}