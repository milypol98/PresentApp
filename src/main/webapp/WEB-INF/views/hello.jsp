<%--
  Created by IntelliJ IDEA.
  User: milypol
  Date: 30.06.2022
  Time: 11:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>

    <title></title>
</head>
<body>
<h1><spring:message code="app.title"/></h1>

<a href="<c:url  value="/login"/>">login</a> <br>

<a href="<c:url  value="/user/add"/> ">rejstracja</a> <br>


</body>
</html>
