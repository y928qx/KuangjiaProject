<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>


</head>
<body style="center">
	<div>
		<form action="product_save.action" method="post">

			
				<legend>添加</legend>
				<hr/>
		<label for="name">Product Name:</label> <input type="text" id="name"
			    name="name" value="" tabindex="2"  />
		 <label for="description">Description:</label> <input type="text" id="description" 
		        name="description" value="" tabindex="2"  />
		<label for="price">Price:</label> <input type="text" id="price"
			    name="price" value="" tabindex="3"  /> 
		<label for="color">Color:</label> <input type="text" id="color" 
		        name="color" value="" tabindex="4"  /> 
		<label for="country">Country:</label> <input type="text" id="country" 
		        name="country" value="" tabindex="5"  />

		<div id="buttons">
			<label for="dummy"></label> <input type="reset" id="reset"
				tabindex="4" /> <input type="submit" id="submit" tabindex="5"
				value="Add Product" />

				</div>
			
		</form>
	</div>

</body>
</html>