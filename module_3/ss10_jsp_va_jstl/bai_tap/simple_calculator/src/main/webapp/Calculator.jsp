<%--
  Created by IntelliJ IDEA.
  User: DE
  Date: 31/12/2021
  Time: 4:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Calculator</title>
</head>
<body>
<span>${message}</span>
<form method="get" action="calculate">
    <table>
        <tr>
            <th>Fisrt Operand:</th>
            <td><input type="text" name="first" placeholder="type here" width="200px value="${firstNum}"/></td>
        </tr>
        <tr>
            <th>Operator:</th>
            <td>
                <select name="operator" value="${operator }">
                    <option value="+">Addition</option>
                    <option value="-">Subtraction</option>
                    <option value="*">Multiplication</option>
                    <option value="/">Division</option>
                </select>
            </td>
        </tr>
        <tr>
            <th>Second Operand:</th>
            <td><input type="text" name="second" placeholder="type here" width="200px value=${secondNum}"/></td>
        </tr>
        <tr>
            <td></td>
            <td>
                <button type="submit">Calculate</button>
            </td>
        </tr>
        <tr>
            <th> Result: </th>
            <td><input value="${requestScope["result"]}"></td>
        </tr>
    </table>
</form>
</body>
</html>
