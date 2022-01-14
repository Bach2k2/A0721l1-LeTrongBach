<%--
  Created by IntelliJ IDEA.
  User: DE
  Date: 13/1/2022
  Time: 9:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tạo một user mới</title>
</head>
<body>
<span>
    ${message}
</span>
<form method="post">
    <table>
        <tr>
            <td> Nhap ten:</td>
            <td><input type="text" name="name" placeholder="type here"></td>
        </tr>
        <tr>
            <td> Nhap email:</td>
            <td><input type="text" name="email" placeholder="type here"></td>
        </tr>
        <tr>
            <td> Nhap quoc gia:</td>
            <td><input type="text" name="country" placeholder="type here"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="submit"></td>
        </tr>
    </table>
</form>
</body>
</html>
