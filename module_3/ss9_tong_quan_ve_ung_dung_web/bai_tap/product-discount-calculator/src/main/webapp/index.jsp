<%--
  Created by IntelliJ IDEA.
  User: DE
  Date: 31/12/2021
  Time: 12:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Calculator</title>
  </head>
  <body>
  <form action="/display-discount" method="post">
    <h4>Product Description </h4> <input type="text" name="product_desc" width="200px" placeholder="type the description here">
    <h4>List Price </h4> <input type="text" name="list_price" width="200px" placeholder="type the price here">
    <h4>Discount Percent </h4> <input type="text" name="dis_percent" width="300px" placeholder="type the discount percent here (%) ">
    <input type="submit" value="Send" width="100px"/>
  </form>
  </body>
</html>
