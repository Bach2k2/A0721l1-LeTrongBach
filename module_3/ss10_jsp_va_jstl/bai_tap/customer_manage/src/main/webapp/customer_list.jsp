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
    <title>Hiển thị danh sách khách hàng</title>
    <style>
        h1,th,td{
            text-align: center;
        }
        th,td{
            border-bottom: 1px solid gray;
        }
    </style>
</head>
<body>
<h1Danh sách khách hàng</h1>

<table width="100%">
    <tr>
        <th>Name</th>
        <th>Date of birth</th>
        <th>Address</th>
        <th> Image </th>
    </tr>
    <c:forEach items='${requestScope["customers"]}' var="customer">
        <tr>
            <td>${customer.getName()}</td>
            <td>${customer.getDateOfBirth()}</td>
            <td>${customer.getAddress()}</td>
            <td><img src="${customer.getImage()}" width="250px "height="170px" alt="Avatar"></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
