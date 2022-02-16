<%--
  Created by IntelliJ IDEA.
  User: DE
  Date: 13/2/2022
  Time: 9:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>The T-Complex's Grounds</title>
</head>
<body>
<div style="text-align: center">
    <h1>The list of ground</h1>
    <table>
        <tr>
            <td> Id code</td>
            <td>Status</td>
            <td>Area (m^2)</td>
            <td>Floor</td>
            <td>Type</td>
            <td>Price</td>
            <td>Begin date</td>
            <td>End date</td>
        </tr>
        <c:forEach var="ground" items="${grounds}">
            <tr>
                <td>${ground.getId()}</td>
                <td>${ground.getStatus()}</td>
                <td>${ground.getArea()}</td>
                <td>${ground.getFloor()}</td>
                <td>${ground.getType()}</td>
                <td>${ground.getPrice()}</td>
                <td>${ground.getBeginDate()}</td>
                <td>${ground.getEndDate()}</td>
            </tr>
        </c:forEach>

    </table>
</div>

</body>
</html>
