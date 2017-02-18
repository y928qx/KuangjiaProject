package com.yqx.spring;

//import javax.print.DocFlavor.STRING;

import lombok.Getter;
import lombok.Setter;

@Getter  @Setter
public class User {
	
	private String name;
	private String address;
	private String memo;

	@Override
	public String toString() {
		return "User [name=" + name + ", address=" + address + ", memo=" + memo + "]";
	}
}