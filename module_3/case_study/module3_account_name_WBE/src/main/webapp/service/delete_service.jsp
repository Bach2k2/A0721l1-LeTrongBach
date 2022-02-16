<%--
  Created by IntelliJ IDEA.
  User: DE
  Date: 21/1/2022
  Time: 6:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete a service</title>
</head>
<body>
<form action="/services" method="post">
    <h1>Delete A Service</h1>
    <table border="1px solid black">
        <legend>Are you sure</legend>
        <tr>
            <td>Service Id</td>
            <td><input type="text" name="id" value="${service.getSerId()}" disabled="disabled"></td>
        </tr>
        <tr>
            <td>Service Name</td>
            <td><input type="text" name="type_service" value="${service.getSerName()}" disabled="disabled"></td>
        </tr>
        <tr>
            <td>Area</td>
            <td><input type="text" name="area" value="${service.getArea()}" disabled="disabled"></td>
        </tr>
        <tr>
            <td>Deposit</td>
            <td><input type="text" name="deposit" value="${service.getCost()}" disabled="disabled"></td>
        </tr>
        <tr>
            <td>Max people</td>
            <td><input type="text" name="max_people" value="${service.getMaxPeople()}" disabled="disabled"></td>
        </tr>
        <tr>
            <td>Rental's Type Id</td>
            <td><input type="text" name="rent_type_id" value="${service.getRentType()}" disabled="disabled"></td>
        </tr>
        <tr>
            <td>Type's Service Id</td>
            <td><input type="text" name="type_service" value="${service.getTypeId()}" disabled="disabled"></td>
        </tr>
        <tr>
            <td>Standard</td>
            <td><input type="text" name="standard" value="${service.getStandard()}" disabled="disabled"></td>
        </tr>
        <tr>
            <td>Description of other service</td>
            <td><input type="text" name="description" value="${service.getDescription()}" disabled="disabled"></td>
        </tr>
        <tr>
            <td>pool Area</td>
            <td><input type="text" name="pool_area" value="${service.getPoolArea()}" disabled="disabled"></td>
        </tr>
        <tr>
            <td>Floors</td>
            <td><input type="text" name="floors" value="${service.getNumOfFloor()}" disabled="disabled"></td>
        </tr>
        <tr>
            <td><a href="/services">Back to service's list</a></td>
            <td><input type="submit" value="delete"></td>
        </tr>
    </table>
</form>
</body>
</html>
