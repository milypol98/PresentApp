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
    <style><%@include file="/WEB-INF/views/css/style.css"%></style>
</head>
<body>
<div class="main">
    <form class="form1"></form>
    <h1 class="apptitle"><spring:message code="app.title"/></h1>
<label class="submitLogin">
    <a href="<c:url  value="/login"/>">Sign in</a>
</label>
    <label class="submitRegistry">
    <a href="<c:url  value="/user/add"/> ">Sign up</a>
    </label>


</div>


</body>
</html>
