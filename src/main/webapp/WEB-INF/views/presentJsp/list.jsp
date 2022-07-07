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
</head>
<body>
<table>
    <a href="<c:url  value="/present/add"/> ">Dodaj Prezent </a>
    <br/>
    <a href="<c:url  value="/user/"/> ">Strona gówna  </a>
    <tr>
        <th>title</th>
        <th>description</th>
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
