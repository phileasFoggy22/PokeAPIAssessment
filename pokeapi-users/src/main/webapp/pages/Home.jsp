<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form action="addUser">
Number: <input type="text" name="memberNumber"><br>
Name: <input type="text" name="memberName"><br>
<input type="submit">
</form>
<br>
<form action="getUser">
Number: <input type="text" name="memberNumber"><br>
<input type="submit">
</form>
<br>
<form action="getUsers">
<input type="submit">
</form>
<form action="getUserJS">
Number: <input type="text" name="memberNumber"><br>
<input type="submit">
</form>
<br>
<form action="getUsersJS">
<input type="submit">
</form>
</body>
</html>