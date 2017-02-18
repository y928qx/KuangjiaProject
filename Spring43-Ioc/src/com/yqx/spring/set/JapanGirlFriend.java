package com.yqx.spring.set;

import lombok.Getter;
import lombok.Setter;

public class JapanGirlFriend implements GirlFriend {
	@Getter @Setter
	private String language;

	@Override
	public String speak() {
		// TODO Auto-generated method stub
		return language;
	}

}
