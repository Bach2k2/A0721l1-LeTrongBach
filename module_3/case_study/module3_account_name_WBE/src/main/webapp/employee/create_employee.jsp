<%--
  Created by IntelliJ IDEA.
  User: DE
  Date: 23/1/2022
  Time: 8:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create new employee</title>
</head>
<body>
<h1>Create new employee</h1>
<p><c:if test="${message}!=null">${message}</c:if></p>
<form action="employees" method="post">
    <table>
        <tr>
            <th>Employee Id</th>
            <td><input type="text" name="employee_id"></td>
        </tr>
        <tr>
            <th>Employee Name</th>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <th>Employee Birth</th>
            <td><input type="text" name="birthday"></td>
        </tr>
        <tr>
            <th>Employee Id Card</th>
            <td><input type="text" name="id_card"></td>
        </tr>
        <tr>
            <th>Salary</th>
            <td><input type="text" name="salary"></td>
        </tr>
        <tr>
            <th>Phone</th>
            <td><input type="text" name="phone"></td>
        </tr>
        <tr>
            <th>Email</th>
            <td><input type="text" name="email"></td>
        </tr>
        <tr>
            <th>Address</th>
            <td><input type="text" name="address"></td>
        </tr>
        <tr>
            <th>position</th>
            <td><select name="position">
                <option value="1">Manager</option>
                <option value="2">Staff</option>
            </select>
            </td>
        </tr>
        <tr>
            <th>Education degree</th>
            <td><select name="ed_id">
                <option value="1">High school</option>
                <option value="2">College</option>
                <option value="3">University</option>
                <option value="4">OverGraduate</option>
            </select>
            </td>
        </tr>
        <tr>
            <th>Division</th>
            <td><select name="division">
                <option value="1">Sale-Marketing</option>
                <option value="2">Financial Departure</option>
                <option value="3">Service Departure</option>
                <option value="4">Manager</option>
            </select>
            </td>
        </tr>
        <tr>
            <th>Username</th>
            <td><input name="username" type="text"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
