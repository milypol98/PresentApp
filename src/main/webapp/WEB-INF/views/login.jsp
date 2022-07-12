<%--
  Created by IntelliJ IDEA.
  User: milypol
  Date: 07.07.2022
  Time: 11:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <title>Title</title>

    <style><%@include file="/WEB-INF/views/css/style.css"%></style>
</head>
<body>
<form method="post">
    <div class="main">
        <p class="sign" align="center">Sign in</p>
        <div><label > <input type="text" name="username"class="login" placeholder="User Name" /> </label></div>
        <form class="form1"></form>
        <div><label > <input type="password" name="password" class="pass" placeholder="Password"/> </label></div>
        <div class="sign"><input type="submit" value="Sign In" class="submit"/></div>

        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    </div>

</form>
</body>
</html>
