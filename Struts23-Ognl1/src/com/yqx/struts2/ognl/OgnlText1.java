package com.yqx.struts2.ognl;

import com.yqx.struts2.ognlvaluestack.Student;

import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;

public class OgnlText1 {

	public static void main(String[] args) throws OgnlException {
	Student stu=new Student("Jack", 20);
	Teacher tea=new Teacher("Scoot",40);
	
	OgnlContext context=new OgnlContext();
	context.put("student", stu);
	context.put("teacher", tea);
	
	System.out.println(Ognl.getValue("name",context,stu));
	System.out.println(Ognl.getValue("name",context,tea));
	System.out.println(Ognl.getValue("student.name", context));
	System.out.println(Ognl.getValue("student.score", context));
	System.out.println(Ognl.getValue("teacher.name", context));
	System.out.println(Ognl.getValue("teacher.salary", context));


	}

}
