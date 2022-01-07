<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: DE
  Date: 6/1/2022
  Time: 8:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Index</title>
  </head>
  <body>
    <h1> Hello </h1>
    <%
      Date date = new Date();
      System.out.println(date.toString());
    %>
  <script>
    document.writeln("Hi Bach");
  </script>
  </body>
</html>
