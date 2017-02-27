package com.yqx.struts2.ognl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;

public class OgnlText2 {



public static void main(String[] args) throws OgnlException{
	
	OgnlBean bean=new OgnlBean();
	OgnlContext context=new OgnlContext();
	context.put("bean", bean);
	
	
	
	System.out.println(Ognl.getValue("'Hello!'", context));
	System.out.println(Ognl.getValue("'A'", context));
	System.out.println(Ognl.getValue("88", context));
	System.out.println(Ognl.getValue("'Hello!'", context));
	System.out.println(Ognl.getValue("true", context));
	System.out.println(Ognl.getValue("null", context));
	
	
	System.out.println(Ognl.getValue("#name='zhangsan'", context));
	System.out.println(Ognl.getValue("bean.method()", context));
	System.out.println(Ognl.getValue("@com.yqx.struts2.ognl.OgnlBean@staticProperty", context));
	System.out.println(Ognl.getValue("@com.yqx.struts2.ognl.OgnlBean@staticMethod()", context));

	System.out.println(Ognl.getValue("(new java.lang.String(\"Instance a new object!\")).toString()", context));
	
	/*获取bean数组中的元素*/
	System.out.println(Ognl.getValue("bean.getArray()[0]", context));
	System.out.println(Ognl.getValue("bean.Array[0]", context));
	
	System.out.println(Ognl.getValue("bean.getList()[0]", context));
	System.out.println(Ognl.getValue("bean.List[0]", context));
	
	
	System.out.println(Ognl.getValue("bean.getMap()['home']", context));
	System.out.println(Ognl.getValue("bean.Map['home']", context));
	
	System.out.println(Ognl.getValue("bean.getMap().office", context));
	System.out.println(Ognl.getValue("bean.Map.office", context));
	
	int[] array=(int[])Ognl.getValue("new int[]{0,1,2,3,4,5}", context);
	System.out.println(Arrays.toString(array));
	
	
	List list=(List) Ognl.getValue("{0,1,2,3,4,5}", context);
	System.out.println(list);
	
	
	Map map=(Map) Ognl.getValue("#{'key1':'value1','key2':'value2','key3':'value3'}", context);
	System.out.println(map);
	
      /*   放置list*/

	List<Teacher> teacherList=new ArrayList<Teacher>();
	
	teacherList.add(new Teacher("Jacke1",2000));
	teacherList.add(new Teacher("Jacke2",2200));
	teacherList.add(new Teacher("Jacke3",2400));
	teacherList.add(new Teacher("Jacke4",2600));
	teacherList.add(new Teacher("Jacke5",2800));
	teacherList.add(new Teacher("Jacke6",3000));
	context.put("teacherList", teacherList);
	
	System.out.println(Ognl.getValue("teacherList.{home}", context));
	System.out.println(Ognl.getValue("teacherList.{#this.name.toUpperCase()}", context));
	System.out.println(Ognl.getValue("teacherList.{#this.salary>2500?#this.salary+99}", context));
	
	System.out.println(Ognl.getValue("teacherList.{?#this.salary>2500}", context));
	System.out.println(Ognl.getValue("teacherList.{?#this.salary>2500}[0]", context));
	System.out.println(Ognl.getValue("teacherList.{^#this.salary>2500}", context));
	System.out.println(Ognl.getValue("teacherList.{$this.salary>2500}", context));
	
	
	
	
	
	
}

}