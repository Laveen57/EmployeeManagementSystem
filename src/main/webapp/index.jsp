<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="navbar.jsp"%>
<%@ page import="java.sql.*,java.util.*"%>
<%@ page import="com.file.Read"%>
<%@ page import="com.managment.Employee"%>
<%
HttpSession s = request.getSession();
s.getAttribute("user");
out.println("You Are Logged In As " + user);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
	<br><br><br>
	<div class="row justify-content-center text-center">
		<div class="col-sm-8">
			<% TreeMap<String, Employee> map = (TreeMap<String, Employee>) Read.readAll("D:/LMS/EmployeeManagment/DB/file.txt");%>
			<table class="table">
				<thead>
					<tr>
						<th scope="col">Id</th>
						<th scope="col">Name</th>
						<th scope="col">Salary</th>
						<th scope="col">Department</th>
						<th scope="col">Hiredate</th>
						<th scope="col">Experience</th>
						<th scope="col">DOB</th>
						<th scope="col">Address</th>
						<th scope="col">Email</th>
						<th scope="col">Update</th>
						<th scope="col">Delete</th>
					</tr>
				</thead>
				<tbody>
				<tr>
				<%for(Map.Entry<String,Employee> em:map.entrySet()){
				Employee emp =em.getValue();%>
				<td><%=emp.getEmp_id()%></td>
				<td><%=emp.getEmp_name()%></td>
				<td><%=emp.getEmp_salary()%></td>
				<td><%=emp.getEmp_dept()%></td>
				<td><%=emp.getEmp_hire()%></td>
				<td><%=emp.getEmp_exp()%></td>
				<td><%=emp.getEmp_dob()%></td>
				<td><%=emp.getEmp_adrs()%></td>
				<td><%=emp.getEmp_email()%></td>
				<td><a class="btn btn-success ml-4" href="edit.html" id="<%=emp.getEmp_id()%>">Update</a></td>
				<td><a class="btn btn-danger ml-4" href="DeleteEmployee?id=<%=emp.getEmp_id()%>">Delete</a></td>
				</tr>
           <%}%>
				</tbody>
			</table>
		</div>
	</div>
	<div class="text-center"><a class="btn btn-primary ml-4" href="add.jsp">Add Employee</a></div>
</body>
</html>