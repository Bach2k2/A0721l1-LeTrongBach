<%--
  Created by IntelliJ IDEA.
  User: DE
  Date: 14/1/2022
  Time: 5:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit user</title>
</head>
<body>
<p>
    ${message}
</p>
<form method="post">
    <table>
        <tr>
            <td>Name </td>
            <td>${product.getName()}</td>

        </tr>
        <tr>
            <td>Email </td>
            <td>${product.getEmail()}</td>

        </tr>
        <tr>
            <td>Country</td>
            <td>${product.getCountry()}</td>
        </tr>
        <tr>
            <td>go to ->>>> </td>
            <td><input type="submit" value="Update"/></td>
        </tr>
    </table>
</form>
</body>
</html>
