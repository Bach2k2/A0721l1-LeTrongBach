<%@ page import="repos.CustomerRepos" %>
<%@ page import="model.Customer" %><%--
  Date: 31/12/2021
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>Customer List</title>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
<h4 style="text-align: center">Danh sách khách hàng</h4>
<form method="post" >
    <table border="1px solid black" width="1000px">
        <tr>
            <td>Tên</td>
            <td>Ngày sinh</td>
            <td>Địa chỉ</td>
            <td>Ảnh</td>
        </tr>
        <c:forEach items="${customers}" var="customer">
            <tr>
                <td>${customer.getName()} </td>
                <td>${customer.getDateOfBirth()} </td>
                <td>${customer.getAdress()} </td>
                <td><img src="${customer.getImage()}"></td>
            </tr>
        </c:forEach>
    </table>
</form>

</body>
</html>
