<%--
  Created by IntelliJ IDEA.
  User: milypol
  Date: 07.07.2022
  Time: 16:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %><html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Edytuj siebie</h1>
<form:form method="post" modelAttribute="user">
    <%@include file = "user_form.jsp"%>
    roles: <form:input path="roles"/><br>
    <input type="submit" value="Update">
</form:form>
</body>
</html>
