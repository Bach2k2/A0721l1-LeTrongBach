<%--
  Created by IntelliJ IDEA.
  User: DE
  Date: 20/1/2022
  Time: 8:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create a customer</title>
</head>
<body>
<span>${message}</span>
<form method="post">
    <table>
        <tr>
            <td>Customer Id</td>
            <td><input type="text" name="id"></td>
        </tr>
        <tr>
            <td>Type of customer</td>
            <td><select name="type_id">
                <option value="1">Diamond</option>
                <option value="2">Platinum</option>
                <option value="3">Gold</option>
                <option value="4">Silver</option>
                <option value="5">Member</option>
            </select></td>
        </tr>
        <tr>
            <td>Name</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>Birthday</td>
            <td><input type="date" name="birthday"></td>
        </tr>
        <tr>
            <td>Gender</td>
            <td><select name="gender">
                <option value="0">Female</option>
                <option value="1">Male</option>
            </select></td>
        </tr>
        <tr>
            <td>Id Card</td>
            <td><input type="text" name="id_card"></td>
        </tr>
        <tr>
            <td>Phone</td>
            <td><input type="text" name="phone"></td>
        </tr>
        <tr>
            <td>Email</td>
            <td><input type="text" name="email"></td>
        </tr>
        <tr>
            <td>Address</td>
            <td><input type="text" name="address"></td>
        </tr>
        <tr>
            <td><a href="/customers">Back to customer's list</a></td>
            <td><input type="submit" value="create"></td>
        </tr>
    </table>
</form>
</body>
</html>
