package com.zlj.springmvc.form;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductForm {

	private Long id;
	private String name;
	private String description;
	private String price;
	private String color;
	private String country;
}
