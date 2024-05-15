<%--
  Created by IntelliJ IDEA.
  User: chjck
  Date: 13/05/2024
  Time: 5:21 CH
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="addCatalog" method="post" >
    <label for="name">Name:</label>
    <input type="text" id="name" name="name"/>
    <input type="submit" value="add">
</form>
</body>
</html>
