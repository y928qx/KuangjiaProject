package com.yqx.struts2.demo;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserAction extends ActionSupport {
	private static final long serialVersionUID = 5039134787852719761L;
	private String username;
	private String password;
	/*
	 * value的值是path，页面form的值相对应
	 * 
	 * @resule name跳转地址别名 location 具体跳转地址
	 */

	@Action(value = "/users", results = { @Result(name = "success", location = "/results/success.jsp") })
	public String execute() {
		return SUCCESS;
	}

}
