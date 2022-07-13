<%--
  Created by IntelliJ IDEA.
  User: milypol
  Date: 06.07.2022
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style><%@include file="/WEB-INF/views/css/style.css"%></style>

</head>
<body>
<a class="submitSpecial" href="<c:url  value="/user/"/> ">Strona gówna  </a>
<table class="top5">
    <tr>
        <th>name</th>
        <th>surname</th>
        <th>age</th>
        <th>email</th>
        <th>username</th>

        <th>role</th>
        <th>sex</th>

    </tr>
    <c:forEach var="user" items="${user}">
        <tr>
            <td>${user.name}</td>
            <td>${user.surname}</td>
            <td>${user.age}</td>
            <td>${user.email}</td>
            <td>${user.username}</td>
            <td>${user.roles}</td>
            <td>${user.sex}</td>



            <td><a href="<c:url  value="/admin/remove?id=${user.id}"/> ">Usuń </a>
                <a href="<c:url  value="/admin/edit?id=${user.id}"/> ">Edytuj </a>
            </td>

        </tr>
    </c:forEach>
</table>

</body>
</html>
