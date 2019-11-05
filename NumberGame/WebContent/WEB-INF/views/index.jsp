<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Pick a Number</h1>

<form action="home" method="POST">
    <input type="text" name="name">
    <button>Greet me!</button>
    
    <h1><c:out value="${count}"/></h1>
   
</form>
</body>
</html>