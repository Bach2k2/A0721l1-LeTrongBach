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
    <style>
        table{
            border: 1px solid red;
            border-collapse: collapse;
            width: 100%;
        }
        th{
            text-align: center;
        }
        tr,td {
            border: 0.5px dotted blue;
            padding: 5px;
        }
        tr:nth-child(odd)
        {
            background-color: aqua;
        }

    </style>
    <link rel="stylesheet" type="text/css" href="list.css">
</head>
<body>
<h1 style="text-align: center">Product List</h1>
<p>
    <a href="/products?action=create"> Create new product</a>
</p>
<p>
    <a href="/products?action=search"> Search product by name</a>
</p>
<table>
    <tr>
        <th>Name</th>
        <th>Amount</th>
        <th>Price (Thousand Dong) </th>
        <th>Description</th>
        <th colspan="2">Action</th>
    </tr>

    <c:forEach var="product" items="${products}">
        <tr>
            <td><a href="/products?action=view&id=${product.getId()}">${product.getName()}</a></td>
            <td>${product.getAmount()}</td>
            <td>${product.getPrice()}</td>
            <td>${product.getDescript()}</td>
            <td><a href="/products?action=update&id=${product.getId()}">Update</a></td>
            <td><a href="/products?action=delete&id=${product.getId()}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
