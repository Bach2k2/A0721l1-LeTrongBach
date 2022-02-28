<%--
  Created by IntelliJ IDEA.
  User: DE
  Date: 27/2/2022
  Time: 10:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Tờ khai y tế Đà Nẵng</title>
    <style>
        span{
            color: red;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="header">
        <h1>Tờ khai y tế</h1>
        <p>ĐÂY LÀ TÀI LIỆU QUAN TRỌNG, THÔNG TIN CỦA ANH/CHỊ SẼ GIÚP CƠ QUAN Y TẾ LIÊN LẠC KHI CẦN THIẾT ĐỂ PHÒNG CHỐNG
            DỊCH
            BỆNH TRUYỀN NHIỄM.</p>
        <p style="color: red; font-size: 16px">Khuyến cáo, khai báo thông tin sai là vi phạm phạm pháp luật Việt Nam và
            có thể xử lý hình sự</p>
    </div>
    <form:form method="post" action="/declare" modelAttribute="declaredForm">
       <div>
           <p>Họ tên( Ghi chữ hoa)<span>(*)</span></p>
           <p><form:input path="name" size="100px"></form:input></p>
       </div>
        <div>
            <p>Họ tên( Ghi chữ hoa)<span>(*)</span></p>
            <p><form:input path="yearBirth"></form:input></p>
        </div>
    </form:form>
</div>
</body>
</html>
