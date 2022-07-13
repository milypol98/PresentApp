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
    <div class="edit">
    title:<br> <form:input path="title"/><br>
    <form:errors path="title"/><br>
    </div>

    <div class="edit">
    date:<br> <form:input path="date" cssClass="form-control" />
    <form:errors path="date"/><br>
    </div>

    <div class="edit">
        description:<br> <form:textarea path="description" cssClass="form-control" rows="5" cols="30" />
        <form:errors path="description"/><br>
    </div>

    <div class="edit">
    location: <form:input path="location"/><br>
    <form:errors path="location"/><br>
    </div>

<%--    <c:forEach items="${userPresent}" var="userPresent">--%>
<%--        --%>
<%--    </c:forEach>--%>
    <div class="edit">
    <form:checkboxes items="${userPresent}" path="presents" itemLabel="title"/><br>
    </div>

</label>

