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
    <title>Title</title>
</head>
<body>
<h1>Edytuj present</h1>
<a href="<c:url  value="/user/"/> ">Strona gówna  </a>
<form:form method="post" modelAttribute="present">
    <%@include file = "present_form.jsp"%>
    <input type="submit" value="Update">
</form:form>
</body>
</html>
