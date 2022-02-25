<%--
  Created by IntelliJ IDEA.
  User: DE
  Date: 23/2/2022
  Time: 6:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<h1>Info setting</h1>
<table>
    <tr>
        <td>Language</td>
        <td> ${language}</td>
    </tr>
    <tr>
        <td>page size:</td>
        <td> ${pageSize}</td>
    </tr>
    <tr>
        <td>spam filter</td>
        <td> ${spamFilter}</td>
    </tr>
    <tr>
        <td>Signature: </td>
        <td>${signature}</td>
    </tr>

</table>
</body>
</html>
