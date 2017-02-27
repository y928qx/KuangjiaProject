package com.yqx.struts2.uitags;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class Country {
	private int countryId;
	private String countryName;
	
	

	public Country(int countryId, String countryName) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
	}

	





}
