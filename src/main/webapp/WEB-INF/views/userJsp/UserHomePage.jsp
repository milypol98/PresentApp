<%--
  Created by IntelliJ IDEA.
  User: milypol
  Date: 06.07.2022
  Time: 13:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style><%@include file="/WEB-INF/views/css/style.css"%></style>
</head>
<body>
<H1>WITAJ</H1>
<form action="<c:url value="/logout"/>" method="post">
    <input class="fa fa-id-badge" type="submit" value="Wyloguj">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
</form>
<br>
<a href="<c:url  value="/event/list"/> ">moje eventy </a>
<br/>
<a href="<c:url  value="/present/list"/> ">moje prezenty </a>
<br/>
<a href="<c:url  value="/admin/list"/> ">moji uzytkownicy </a>


<table>
    <tr>
        <th>title</th>
        <th>description</th>
        <th>rainting</th>
    </tr>
    <c:forEach var="present" items="${present}">
        <tr>
            <td>${present.title}</td>
            <td>${present.description}</td>
            <td>${present.rainting}</td>
        </tr>
    </c:forEach>
</table>
<br/>
<a href="<c:url  value="/user/editUser"/> ">Ustawienia konta  </a>


</body>
</html>
