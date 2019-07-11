<%@page import="com.cjc.model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success Page</title>
<script type="text/javascript">

function mydelete() {
	alert("Are You Sure")
	document.mvc.action="dele";
	document.mvc.submit();
}

function myupdate() {
	alert("Are You Sure")
	document.mvc.action="up";
	document.mvc.submit();
}
</script>
</head>
<body>
<form name="mvc">
<h2 style="color: red;">Welcome In MVC Spring</h2>
<table border="1" height="100%" width="100%" bordercolor="grey">
<th>Select</th>
<th>Id</th>
<th>Name</th>
<th>Address</th>
<th>Email</th>
<th>Username</th>
<th>Password</th>
<% List<Employee> li=(List<Employee>)request.getAttribute("msg");

	for(Employee em:li)
	{
%>
	<tr>
	<td><input id="p" type="checkbox" name="eid" value="<%=em.getId() %>" ></td>
	<%-- <td><input type="radio" name="eid" value="<%=em.getId() %>"> --%>
	<td><%=em.getId() %></td>
	<td><%=em.getName() %></td>
	<td><%=em.getAddress() %></td>
	<td><%=em.getEmail() %></td>
	<td><%=em.getUsername() %></td>
	<td><%=em.getPassword() %></td>
	</tr>
<%} %>
</table><br>
<input type="button" value="Delete" onclick="mydelete()">
<input type="button" value="update" onclick="myupdate()">
</form>
</body>
</html>