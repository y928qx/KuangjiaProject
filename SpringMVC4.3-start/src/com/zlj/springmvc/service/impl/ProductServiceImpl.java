package com.zlj.springmvc.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.zlj.springmvc.domain.Product;
import com.zlj.springmvc.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	private Map<Long, Product> products = new HashMap<Long, Product>();// 模数据库的获取与保存
	private AtomicLong generator = new AtomicLong();

	public ProductServiceImpl() {
		Product product = new Product();
		product.setName("MiBook");
		product.setDescription("MiBook write code is very cool!");
		product.setPrice(4999.0d);
		product.setColor("yellow");
		product.setCountry("china");
		add(product);
	}
	@Override
	public Product add(Product product) {
		long newid = generator.incrementAndGet();
		product.setId(newid);
		// 保存到map中，吃步骤模拟保存数据到数据库
		products.put(newid, product);
		return product;
	}
	// 返回一个map型参数
	@Override
	public Map<Long, Product> getAll() {
		return products;
	}
	@Override
	public Product get(long id) {
		return products.get(id);
	}
	// 更新数据，根据id更新数据
	@Override
	public Product updeta(long id, Product product) {
		products.put(id, product);

		return product;
	}
	// 删除数据，根据id删除数据
	@Override
	public Map<Long, Product> delete(long id) {
		products.remove(id);
		return products;
	}
}
