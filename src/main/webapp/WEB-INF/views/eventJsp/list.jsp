<%--
  Created by IntelliJ IDEA.
  User: milypol
  Date: 06.07.2022
  Time: 14:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <a href="<c:url  value="/event/add"/> ">Dodaj Event </a><br/>
    <a href="<c:url  value="/user/"/> ">Strona gówna  </a>
    <tr>
        <th>title</th>
        <th>description</th>
        <th>location</th>
        <th>date</th>
    </tr>
    <c:forEach var="event" items="${event}">
        <tr>
            <td>${event.title}</td>
            <td>${event.description}</td>
            <td>${event.location}</td>
            <td>${event.date}</td>

            <td><a href="<c:url  value="/event/remove?id=${event.id}"/> ">Usuń </a>
                <a href="<c:url  value="/event/edit?id=${event.id}"/> ">Edytuj </a>
            </td>

        </tr>
    </c:forEach>
</table>

</body>
</html>
