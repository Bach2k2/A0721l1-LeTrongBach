<%--
  Created by IntelliJ IDEA.
  User: DE
  Date: 16/2/2022
  Time: 6:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Money Exchange System</title>
</head>
<body>
<h1>Money Exchange System</h1>
<form action="/exchange" method="post">
<table>
    <tr>
        <td><label>Nhập số lượng tiền (USD) :</label></td>
        <td><input name="usd" type="number" width="500px" placeholder="nhập số tiền $"></td>
    </tr>
    <tr>
        <td><label>Nhập tỷ giá:</label></td>
        <td><input name="rate" type="number" width="300px" placeholder="Ghi tỷ giá vào"></td>
    </tr>
    <tr>
        <td><label>Gửi đi:</label></td>
        <td><input type="submit" value="Exchange"></td>
    </tr>
    <tr>
        <td>Kết quả: </td>
        <td><input type="text" disabled value="${vnd}"/> " VND"</td>
    </tr>
</table>
</form>
</body>
</html>
