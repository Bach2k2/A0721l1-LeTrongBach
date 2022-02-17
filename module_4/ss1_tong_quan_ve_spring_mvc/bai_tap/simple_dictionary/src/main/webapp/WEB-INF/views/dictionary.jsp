<%--
  Created by IntelliJ IDEA.
  User: DE
  Date: 17/2/2022
  Time: 8:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>
</head>
<body>
<form method="post" action="/translate">
    <h3>Từ điền bách khoa toàn thư</h3>
    <table>
        <tr>
            <td>Từ tiếng Anh cần dịch</td>
            <td><input name="english" type="text"/></td>
        </tr>
        <tr>
            <td>Tiếng Viêt cần dịch</td>
            <td><input name="vietnamese" type="text" value="${result}"/></td>
        </tr>
        <tr>
            <td>Dịch</td>
            <td><input type="submit" value="Translate"/></td>
        </tr>
    </table>
</form>
</body>
</html>
