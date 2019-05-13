<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Add Student</title>
	<link href='<spring:url value="/resources/css/add.css"/>' rel="stylesheet" />
</head>
<body>
	<div class="menu">
		<jsp:include page="menu.jsp"/>
	</div>
	<div class="body">
		<form action="addStudentAction"> </br>
			Roll No.: <input type="text" name="rollNo" id="rollNo"> </br>
			Name: <input type="text" name="name" id="name" > </br>
			Standard: <input type="text" name="standard" id="standard"> </br>
			<input type="submit" value="Add" id="button">
		</form>
	</div>
</body>
</html>