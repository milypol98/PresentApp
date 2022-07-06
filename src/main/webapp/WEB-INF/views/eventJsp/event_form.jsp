<%--
  Created by IntelliJ IDEA.
  User: milypol
  Date: 06.07.2022
  Time: 14:57
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form:hidden path="id"/>
<label>
    title: <form:input path="title"/><br>
    description: <form:input path="description"/><br>
    date: <form:input path="date"/><br>
    location: <form:input path="location"/><br>
</label>
