<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<input type="button" id="submit" value="点击提交" />

	<script type="text/javascript">
		$(function() {
			$("#submit").click( function() {
								var postdata = '{"bookname":"'+ 'javaEE'+ '","booksize":"'	+ '4k' + '","bookprize":"'+ '99'+ '","bookpages":"'+ '1000' +'"}';
								$.ajax({type : 'POST',
											contentType : 'application/json',
											url : 'http://localhost:8080/springmvctest/databind/tec',
											processData : false,
											dataType : 'json',
											data : postdata,
											success : function(data) {
												alert('bookname : '+ data.bookname+ 'booksize : '+ data.booksize+'bookprize :'+data.bookprize+ 'bookpages :'+data.bookpages);},
					error : function() {
										alert('error...');
											}
										});});
		});
	</script>
</body>
</html>