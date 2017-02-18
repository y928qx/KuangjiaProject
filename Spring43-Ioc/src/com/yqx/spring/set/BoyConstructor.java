package com.yqx.spring.set;

import org.apache.log4j.Logger;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BoyConstructor {
	     private static Logger logger=Logger.getLogger(BoyConstructor.class);
	     //声明接口类型的引用，和具体实现类解耦合
	     private GirlFriend girlFriend;
         private static ClassPathXmlApplicationContext ctx;
         
         public  BoyConstructor()   {
        	 
         }
         //用于grilfiend属性赋值的构造方法
	public BoyConstructor(GirlFriend girlFriend) {
			//super();
			this.girlFriend = girlFriend;
		}

	public static void main(String[] args) {
		ctx=new ClassPathXmlApplicationContext("applicationContext-set.xml");
	
		BoyConstructor boy=(BoyConstructor) ctx.getBean("boyConstructor");
		logger.info(boy.girlFriend.speak());

	}

}
