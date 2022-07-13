<%--
  Created by IntelliJ IDEA.
  User: milypol
  Date: 30.06.2022
  Time: 12:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <style><%@include file="/WEB-INF/views/css/style.css"%></style>
    <title>Title</title>
</head>
<body>
<h1 class="apptitle">GIFT EDIT</h1>

<div class="main">
    <div class="apptitle">
        <a href="<c:url  value="/user/"/> ">MAIN PAGE</a>
    </div>
    <form:form method="post" modelAttribute="present">
        <%@include file = "present_form.jsp"%>
    <input class="submit" type="submit" value="Update">
    </form:form>
    </div>

</body>
</html>
