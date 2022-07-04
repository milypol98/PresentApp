<%--
  Created by IntelliJ IDEA.
  User: milypol
  Date: 30.06.2022
  Time: 12:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %><html>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Dodaj present</h1>
<form:form method="post" modelAttribute="present">
    <%@include file = "_form.jsp"%>
    <input type="submit" value="Update">
</form:form>

</body>
</html>
