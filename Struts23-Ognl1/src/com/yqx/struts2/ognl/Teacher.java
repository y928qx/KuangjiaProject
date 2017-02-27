package com.yqx.struts2.ognl;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class Teacher {
	private String name;
	private int salary;

	public Teacher(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", salary=" + salary + "]";
	}

	
	
}
