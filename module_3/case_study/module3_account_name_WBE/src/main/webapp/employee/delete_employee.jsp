<%--
  Created by IntelliJ IDEA.
  User: DE
  Date: 23/1/2022
  Time: 8:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete employee</title>
</head>
<body>
<form method="post" action="/employees">
    <tr>
    <tr>
        <td>Employee Id</td>
        <td>${employee.getEmId()}</td>
    </tr>
    <tr>
        <td>Name</td>
        <td>${employee.getName()}</td>
    </tr>
    <tr>

        <td>Birthday</td>
        <td>${employee.getBirthday()}</td>
    </tr>
    <tr>
        <td>Id card</td>
        <td>${employee.getIdCard()}</td>
    </tr>
    <tr>
        <td>Salary</td>
        <td>${employee.getSalary()}</td>
    </tr>
    <tr>
        <td>Phone</td>
        <td>${employee.getPhone()}</td>
    </tr>
    <tr>
        <td>Email</td>
        <td>${employee.getEmail()}</td>
    </tr>
    <tr>
        <td>Address</td>
        <td>${employee.getAddress()}</td>
    </tr>
    <tr>
        <td>Position</td><td>
        <c:when test="${employee.getPosId()}==1">Manager</c:when>
        <c:when test="${employee.getPosId()}==2">Staff</c:when>
    </td>
    </tr>
    <tr>
        <td>Education degree id</td>
        <td><c:when test="${employee.getEDId()}==1">High School</c:when></td>
        <td><c:when test="${employee.getEDId()}==2">College</c:when></td>
        <td><c:when test="${employee.getEDId()}==3">University</c:when></td>
        <td><c:when test="${employee.getEDId()}==4">OverGraduate</c:when></td>
    </tr>
    <tr>
        <td>Division Id</td>
        <td><c:when test="${employee.getDivisionId()}==1">Sale-Marketing</c:when></td>
        <td><c:when test="${employee.getDivisionId()}==2">Financial Departure</c:when></td>
        <td><c:when test="${employee.getDivisionId()}==3">Service Departure</c:when></td>
        <td><c:when test="${employee.getDivisionId()}==4">Manager</c:when></td>
    </tr>
    <tr>
        <td>Username</td>
        <td>${employee.getUsername()}</td>
    </tr>
    </table>
</form>
</body>
</html>
