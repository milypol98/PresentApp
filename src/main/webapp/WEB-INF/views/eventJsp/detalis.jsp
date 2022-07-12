<%--
  Created by IntelliJ IDEA.
  User: milypol
  Date: 12.07.2022
  Time: 20:06
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

    <tr>
        <th>title</th>
        <th>description</th>
        <th>location</th>
        <th>date</th>
        <th>presents</th>
    </tr>
    <c:forEach var="event" items="${eventDetalist}">
        <tr>
            <td>${event.title}</td>
            <td>${event.description}</td>
            <td>${event.location}</td>
            <td>${event.date}</td>
           <c:forEach var="present" items="${userPresent}">
            <td>${present.title}</td>
            </c:forEach>
        </tr>
    </c:forEach>
</table>


</body>
</html>
