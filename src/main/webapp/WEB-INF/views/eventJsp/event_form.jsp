<%--
  Created by IntelliJ IDEA.
  User: milypol
  Date: 06.07.2022
  Time: 14:57
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<form:hidden path="id"/>
<label>
    title: <form:input path="title"/><br>
    <form:errors path="title"/><br>


    date: <form:input path="date" cssClass="form-control" />
    <form:errors path="date"/><br>

    location: <form:input path="location"/><br>
    <form:errors path="location"/><br>

<%--    <c:forEach items="${userPresent}" var="userPresent">--%>
<%--        --%>
<%--    </c:forEach>--%>
    <form:checkboxes items="${userPresent}" path="presents" itemLabel="title"/><br>

    <a href="<c:url  value="/user/"/> ">Strona gówna  </a>

</label>

