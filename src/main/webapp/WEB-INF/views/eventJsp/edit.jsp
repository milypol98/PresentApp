<%--
  Created by IntelliJ IDEA.
  User: milypol
  Date: 06.07.2022
  Time: 14:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %><html>
<html>
<head>
    <title>Title</title>
    <style><%@include file="/WEB-INF/views/css/style.css"%></style>
</head>
<body>
<h1 class="apptitle">EDIT EVENTS</h1>
<div class="mainEvents">
    <div class="apptitle">
        <a href="<c:url  value="/user/"/> ">MAIN PAGE</a>
    </div>
    <form:form method="post" modelAttribute="event">
        <%@include file = "event_form.jsp"%>
        <input CLASS="submit" type="submit" value="Update">
    </form:form>
</div>

</body>
</html>
