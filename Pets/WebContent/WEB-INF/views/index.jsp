<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
#click{
margin: 50px auto 0 auto;
height: 70px;
width: 100px;
}
</style>
</head>
<body>
<h2>Make a Cat</h2>
<form action="Cats">
  <label for="name">Name: </label>
  <input name="name" type="text">
  <label for="breed">Breed: </label>
  <input name="breed" type="text">
  <label for="weight">Weight: </label>
  <input name="weight" type="number">
  <button type="submit">submit</button>
</form>

<h2>Make a Dog</h2>
<form action="Dogs">
  <label for="name">Name: </label>
  <input name="name" type="text">
  <label for="breed">Breed: </label>
  <input name="breed" type="text">
  <label for="weight">Weight: </label>
  <input name="weight" type="number">
  <button type="submit">submit</button>
</form>

<form action="Count">
<button id="click" type="submit">Click Me!</button>
</form>
<h1><c:out value="${seshCount}"/></h1>

</body>
</html>