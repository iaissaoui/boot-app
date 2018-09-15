<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>You could have prevented this:</h1>
<h2>${Error}</h2>
<h2>${Message}</h2>
<h2>${Exception}</h2>
<h2>${url}</h2>
<h2>${exception}</h2>


<h2>Attributes:</h2>

    <c:forEach items="${requestScope}" var="par">
        <c:if test="${par.key.indexOf('attrName_') > -1}">
            <li>${par.key} - ${par.value}</li>
        </c:if>
    </c:forEach>


</body>
</html>