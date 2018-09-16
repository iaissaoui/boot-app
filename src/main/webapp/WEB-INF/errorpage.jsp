<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error Page</title>
</head>
<body>
	<h1>You could have prevented this</h1>
	<h2><c:out value="${param}"></c:out>  </h2>
	<h2>${param}</h2>
	<h2>${exception}</h2>
	<h2>${url}</h2>
</body>
</html>