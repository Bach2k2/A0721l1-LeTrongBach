<%--
  Created by IntelliJ IDEA.
  User: DE
  Date: 21/1/2022
  Time: 6:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create A New Service</title>
</head>
<body>
<form action="/service" method="post">
    <table>
        <tr>
            <td>Service Id</td>
            <td><input type="text" name="id"></td>
        </tr>
        <tr>
            <td>Service Name</td>
           <td><input type="text" name="type_service"></td>
        </tr>
        <tr>
            <td>Area</td>
            <td><input type="text" name="area"></td>
        </tr>
        <tr>
            <td>Deposit</td>
            <td><input type="text" name="deposit"></td>
        </tr>
        <tr>
            <td>Max people</td>
           <td><input type="text" name="max_people"></td>
        </tr>
        <tr>
            <td>Rental's Type Id</td>
            <td><input type="text" name="rent_type_id"></td>
        </tr>
        <tr>
            <td>Type's Service Id</td>
            <td><input type="text" name="type_service"></td>
        </tr>
        <tr>
            <td>Standard</td>
            <td><input type="text" name="standard"></td>
        </tr>
        <tr>
            <td>Description of other service</td>
            <td><input type="text" name="description"></td>
        </tr>
        <tr>
            <td>pool Area</td>
            <td><input type="text" name="pool_area"></td>
        </tr>
        <tr>
            <td>Floors</td>
            <td><input type="text" name="floors"></td>
        </tr>
        <tr>
            <td><a href="/customers">Back to service's list</a></td>
            <td><input type="submit" value="create"></td>
        </tr>
    </table>
</form>
</body>
</html>
