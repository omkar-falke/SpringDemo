<%@page import="com.model.Student"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="up">
<pre>
<%	
	Student e=(Student)request.getAttribute("msg"); %>

		<input type="hidden" name="id" value="<%=e.getId()%>"> 
		
 Name	    <input type="text" name="name" value="<%=e.getName()%>">

 Email 	    <input type="text" name="email" value="<%= e.getMobile()%>">
 
 address    <input type="text" name="address" value="<%= e.getAddress()%>">  

 username   <input type="text" name="username" value="<%=e.getUsername()%>">
 
 password   <input type="password" name="password" value="<%= e.getPassword()%>">
 
 
 		<input type="submit" value="Update">  
 	
</pre>
</form>

</body>
</html>