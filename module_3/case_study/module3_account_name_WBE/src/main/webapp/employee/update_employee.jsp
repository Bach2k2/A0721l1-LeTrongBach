<%--
  Created by IntelliJ IDEA.
  User: DE
  Date: 24/1/2022
  Time: 12:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update a employee</title>
</head>
<body>
<form method="post" action="/employees">
    <table>
        <tr>
            <th>Employee Id</th>
            <td><input type="text" name="em_id" value="${employee.getEmId()}"></td>
        </tr>
        <tr>
            <th>Employee Name</th>
            <td><input type="text" name="name"  value="${employee.getEmId()}"></td>
        </tr>
        <tr>
            <th>Employee Birth</th>
            <td><input type="text" name="birthday"  value="${employee.getEmId()}"></td>
        </tr>
        <tr>
            <th>Employee Id Card</th>
            <td><input type="text" name="id_card"  value="${employee.getEmId()}"></td>
        </tr>
        <tr>
            <th>Salary</th>
            <td><input type="text" name="salary" value="${employee.getEmId()}"></td>
        </tr>
        <tr>
            <th>Phone</th>
            <td><input type="text" name="phone" value="${employee.getEmId()}"></td>
        </tr>
        <tr>
            <th>Email</th>
            <td><input type="text" name="email" value="${employee.getEmId()}"></td>
        </tr>
        <tr>
            <th>Address</th>
            <td><input type="text" name="address" value="${employee.getEmId()}"></td>
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
            <th> Username</th>
            <td><input type="text" name="username" value="${employee.getUsername()}"> </td>
        </tr>
    </table>
</form>
</body>
</html>
