<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Get Pokemon by Name</h1>
<form action="findPokemonName">
Name: <input type="text" name="pokemonName"><br>
<input type="hidden" name="memberNumber" value=1>
<input type="submit">
</form>
<br>
<h1>Get Pokemon by Number</h1>
<form action="findPokemonNumber">
Number: <input type="text" name="pokemonNumber"><br>
<input type="hidden" name="memberNumber" value=1>
<input type="submit">
</form>
<br>


</body>
</html>