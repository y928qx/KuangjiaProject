package com.yqx.spring;

//import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Text {
	
	private static AbstractApplicationContext ctx;
	
	private static void print(Object object){
		System.out.println(object);
	}
	public static void test1(){
		User uesr=new User();
		uesr.setName("Teacher");
		uesr.setAddress("anhuisheng hefeishi");
		print(uesr);
	}
	
	public static void test2(){
		ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		User user=(User)ctx.getBean("user");
	print(user);
	}
	public static void main(String[] args) {
		test1();
		test2();
	}
}
