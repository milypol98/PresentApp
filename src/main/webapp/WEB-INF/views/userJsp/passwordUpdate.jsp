<%--
  Created by IntelliJ IDEA.
  User: milypol
  Date: 10.07.2022
  Time: 16:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
Zmiana hasła
<form:form method="post" modelAttribute="pass">
    new password:<form:password path="password"/><br>
    <input type="submit" value="Update">
</form:form>


</body>
</html>
