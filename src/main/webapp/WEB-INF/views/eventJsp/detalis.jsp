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
    <style><%@include file="/WEB-INF/views/css/style.css"%></style>
</head>
<body>


<div class="mainDetalist">
    <div class="apptitle">
        <a href="<c:url  value="/user/"/> ">MAIN PAGE</a>
    </div>
    <c:forEach var="event" items="${eventDetalist}">
        <div class="edit">
            <td>TITLE:<br> ${event.title}</td><br>
        </div>
        <div class="edit">
        <td>DESCRIPTION:<br> ${event.description}</td>
        </div>
        <div class="edit">
        <td>LOCATION:<br> ${event.location}</td>
         </div>
        <div class="edit">
        <td>DATE:<br>${event.date}</td>
        </div>
    <div class="edit">
        LIST PRESENTS:<BR>
        <c:forEach var="present" items="${userPresent}">
            <td>${present.title}</td>
            <a href="<c:url  value="/present/details?id=${present.id}"/> ">DETALIS </a>
            <br>
        </c:forEach>
    </div>
    </c:forEach>

<div class="apptitle">
    <a href="<c:url  value="/barcodes/zxing"/> ">Generuj Zaproszenie elektrycznwe</a>

</div>

</div>


</body>
</html>
