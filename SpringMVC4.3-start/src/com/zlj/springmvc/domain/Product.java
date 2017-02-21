package com.zlj.springmvc.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Product {

	private Long id;
	private String name;
	private String description;
	private Double price;
	private String color;
	private String country;

}
