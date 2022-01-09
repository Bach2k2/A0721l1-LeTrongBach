<%--
  Created by IntelliJ IDEA.
  User: DE
  Date: 9/1/2022
  Time: 8:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Customer List</title>

</head>
<body>
<h4 style="text-align: center">Danh sách khách hàng</h4>
<form method="get">
    <table border="1px solid black" width="1000px">
        <tr>
            <td>Tên</td>
            <td>Ngày sinh</td>
            <td>Địa chỉ</td>
            <td>Ảnh</td>
        </tr>
        <c:forEach items='${requestScope["customers"]}' var="customer">
            <tr>
                <td>${customers.getName()} </td>
                <td>${customers.getDateOfBirth()} </td>
                <td>${customers.getAdress()} </td>
                <td><img src="${customer.getImage()}"></td>
            </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>
