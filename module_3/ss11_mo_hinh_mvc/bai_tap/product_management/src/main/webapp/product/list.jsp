<%--
  Created by IntelliJ IDEA.
  User: DE
  Date: 7/1/2022
  Time: 10:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product List</title>
</head>
<body>
<table>
    <tr>
        <td>ID</td>
        <td>Name</td>
        <td>Amount</td>
        <td>Price (Thousand Dong) </td>
        <td>Description</td>
        <td colspan="2">Action</td>
    </tr>

    <c:forEach var="product" items="products">
        <tr>
            <td>${product.getId()}</td>
            <td>${product.getName()}</td>
            <td>${product.getAmount()}</td>
            <td>${product.getPrice()}</td>
            <td>${product.getDescript()}</td>
            <td><a>Update</a></td>
            <td><a>Delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
