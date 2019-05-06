<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Students</title>
</head>
<body>
	<div class="menu">
		<jsp:include page="menu.jsp" />
	</div>
	<div class="body">
		<hr />
		<table border="1">

			<tr>
				<th>Student RollNo.</th>
				<th>Name</th>
				<th>Standard</th>
			</tr>

			<c:forEach var="stu" items="${students}">

				<tr>
					<td>${stu.rollNo}</td>
					<td>${stu.name}</td>
					<td>${stu.standard}</td>
				</tr>
			</c:forEach>

		</table>

		<hr />
	</div>
</body>
</html>