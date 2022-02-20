<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: DE
  Date: 18/2/2022
  Time: 4:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sandwitch Condiments</title>
    <style>
        #box-choice {

        }
    </style>
</head>
<body>
<h1>SANDWITCH CONDIMENTS</h1>
<form action="/save" method="post">
    <table>
        <tr>
            <td><input type="checkbox" name="condiments" value="lettuce"> Lettuce</td>
            <td><input type="checkbox" name="condiments" value="tomato"> Tomato</td>
            <td><input type="checkbox" name="condiments" value="mustard"> Mustard</td>
            <td><input type="checkbox" name="condiments" value="sprouts"> Sprouts</td>
        </tr>
        <tr>
            <td><input type="submit" value="save"></td>
        </tr>
    </table>
</form>
</body>
</html>
