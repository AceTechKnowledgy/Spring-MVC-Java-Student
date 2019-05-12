<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Student</title>
</head>
<body>
	<div class="menu">
		<jsp:include page="menu.jsp"/>
	</div>
	<div class="body">
		<form action="addStudentAction"> </br>
			Roll No.: <input type="text" name="rollNo"> </br>
			Name: <input type="text" name="name"> </br>
			Standard: <input type="text" name="standard"> </br>
			<input type="submit" value="Add">
		</form>
	</div>
</body>
</html>