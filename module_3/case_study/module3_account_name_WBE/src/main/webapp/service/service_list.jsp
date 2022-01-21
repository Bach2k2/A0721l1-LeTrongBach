<%--
  Created by IntelliJ IDEA.
  User: DE
  Date: 21/1/2022
  Time: 6:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Of Service</title>
</head>
<body>

<div style="text-align: center">
    <span>
        <p><a href="/services?action=create">Create a new service</a></p>
        <p><a href="/services?action=search">Search a service by name</a></p>
    </span>
    <table border="1px solid black" style="border-collapse: collapse">
        <tr>
            <td>Id Of Service</td>
            <td>Name </td>
            <td>Area</td>
            <td>Deposit</td>
            <td>Max people</td>
            <td>Rent Type Id</td>
            <td>Service Type Id</td>
            <td>Standard</td>
            <td>Other Service 's Description</td>
            <td>Pool Area</td>
            <td>Floor</td>
            <td colspan="2">Action</td>
        </tr>
        <c:forEach items="${services}" var="service">
            <tr>
                <td>${service.getSerId()}</td>
                <td>${service.getSerName()}</td>
                <td>${service.getArea()}</td>
                <td>${service.getCost()}</td>
                <td>${service.getMaxPeople()}</td>
                <td>${service.getRentType()}</td>
                <td>${service.getTypeId()}</td>
                <td>${service.getStandard()}</td>
                <td>${service.getDescription()}</td>
                <td>${service.getPoolArea}</td>
                <td>${service.getNumOfFloor}</td>
                <form action="/service">

                    <td>
                        <input type="hidden" name="id" value="${customer.getId()}">
                        <button name="action" value="update">Update</button>
                    </td>
                </form>
                <form action="/service">
                    <td>
                        <input type="hidden" name="id" value="${customer.getId()}">
                        <button name="action" value="delete">Delete</button>
                    </td>
                </form>

            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
