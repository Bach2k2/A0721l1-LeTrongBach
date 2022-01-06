<%--
  Created by IntelliJ IDEA.
  User: DE
  Date: 5/1/2022
  Time: 8:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Deleting student</title>
</head>
<body>
<h1>Delete student</h1>
<p>
    <a href="/student">Back to student list</a>
</p>
<form method="post">
    <h3>Are you sure?</h3>
    <fieldset>
        <legend>Student information</legend>
        <table>
            <tr>
                <td>Name: </td>
                <td>${requestScope["student"].getName()}</td>
            </tr>
            <tr>
                <td>Date of birth</td>
                <td>${requestScope["student"].getDateOfBirth()}</td>
            </tr>
            <tr>
                <td>Gender </td>
                <td><c:if test="${student.gender == 1}">
                    Male
                </c:if>
                    <c:if test="${student.gender == 0}">
                        Female
                    </c:if></td>
            </tr>
            <tr>
                <td>Grade: </td>
                <td>${requestScope["student"].getGrade()}</td>
            </tr>
            <tr>
                <td><input type="submit" value="Delete student"></td>
                <td><a href="/student">Back to student list</a></td>
            </tr>
        </table>
    </fieldset>
</body>
</html>