<%--
  Created by IntelliJ IDEA.
  User: DE
  Date: 7/1/2022
  Time: 3:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete this product</title>
</head>
<body>
<h1> Delete product</h1>
<form method="post">
    <h3>Are you sure to delete this product from the list</h3>
    <fieldset>
        <legend>Product Infomation</legend>
        <table>
            <tr>
                <td>
                    Name
                </td>
                <td>${product.getName()}</td>
            </tr>
            <tr>
                <td>
                    Amount
                </td>
                <td>${product.getAmount()}</td>
            <tr>
                <td> Price</td>
                <td>${product.getPrice()}</td>
            </tr>
            <tr>
            </tr>
            <tr>
                <td> Description</td>
                <td>${product.getDescript()}</td>
            </tr>
            <tr>
                <td> <input type="submit" value="Delete"/></td>
                <td><a href="/products">Back to product list</a></td>
            </tr>
        </table>

    </fieldset>
</form>
</body>
</html>
