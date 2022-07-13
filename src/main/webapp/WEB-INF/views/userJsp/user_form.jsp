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
    <div class="edit">
        username: <form:input path="username"/><br>
        <form:errors path="username"/><br>
</div>


    <div class="edit">
        email: <form:input path="email"/><br>
        <form:errors path="email"/><br>
    </div>

    <div class="edit">
        name: <form:input path="name"/><br>
        <form:errors path="name"/><br>
    </div>


    <div class="edit">
        surname: <form:input path="surname"/><br>
        <form:errors path="surname"/><br>
    </div>


    <div class="edit">
        age: <br> <form:input path="age"/><br>
        <form:errors path="age"/><br>
    </div>


    <div class="edit">
        new password:<form:password path="password"/><br><br>
    </div>

    <div class="edit">
        sex:<br>
        Male: <form:radiobutton path="sex" value="MALE"/>
        Female: <form:radiobutton path="sex" value="FEMALE"/><br>
        Other: <form:radiobutton path="sex" value="Other"/>
    </div>




</label>