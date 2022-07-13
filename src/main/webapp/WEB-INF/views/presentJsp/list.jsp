<%--
  Created by IntelliJ IDEA.
  User: milypol
  Date: 30.06.2022
  Time: 12:27
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style><%@include file="/WEB-INF/views/css/style.css"%></style>
</head>
<body>
<a class="submitSpecial" href="<c:url  value="/present/add"/> ">Dodaj Prezent </a>
<a class="submitSpecial" href="<c:url  value="/user/"/> ">Strona gówna  </a>
<table class="top5">

    <tr>
        <th>TITLE</th>
        <th>DESCRIPTION</th>
        <th>RAINTING</th>
    </tr>
    <c:forEach var="present" items="${present}">
        <tr>
            <td>${present.title}</td>
            <td>${present.description}</td>
            <td>${present.rainting}</td>

            <td><a href="<c:url  value="/present/remove?id=${present.id}"/> ">Usuń </a>
                <a href="<c:url  value="/present/edit?id=${present.id}"/> ">Edytuj </a>
            </td>

        </tr>
    </c:forEach>
</table>

</body>
</html>
