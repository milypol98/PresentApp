<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form:hidden path="id"/>

<label>
    title: <form:input path="title"/><br>
    description: <form:textarea path="description" rows="5" cols="30"/><br>
    <br>
    <br>
    rainting:
    1 <form:radiobutton path="rainting" value="1"/>
    2 <form:radiobutton path="rainting" value="2"/>
    3 <form:radiobutton path="rainting" value="3"/>
    4<form:radiobutton path="rainting" value="4"/>
    5 <form:radiobutton path="rainting" value="5"/>


</label>


