package com.yqx.springmvc.service;

import com.yqx.springmvc.domain.Product;

public interface ProductService {
	Product add(Product product);
	Product get(long id);

}
