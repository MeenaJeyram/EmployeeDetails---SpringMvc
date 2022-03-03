<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html lang = "en">
<head>
<meta charset="ISO-8859-1">
<title>View Employee List</title>
<style>
	th,td{
		padding: 7px;
	}
</style>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>

</head>
<body>
<div class="container mt-1">
<table class="table table-hover">

<caption></caption>
	<thead>
	<tr>
  		<th >S.no</th>
		<th>Employee name</th>
		<th>Employee code</th>
		<th>Emailid</th>
		<th>Address1</th>
		<th>Address2</th>
		<th>city</th>
		<th>state</th>
		<th>DOB</th>
		<th>DOJ</th>
	</tr>
	</thead>
<tbody>

<c:set var="i" value="0"/>
<c:forEach items="${employeeList}" var="viewEmployee">
<c:set var="i" value="${i+1}"/>
<tr>

<td>${i}</td>
<td>${viewEmployee.empName}</td>
<td>${viewEmployee.empCode}</td>
<td>${viewEmployee.email}</td>
<td>${viewEmployee.address1}</td>
<td>${viewEmployee.address2}</td>
<td>${viewEmployee.city}</td>
<td>${viewEmployee.state}</td>
<td>${viewEmployee.dateOfBirth}</td>
<td>${viewEmployee.joiningDate}</td>

</tr>

</c:forEach>
</tbody>
</table>
</div>  
<button class="nav"><a href="EmployeeList">Search Employees</a></button>  
</body>
</html>