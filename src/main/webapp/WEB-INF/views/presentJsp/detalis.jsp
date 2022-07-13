<%--
  Created by IntelliJ IDEA.
  User: milypol
  Date: 13.07.2022
  Time: 18:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %><html>
<html>
<head>
    <title>Title</title>
    <style><%@include file="/WEB-INF/views/css/style.css"%></style>
</head>
<body>
<table class="top5">

    <tr>
        <th>TITLE</th>
        <th>DESCRIPTION</th>
        <th>RAINTING</th>
    </tr>
    <c:forEach var="present" items="${presentDetails}">
    <tr>
        <td>${present.title}</td>
        <td>${present.description}</td>
        <td>${present.rainting}</td>

    </tr>
    </c:forEach>
</table>
</div>
</body>
</html>
