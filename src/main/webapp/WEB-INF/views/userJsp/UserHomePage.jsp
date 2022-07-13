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
<H1>WELCOME</H1>

<br>
<a class="submitSpecial" href="<c:url  value="/event/list" /> ">MY EVENTS</a>

<a class="submitSpecial" href="<c:url  value="/present/list"/> ">MY PRESENTS</a>

<a class="submitSpecial"  href="<c:url  value="/user/editUser"/> ">SETTINGS</a>

<a class="submitSpecial" href="<c:url  value="/admin/list"/> ">moji uzytkownicy </a>


<table class="top5">
    <tr>
        <th>TITLE</th><th>RAINTING</th><br/>
        <th>DESCRIPTION</th>

    </tr>
    <c:forEach var="present" items="${present}">
        <tr>
            <td>${present.title}</td><td>${present.rainting}</td>
            <br/>

            <td>${present.description}</td>

        </tr>
    </c:forEach>
</table>
<br/>
<form  action="<c:url value="/logout"/>" method="post">
    <input class="fa fa-id-badge" type="submit" value="LOG OUT">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
</form>

</body>
</html>
