<%--
  Created by IntelliJ IDEA.
  User: DE
  Date: 20/2/2022
  Time: 4:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Calculator</title>
</head>
<body>
<h1>Calculator online</h1>
<form action="calculate" method="post">
    <h4 style="color: red">${message}</h4>
    <div>
        <input type="text" name="first" width="100px"/>
        <input type="text" name="second" width="100px"/>
    </div>

    <br>
    <div style="top: 10px">
        <input type="submit" name="implement" value="Addition(+)" width="25px"/>
        <input type="submit" name="implement" value="Subtraction(-)" width="25px"/>
        <input type="submit" name="implement" value="Multiplication(X)" width="25px"/>
        <input type="submit" name="implement" value="Division(/)" width="25px"/>
    </div>

    <br>
    <h3>Result ${implement}: ${result}</h3>
</form>

</body>
</html>
