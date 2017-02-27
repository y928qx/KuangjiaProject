package com.yqx.struts2.ognl;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class Student {
	private String name;
	private int score;
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	

	

}
