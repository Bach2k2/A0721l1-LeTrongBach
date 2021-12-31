<%@ page import="repos.CustomerRepos" %>
<%@ page import="model.Customer" %><%--
  Created by IntelliJ IDEA.
  User: DE
  Date: 31/12/2021
  Time: 2:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Customer List</title>
  <style>
    body{
      font-family: Tahoma;
    }
  </style>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
<h4 style="text-align: center">Danh sách khách hàng</h4>
<table border="1px solid black" width="1000px">
  <tr>
    <td>Tên</td>
    <td>Ngày sinh</td>
    <td>Địa chỉ</td>
    <td>Ảnh</td>
  </tr>
  <% CustomerRepos customerRepos = new CustomerRepos();
    for (Customer customer : customerRepos.findAll()) {%>
  <tr>
    <td><%=customer.getName()%></td>
    <td><%=customer.getBirth()%>></td>
    <td><%=customer.getAddress()%>/td>
    <td><%=customer.getImage()%></td>
  </tr>
  <%}%>
</table>
</body>
</html>
