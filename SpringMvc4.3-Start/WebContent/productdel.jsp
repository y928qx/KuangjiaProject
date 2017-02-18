<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="http://libs.baidu.com/jquery/2.0.0/jquery.js"></script>

<title>Insert title here</title>
</head>
<body>
<div id="global">
<h4>The product has been saved!</h4>
<h5>Details:</h5>
Tips:${message}<br/>
Product ID:${product.id}<br/>
product Name:${product.name}<br/>
Description:${product.desription}<br/>
Price:${product.price}<br/>
Color:${product.color}<br/>
Country:${product.country}<br/>
</div>
<a href=""></a>
<!-- 修改重新填写 -->
<form action="">
		<table border="1">
		
		<tr>
		<td>Product ID:</td>
		<td>Description:</td>
		<td>Price:</td>
		<td>Color:</td>
		<td>Country:</td>
		<td></td>
		</tr>
		<tr>
		<td>${product.name}</td>
		<td>${product.desription}</td>
		<td>${product.price}</td>
		<td>${product.color}</td>
		<td>${product.country}</td>
		<td>修改</td>
		</tr>
		</table>
	</form>
</body>
</html>