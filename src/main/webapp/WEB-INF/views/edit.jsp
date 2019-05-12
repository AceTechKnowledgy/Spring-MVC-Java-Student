<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Student</title>
</head>
<body>
	<div class="menu">
		<jsp:include page="menu.jsp"/>
	</div>
	<div class="body">
		<form:form action="editStudentAction" method="post" modelAttribute="student">
		
			<table align="center" cellpadding="5" cellspacing="5">
				<tr>
					<th>Roll No.</th>
					<td><form:input path="rollNo" readonly="true"/></td>
				</tr>
				
				<tr>
					<th>Name</th>
					<td><form:input path="name"/></td>
				</tr>
				
				<tr>
					<th>Standard</th>
					<td><form:input path="standard"/></td>
				</tr>
				
				<tr>
					<th colspan="2">
						<button type="submit">Update</button>
					</th>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>