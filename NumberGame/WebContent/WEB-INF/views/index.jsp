<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Pick a number between 1-10</h1>

<form action="home" method="POST">
    <input type="number" name="number" min="1" max="10">
    <button>Pick</button>
</form>
<form>
<button type="submit">reset number</button>
</form>
<c:if test="${result == '1'}">
<h1>You Win</h1>
</c:if>
<c:if test="${result == '2'}">
<h1>You Lose</h1>
</c:if>
    
   

</body>
</html>