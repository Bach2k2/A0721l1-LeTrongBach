<%--
  Created by IntelliJ IDEA.
  User: DE
  Date: 17/1/2022
  Time: 11:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Information Users</title>
</head>
<body>
<form method="post">
    <table>
        <tr>
            <td>User's Name:  </td>
            <td>${user.getName()}</td>
        </tr>
        <tr>
            <td>User's Email:  </td>
            <td><a href="#">${user.getEmail()}</a></td>
        </tr>
        <tr>
            <td>User's Country:  </td>
            <td>${user.getCountry()}</td>
        </tr>
        <tr>
            <td><a href="/users">Back to users's list</a></td>
            <td></td>
        </tr>
    </table>
</form>

</body>
</html>
