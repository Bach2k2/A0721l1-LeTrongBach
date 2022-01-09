<%--
  Created by IntelliJ IDEA.
  User: DE
  Date: 7/1/2022
  Time: 2:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create a new products</title>
    <style>
        .message {
            colot: green;
        }
    </style>
</head>
<body>
<h1> Create Product</h1>
<c:if test='${requestScope["msg"] != null}'>
<span class="message">
    ${msg}
</span>
</c:if>
<table>
    <form method="post">
        <tr>
            <td> Name</td>
            <td><input type="text" name="name"/></td>
        </tr>
        <tr>
            <td> Amount</td>
            <td><input type="text" name="amount"/></td>
        </tr>
        <tr>
            <td> Price</td>
            <td><input type="text" name="price"/></td>
        </tr>
        <tr>
            <td> Description:</td>
            <td><input type="text" name="description"/></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" name="create" value="create"></td>
        </tr>

    </form>
    <p>
        <a href="/products"> Back to product lists</a>
    </p>
</table>

</body>
</html>
