<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>Insert Customer Page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
  <!-- when this action is done, call url: /customer/save.action -->
  <form action="${pageContext.request.contextPath}/customer/save.action" method="post">
  	Insert a Customer<br/>
  	Customer Name：<input type="text" name="name"/><br/>
  	Customer Gender：
  	<input type="radio" name="gender" value="M"/>Male
  	<input type="radio" name="gender" value="W"/>Female
  	<br/>
  	Customer Telephone：<input type="text" name="telephone"/><br/>
  	Customer Address：<input type="text" name="address"/><br/>
  	<input type="submit" value="Save">
  </form>
  
  </body>
</html>
