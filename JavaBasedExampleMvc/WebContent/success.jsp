<%@page import="com.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>success page</title>
<script type="text/javascript">
function mydelete() {
	
	alert("are You Sure");
	document.mvc.action="del";
	document.mvc.submit();
}
function myupdate() {
	
	alert("are You Sure");
	document.mvc.action="upd";
	document.mvc.submit();
}

</script>
</head>
<body>
<form name="mvc">
<table border="1" width="100%" height="100%">

<th>Id</th>
<th>Name</th>
<th>Address</th>
<th>Mobile</th>
<th>username</th>
<th>password</th>
<%
	List<Student>list=(List<Student>)request.getAttribute("msg");
	
	for(Student s:list)
	{
		%>
		<tr>
		<td><input type="radio" name="rid" value="<%=s.getId()%>">
		<td><%=s.getId()%></td>
		<td><%=s.getName()%></td>
		<td><%=s.getMobile()%></td>
		<td><%=s.getAddress()%></td>
		<td><%=s.getUsername()%></td>
		<td><%=s.getPassword()%></td>
		</tr>
	<%} %>
		
</table>
<input type="button" value="Delete" onclick="mydelete()">
<input type="button" value="Update" onclick="myupdate()">
</form>
</body>
</html>