<%--
  Created by IntelliJ IDEA.
  User: DE
  Date: 13/2/2022
  Time: 9:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div style="text-align: center">
    <h1>Update</h1>
    <form method="post" action="/ground">
        <table>
            <tr>
                <td>Id Code</td>
                <td><input type="text" name="id" value="${ground.getId()}"></td>
            </tr>
            <tr>
                <td>Status</td>
                <td><select name="status">
                    <option value="1">Trống</option>
                    <option value="2">Hạ tầng</option>
                    <option value="3">Đầy đủ</option>
                </select></td>
            </tr>
            <tr>
                <td>Area</td>
                <td><input name="area" value="${ground.getArea()}"></td>
            </tr>
            <tr>
                <td>Floor</td>
                <td><input type="number" name="area" value="${ground.getFloor()}"></td>
            </tr>
            <tr>
                <td>Type</td>
                <td><select name="type">
                    <option value="1">Văn phòng cha sẻ</option>
                    <option value="2">Văn phòng trọn gói</option>
                </select></td>
            </tr>
            <tr>
                <td>Price</td>
                <td><input type="number" name="price" value="${ground.getPrice()}"></td>
            </tr>
            <tr>
                <td>Begin Date</td>
                <td><input type="date" name="begin_date" value="${ground.getBeginDate()}"></td>
            </tr>
            <tr>
                <td>End Date</td>
                <td><input type="date" name="end_date" value="${ground.getEndDate()}"></td>
            </tr>
            <tr>
                <td><a href="/ground">Trở về danh sách</a></td>
                <td><input type="submit" value="Update"></td>
            </tr>
        </table>
</div>
</body>
</html>
