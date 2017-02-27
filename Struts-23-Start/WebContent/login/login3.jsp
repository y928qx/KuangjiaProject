<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>struts23-start-login</title>
</head>
<body>
<s:form  action="login3" method="post" theme="simple"> 
<table>
<tr>
<td>用户 :</td>
<td> <s:textfield name="username" maxlength="40" size="18"/> </td>
</tr>
<tr>
<td>密码 :</td>
<td> <s:password name="password" maxlength="40" size="18"/> </td>
</tr>
<tr> 
<td align="center" colspan="2"><s:submit value="确定" /><s:reset value="重置" /> </td>
</tr>
</table>

 </s:form>




</body>
</html>