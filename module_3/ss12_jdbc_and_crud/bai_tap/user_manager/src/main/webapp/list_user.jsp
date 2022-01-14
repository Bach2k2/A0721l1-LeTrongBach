<%--
  Created by IntelliJ IDEA.
  User: DE
  Date: 13/1/2022
  Time: 9:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Danh sách người dùng</title>
</head>
<body>

<div align="center">
    <span>
    <a href="/users?action=create">Tạo một user mới</a>
</span>
    <table border="1px">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Country</th>
            <th>Action</th>
        </tr>
        <c:forEach var="user" items="${users}">
            <tr>
                <td><a href="#">${user.getId()}</a></td>
                <td><a href="#">${user.getName()}</a></td>
                <td><a href="#">${user.getEmail()}</a></td>
                <td>${user.getCountry()}</td>
                <td></td>
            </tr>
        </c:forEach>
    </table>
</div>

</body>
</html>
