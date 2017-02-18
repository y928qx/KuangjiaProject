package com.yqx.springmvc.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.yqx.springmvc.domain.Product;
import com.yqx.springmvc.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	private Map<Long, Product> products =new HashMap<Long,Product>();//模数据库的保存和修改
    private AtomicLong generator =new AtomicLong();
    
    public ProductServiceImpl() {
    	Product product=new Product();
    	product.setName("MiBook");
    	product.setDesription("MiBook write code is very cool !I LIke it");
    	product.setPrice(4999.0d);
    	product.setColor("white");
    	product.setCountry("America");
    	add(product);
    }

	@Override
	public Product add(Product product) {
		long newid=generator.incrementAndGet();
		product.setId(newid);
		
		//保存到map中，此步模拟数据保存到数据库
		products.put(newid, product);
		return product;
	}

	@Override
	public Product get(long id) {
		return products.get(id);
	}
    
}
