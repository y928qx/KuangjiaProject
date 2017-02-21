<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="global">
		<h4>The product has been saved!</h4>
		<h5>Details:</h5>
		Tips:${message}<br /> 
		Product ID:${product.id}<br /> 
		Product Name:${product.name}<br /> 
		Product Description:${product.description}<br />
		Product Price:${product.price}<br /> 
		Product Color:${product.color}<br />
		Product Country:${product.country}<br />

	</div>
	<!-- <a href="http://localhost:8080/SpringMVC4.3-start/product_input.action">1.0.1</a> -->
	<!-- <a href="/SpringMvc4.3-Start/productdel">1.0.1</a> -->
	<a href="http://localhost:8080/SpringMVC4.3-start/product_list.action">1.0.2</a>
</body>
</html>