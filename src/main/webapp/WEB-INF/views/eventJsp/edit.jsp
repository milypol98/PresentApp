<%--
  Created by IntelliJ IDEA.
  User: milypol
  Date: 06.07.2022
  Time: 14:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %><html>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Edytuj wydarzenie</h1>
<form:form method="post" modelAttribute="event">
    <%@include file = "event_form.jsp"%>
    <input type="submit" value="Update">
</form:form>
</body>
</html>
