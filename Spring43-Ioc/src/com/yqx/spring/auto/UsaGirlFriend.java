package com.yqx.spring.auto;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Service("usaGirlFriend")
//@Controller("usaGirlFriend")
//@Repository("usaGirlFriend")
@Component("usaGirlFriend")
public class UsaGirlFriend {

	public String speak() {
		return "english";
	}

}
