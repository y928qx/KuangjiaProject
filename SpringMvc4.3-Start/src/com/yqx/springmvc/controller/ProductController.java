package com.yqx.springmvc.controller;

import javax.servlet.http.HttpSession;

import org.apache.catalina.connector.Request;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.yqx.springmvc.domain.Product;
import com.yqx.springmvc.form.ProductForm;
import com.yqx.springmvc.service.ProductService;

@Controller
public class ProductController {
	private static final Logger logger = Logger.getLogger(ProductController.class);
	/* 自动注入向后端数据库写数据的组件 */
	@Autowired
	private ProductService productService;

	@RequestMapping(value = "/product_input")
	public String inputProduct() {
		logger.info("inputProduct 被调用！！");
		return "ProductForm";
	}

	@RequestMapping(value = "/product_save", method = RequestMethod.POST)
	//jsp中的数据
	public String saveProduct(ProductForm productForm, RedirectAttributes redirectAttributes) {
		logger.info("saveProduct 被调用！");
		Product product = new Product();
		product.setName(productForm.getName());
		product.setDesription(productForm.getDescription());
		try {
			product.setPrice(Double.parseDouble(productForm.getPrice()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		product.setColor(productForm.getColor()); /////////////////////////////
		product.setCountry(productForm.getCountry()); /////////////
		// add product
		Product saveProduct = productService.add(product);
		redirectAttributes.addFlashAttribute("message", "The product was successfully add!");
		return "redirect:/product_view/" + saveProduct.getId() + ".action";
	
	}
       
	
	//
	
	// http://localhost:8080/springMvc4.3-start/product_view/2.action?id=1
	@RequestMapping(value = "/product_view/{id}") // {}内为id的路径变量
	public String viewProduct(@PathVariable Long id, Model model) {
		Product product = productService.get(id);
		model.addAttribute("product", product);
		return "ProductView";
	}

	@RequestMapping(value = "/product_retrieve")
	public String sendProduct(@RequestParam Long id, Model model) {
		Product product = productService.get(id);
		model.addAttribute("product", product);
		return "ProductView";
	}
}
