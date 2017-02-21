<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table border="1">
		<tr>
			<td>序列号:</td>
			<td>Name:</td>
			<td>Price:</td>
			<td>Description:</td>
			<td>color:</td>
			<td>country:</td>
			<td>删除数据</td>
			<td>修改数据</td>
		</tr>
		<c:forEach items="${product}" var="product" varStatus="v">
			<tr>
				<td>${v.count}</td>
				<td>${product.value.name}</td>
				<td>${product.value.price}</td>
				<td>${product.value.description}</td>
				<td>${product.value.color}</td>
				<td>${product.value.country}</td>
				<td><a href="product_del.action?id=${product.value.id}">删除</a></td>
				<td><a href="product_update.action?id=${product.value.id}">修改</a></td>
			</tr>
		</c:forEach>
	</table>
	<hr />
	<a href="http://localhost:8080/SpringMVC4.3-start/product_input.action">添加数据</a>
<hr/>
	<form action="product_update.action" method="post">
	
			<legend>修改数据</legend>
			<label for="id">&nbsp;&nbsp;&nbsp;&nbsp;id为:</label> <input type="text" id="id" name="id"
				      value="" tabindex="2"  /><br/><hr/>
			 <label for="name">Product Name:</label> <input type="text" id="name" name="name" 
			          value="" tabindex="2"  />
			 <label for="description">Description:</label> <input type="text" id="description" name="description" 
			          value="" tabindex="2"  />
			  <label for="price">Price:</label> <input	type="text" id="price" name="price" 
			          value="" tabindex="3"  />
			<label for="color">color:</label> <input type="text" id="color" name="color" 
			          value="" tabindex="4"  />
			<label for="country">country:</label> <input type="text" id="country" name="country" 
			          value="" tabindex="5"  />

			<div id="buttons">
				  <label for="dummy"></label><input type="submit" id="submit" tabindex="5"
					value="确认修改" />
			</div>
		
	</form>
</body>
</html>