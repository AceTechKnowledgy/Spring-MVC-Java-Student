<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>Menu</title>
	<link href='<spring:url value="/resources/css/menu.css"/>' rel="stylesheet" />
</head>
<body>
	<div class="heading">
		<h1>Welcome to the Student's Application</h1>
	</div>
	<div class="links">
		<a href="./">Home</a>
		<a href="addStudent">Add Student</a>
		<a href="displayStudents">Display Students</a>
	</div>
</body>
</html>