<%--
  Created by IntelliJ IDEA.
  User: DE
  Date: 18/2/2022
  Time: 2:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home page</title>
</head>
<body>
<h1>Email Validate</h1>
<h3 style="color: red">${message}</h3>
<form action="/validate" method="post">
   <table>
       <tr>
           <td>Email:</td>
           <td><input type="text" name="email"></td>
       </tr>
       <tr>
           <td></td>
           <td><input type="submit" value="Validate"></td>
       </tr>
   </table>

</form>


</body>
</html>
