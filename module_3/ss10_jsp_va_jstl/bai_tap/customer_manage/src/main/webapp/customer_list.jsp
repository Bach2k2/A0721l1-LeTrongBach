<%--
  Created by IntelliJ IDEA.
  User: DE
  Date: 9/1/2022
  Time: 9:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customers</title>
</head>
<body>
<h1>Customers</h1>

<table border="1" width="100%">
    <tr>
        <td>Name</td>
        <td>Date of birth</td>
        <td>Address</td>
        <td> Image </td>
    </tr>
    <c:forEach items='${requestScope["customers"]}' var="customer">
        <tr>
            <td>${customer.getName()}</td>
            <td>${customer.getDateOfBirth()}</td>
            <td>${customer.getAddress()}</td>
            <td><img src="${customer.getImage()}" width="250px "height="170px"></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
