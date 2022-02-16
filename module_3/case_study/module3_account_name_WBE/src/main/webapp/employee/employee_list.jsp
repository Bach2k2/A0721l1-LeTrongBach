<%--
  Created by IntelliJ IDEA.
  User: DE
  Date: 23/1/2022
  Time: 12:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee List</title>
</head>
<body>
<div text-align="center">
    <h1>List of employees</h1>
    <table>
        <tr>
            <th>Employee ID</th>
            <th>Employee 's Name'</th>
            <th>Employee's birthday</th>
            <th>Employee ID Card</th>
            <th>Salary</th>
            <th>Phone</th>
            <th>Email</th>
            <th>Address</th>
            <th>Position's id</th>
            <th>Education Degree</th>
            <th>Division id</th>
            <th>Username</th>
        </tr>
        <c:forEach var="employee" items="${employees}">
            <td>${employee.getEmId()}</td>
            <td>${employee.getName()}</td>
            <td>${employee.getBirthday()}</td>
            <td>${employee.getIdCard()}</td>
            <td>${employee.getSalary()}</td>
            <td>${employee.getPhone()}</td>
            <td>${employee.getEmail()}</td>
            <td>${employee.getAddress()}</td>
            <td>${employee.getPosId()}</td>
            <td>${employee.getEDId()}</td>
            <td>${employee.getDivisionId()}</td>
            <td>${employee.getUsername()}</td>
        </c:forEach>
    </table>
</div>

</body>
</html>
