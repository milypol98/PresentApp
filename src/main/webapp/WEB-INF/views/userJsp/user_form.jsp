<%--
  Created by IntelliJ IDEA.
  User: milypol
  Date: 06.07.2022
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form:hidden path="id"/>
<label>
    username: <form:input path="username"/><br>
    password:<form:input path="password"/><br>
    email: <form:input path="email"/><br>
    name: <form:input path="name"/><br>
    surname: <form:input path="surname"/><br>
    age: <form:input path="age"/><br>
    sex: <form:input path="sex"/><br>
</label>