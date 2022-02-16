<%--
  Created by IntelliJ IDEA.
  User: DE
  Date: 13/2/2022
  Time: 9:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add a new ground</title>
</head>
<body style="text-align: center">
<h1> Create a new ground</h1>
<form method="post" action="create">
    <table>
        <tr>
            <td>Id Code</td>
            <td><input type="text" name="id"></td>
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
            <td><input type="number" name="area"></td>
        </tr>
        <tr>
            <td>Floor</td>
            <td><input type="text" name="floor"></td>
        </tr>
        <tr>
            <td>Type</td>
            <td><select name="type">
                <option value="1">Văn phòng chia sẻ</option>
                <option value="2">Văn phòng trọn gói</option>
            </select></td>
        </tr>
        <tr>
            <td>Price</td>
            <td><input type="text" name="price"></td>
        </tr>
        <tr>
            <td>Begin Date</td>
            <td><input type="date" name="begin_date"></td>
        </tr>
        <tr>
            <td>End Date</td>
            <td><input type="date" name="end_date"></td>
        </tr>
        <tr>
            <td><a href="/ground">Trở về danh sách</a></td>
            <td><input type="submit" value="create"></td>
        </tr>
    </table>
</form>

</body>
</html>
