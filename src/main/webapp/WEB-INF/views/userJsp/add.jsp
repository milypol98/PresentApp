<%--
  Created by IntelliJ IDEA.
  User: milypol
  Date: 06.07.2022
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %><html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style><%@include file="/WEB-INF/views/css/style.css"%></style>

</head>
<body>
<h1 class="apptitle">Rejstracja</h1>
<div class="mainUserEdit">
<form:form method="post" modelAttribute="user">
    <%@include file = "user_form.jsp"%>
    <input class="submit" type="submit" value="Update">
</form:form>
    </div>

</body>
</html>
