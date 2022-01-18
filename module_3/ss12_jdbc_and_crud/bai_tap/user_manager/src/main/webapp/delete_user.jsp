<%--
  Created by IntelliJ IDEA.
  User: DE
  Date: 16/1/2022
  Time: 9:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete Users</title>
</head>
<body>
<h1>Delete user</h1>
<span>
${message}
</span>
<form method="post">
    <table>
        <legend>Are you sure?</legend>
        <tr>
            <td>Name: </td>
            <td><input value="${name}" name="name"/></td>
        </tr>
        <tr>
            <td>Email: </td>
            <td><input value="${email}" name="email"/></td>
        </tr>
        <tr>
            <td>Country: </td>
            <td><input value="${country}" name="country"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="delete"/></td>
            <td><a href="/users">Back to user's list</a></td>
        </tr>
    </table>
</form>
</body>
</html>
