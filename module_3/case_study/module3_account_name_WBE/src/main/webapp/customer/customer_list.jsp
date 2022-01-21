<%--
  Created by IntelliJ IDEA.
  User: DE
  Date: 20/1/2022
  Time: 8:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>THE LIST OF CUSTOMER</title>
</head>
<body>
<div style="text-align: center">
    <span>
        <p><a href="/customers?action=create">Create a new customer</a></p>
        <p><a href="/customers?action=search">Search a new customer</a></p>
    </span>
    <table border="1px solid black" style="border-collapse: collapse">
        <tr>
            <td>ID Of Type</td>
            <td>Full name</td>
            <td>Birthday</td>
            <td>Gender</td>
            <td>ID card</td>
            <td>Phone number</td>
            <td>Email</td>
            <td>Address</td>
            <td colspan="2">Action</td>
        </tr>
        <c:forEach items="${customers}" var="customer">
            <tr>
                <td>${customer.getTypeId()}</td>
                <td>${customer.getName()}</td>
                <td>${customer.getBirthday()}</td>
                <c:choose>
                    <c:when test="${customer.getGender()==0}">
                        <td>Female</td>
                    </c:when>
                    <c:otherwise>
                        <td>Male</td>
                    </c:otherwise>
                </c:choose>
                <td>${customer.getIdCard()}</td>
                <td>${customer.getPhone()}</td>
                <td>${customer.getEmail()}</td>
                <td>${customer.getAddress()}</td>
                <form action="/customers">
                    <input type="hidden" name="id" value="${customer.getId()}">
                    <td>
                        <button name="action" value="update">Update</button>
                    </td>
                    <td>
                        <button name="action" value="delete">Delete</button>
                    </td>
                </form>

            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
