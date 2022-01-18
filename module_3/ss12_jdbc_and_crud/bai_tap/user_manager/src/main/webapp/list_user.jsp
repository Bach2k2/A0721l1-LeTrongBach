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
    <title>Manage users website</title>
</head>
<body>

<div align="center">
    <h1 style="color: bisque">List of users</h1>
    <table border="1px">
        <tr>
            <th>Name</th>
            <th>Email</th>
            <th>Country</th>
            <th colspan="2">Action</th>
        </tr>
        <c:forEach var="user" items="${users}">
            <tr>
                <td><a href="/users?action=view&id=${user.getId()}">${user.getName()}</a></td>
                <td><a href="#">${user.getEmail()}</a></td>
                <td>${user.getCountry()}</td>
                <td><a href="/users?action=update&id=${user.getId()}">Update</a></td>
                <td><a href="/users?action=delete&id=${user.getId()}">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
    <span>
        <p><strong>Chức năng thêm:</strong></p>
        <table>
            <tr>
                <td> <a href="/users?action=create">Tạo một user mới</a></td>
            </tr>
            <tr>
                <td> <p>Tìm kiếm người dùng theo quốc gia</p>
                    <td>
                    <form action="/users">
                        <input type="hidden" name="action" value="find_by_country">
                           <input type="text" name="country"><input type="submit" value="find"/>
                    </form>
                </td>
            </tr>
            <tr>
                <td> <p>Sắp xếp người theo tên </p></td>
                    <td>
                    <form action="/users">
                        <input type="hidden" name="action" value="sort">
                         <input type="submit" value="sort">
                    </form>
                </td>
            </tr>
            <tr>
                <td>
                    <a href="/users">In tất cả người dùng</a>
                </td>
            </tr>
        </table>
</span>
</div>
</body>
</html>
