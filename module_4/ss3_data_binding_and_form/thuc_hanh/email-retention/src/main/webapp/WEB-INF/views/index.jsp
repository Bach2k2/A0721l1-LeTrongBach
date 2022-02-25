<%--
  Created by IntelliJ IDEA.
  User: DE
  Date: 22/2/2022
  Time: 11:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Setting</title>
</head>
<body>
<h1>SETTING</h1>
<form:form method="post" action="/save" modelAttribute="email">
    <table>
        <tr>
            <th>Language:</th>
            <td><form:select path="language" itemValue="english">
                <form:option value="english">English</form:option>
                <form:option value="chinese">Chinese</form:option>
                <form:option value="vietnamese">Vietnamese</form:option>
                <form:option value="japanese">Japanese</form:option>
            </form:select></td>
        </tr>
        <tr>
            <th><form:label path="pageSize" itemValue="5">Page size:</form:label></th>
            <td>${"Show "}<form:select path="pageSize">
                <form:option value="5">5</form:option>
                <form:option value="10">10</form:option>
                <form:option value="15">15</form:option>
                <form:option value="20">20</form:option>
                <form:option value="50">50</form:option>
                <form:option value="100">100</form:option>
            </form:select>${" emails per page" }</td>
        </tr>
        <tr>
            <th>Spam filter</th>
            <td><form:checkbox path="spamFilter"></form:checkbox></td>
        </tr>
        <tr>
            <th>Signature</th>
            <td><form:textarea path="signature" value="${'hello'}"></form:textarea></td>
        </tr>
        <tr>
            <td><input type="submit" value="update"></td>
            <td><input type="reset" value="cancel"></td>
        </tr>
    </table>
</form:form>
</body>
</html>
