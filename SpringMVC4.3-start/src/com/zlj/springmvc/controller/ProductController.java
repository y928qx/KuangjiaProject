package com.zlj.springmvc.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.zlj.springmvc.domain.Product;
import com.zlj.springmvc.form.ProductForm;
import com.zlj.springmvc.service.ProductService;

@Controller
public class ProductController {
	private static final Logger logger = Logger.getLogger(ProductController.class);
	// 自动注入向后端数据库写数据的组件
	@Autowired
	private ProductService productService;

	@RequestMapping(value = "/product_input")
	public String inputProduct() {
		logger.info("inputProduct被调用");
		return "ProductForm";
	}

	@RequestMapping(value = "/product_save", method = RequestMethod.POST)
	public String saveProduct(ProductForm productForm, RedirectAttributes redirectAttributes) {
		logger.info("saveProduct 被调用");
		Product product = new Product();
		product.setName(productForm.getName());
		product.setDescription(productForm.getDescription());
		product.setColor(productForm.getColor());
		product.setCountry(productForm.getCountry());
		try {
			product.setPrice(Double.parseDouble(productForm.getPrice()));
		} catch (Exception e) {

			e.printStackTrace();
		}
		// add product
		Product saveProduct = productService.add(product);

		redirectAttributes.addFlashAttribute("message", "This product was successfully added");// 重定向传值
		return "redirect:/product_view/" + saveProduct.getId() + ".action";
	}

	// http:localhost:8080/SpringMVC4.3-start/product_view/2.action
	@RequestMapping(value = "/product_view/{id}") // {}内的id路径变更
	public String viewProduct(@PathVariable Long id, Model model) {
		Product product = productService.get(id);
		model.addAttribute("product", product);
		return "ProductView";
	}

	// http:localhost:8080/SpringMVC4.3-start/product_retrieve.action?id=1
	@RequestMapping(value = "/product_retrieve")
	public String sendProduct(@RequestParam Long id, Model model) {
		// 使用@RequestMapping获取URL路径上?后面的参数，而Servlet中是使用Request对象的getParamater()方法
		Product product = productService.get(id);
		model.addAttribute("product", product);
		return "ProductView";
	}

	@RequestMapping(value = "/product_list")
	public String listProduct(Model model) {

		Map<Long, Product> products = new HashMap<>();
		products = productService.getAll();

		model.addAttribute("product", products);

		return "ProductList";
	}

	// 删除数据，根据id
	@RequestMapping(value = "/product_del")
	public String delProduct(long id) {

		productService.delete(id);

		// System.out.println("test");

		return "redirect:/product_list.action";

	}

	//根据id，修改数据
	@RequestMapping(value = "/product_update", method = RequestMethod.POST)
	public String updateProduct(@RequestParam Long id, ProductForm productForm) {
		Product product = new Product();
		product.setId(productForm.getId());
		product.setName(productForm.getName());
		product.setDescription(productForm.getDescription());

		product.setColor(productForm.getColor());
		product.setCountry(productForm.getCountry());

		if(!(productForm.getPrice()==null||productForm.getPrice()=="")){
		try {
			
			product.setPrice(Double.parseDouble(productForm.getPrice()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		if (productForm.getPrice() != null) {
		
		Product saveProduct = productService.updeta(id, product);// add product
		}
		return "redirect:/product_list.action";
	}
	
}
