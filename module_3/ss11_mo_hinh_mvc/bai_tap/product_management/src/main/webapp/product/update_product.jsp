<%--
  Created by IntelliJ IDEA.
  User: DE
  Date: 7/1/2022
  Time: 3:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update A Product</title>
</head>
<body><p>
        <span class="message">${requestScope["msg"]}</span>
</p>
<form method="post">

    <table>
        <tr>
            <td>Name</td>
            <td><input type="text" name="name" value="${requestScope["product"].getName()}"></td>
        </tr>
        <tr>
            <td>Amount</td>
            <td><input type="text" name="amount" value="${requestScope["product"].getAmount()}"></td>
        </tr>
        <tr>
            <td>Price</td>
            <td><input type="text" name="price" value="${requestScope["product"].getPrice()}"></td>
        </tr>
        <tr>
            <td>Description</td>
            <td><input type="text" name="description" value="${requestScope["product"].getDescript()}"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Update Product"></td>
        </tr>
    </table>
    <p>
        <a href="/products"> Back to products </a>
    </p>
</form>
</body>
</html>
