<%--
  Created by IntelliJ IDEA.
  User: DE
  Date: 7/1/2022
  Time: 6:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search Product By Name</title>
</head>
<body>
<h1>Search Product </h1>
<form method="post">

        <fieldset>
            <legend>Form</legend>
            <table>
            <tr>
                <td>Enter the name</td>
                <td colspan="2"><input type="text" name="search" style="width: 200px;"/></td>
            </tr>
            <c:choose>
                <c:when test="${check==true}">
                    <tr>
                        <td> Name:</td>
                        <td> ${requestScope["product"].getName()}</td>
                    </tr>
                    <tr>
                        <td> Amount</td>
                        <td> ${requestScope["product"].getAmount()}</td>
                    </tr>
                    <tr>
                        <td> Price</td>
                        <td> ${requestScope["product"].getPrice()}</td>
                    </tr>
                    <tr>
                        <td> Description:</td>
                        <td> ${requestScope["product"].getDescript()}</td>
                    </tr>
                </c:when>
                <c:when test="${check==false}">
                    <tr>
                        <td colspan="2">Not found product</td>
                    </tr>
                </c:when>
                <c:otherwise>
                    <tr>
                        <td colspan="2">No Result</td>
                    </tr>
                </c:otherwise>
            </c:choose>
            <tr>
                <td><input type="submit" value="Search"></td>
                <td><a href="/products">Back to product list</a></td>
            </tr>
            </table>
        </fieldset>

</form>
</body>
</html>
