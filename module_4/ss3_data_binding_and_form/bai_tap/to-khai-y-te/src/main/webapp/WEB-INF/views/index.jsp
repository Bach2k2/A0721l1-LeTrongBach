<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Tờ khai y tế Đà Nẵng</title>
    <style>
        .declare {
            text-align: center;
            font-family: Arial, Tahoma;
            font-size: 20px;
            color: black;
        }
    </style>
</head>
<body>
<div class="declare">
    <h1>Tờ khai y tế</h1>
    <p>ĐÂY LÀ TÀI LIỆU QUAN TRỌNG, THÔNG TIN CỦA ANH/CHỊ SẼ GIÚP CƠ QUAN Y TẾ LIÊN LẠC KHI CẦN THIẾT ĐỂ PHÒNG CHỐNG DỊCH
        BỆNH TRUYỀN NHIỄM.</p>
    <p style="color: red; font-size: 16px"></p>
</div>
<form:form action="/declare" method="post" modelAttribute="declaredForm">
    <table>
        <tr>
            <td><form:label path="name">Họ tên( ghi chữ in hoa)</form:label></td>
            <form:input path="name"></form:input>
        </tr>
        <tr>
            <td><form:label path="">Năm sinh:</form:label></td>
            <form:input path="yearBirth"></form:input>
        </tr>
        <tr>
            <td>Giới tính</td>
            <td><form:select path="gender">
                <form:option value="Nam">Nam</form:option>
                <form:option value="Nữ">Nữ</form:option>
            </form:select></td>
        </tr>
        <tr>
            <td>Quốc tịch</td>
            <td><form:select path="nationality">
                <form:option value="VietNam">Việt Nam</form:option>
                <form:option value="Anh">English</form:option>
            </form:select></td>
        </tr>
        <tr>
            <td><form:label
                    path="identityCard">Số hộ chiếu hoặc số CMND hoặc giấy thông hành hợp pháp khác</form:label></td>
            <td><form:input path="identityCard"></form:input></td>
        </tr>
        <tr>
            <td><form:label path="transportName">thông tin đi lai</form:label></td>
            <td><form:radiobuttons path="transportName">

            </form:radiobuttons></td>
        </tr>
        <tr>
            <td><form:label path="transportId">Ngày khởi hành</form:label></td>
            <td><form:input path="transportId"></form:input></td>
        </tr>
        <tr>
            <td><form:label path="seatNum">Ngày khởi hành</form:label></td>
            <td><form:input path="seatNum"></form:input></td>
        </tr>
        <tr>
            <td><form:label path="departureDate">Ngày khởi hành</form:label></td>
            <td><form:input path="departureDate"></form:input></td>
        </tr>
        <tr>
            <td><form:label path="returnDate"></form:label></td>
            <td><form:input path="returnDate"></form:input></td>
        </tr>
        <tr>
            <td><form:label path="_14DaysAgo"></form:label></td>
            <td><form:input path="_14DaysAgo"></form:input></td>
        </tr>
        <tr>
            <td><form:label path="city"></form:label></td>
            <td><form:input path="city"></form:input></td>
        </tr>
        <tr>
            <td><form:label path="district"></form:label></td>
            <td><form:input path="district"></form:input></td>
        </tr>
        <tr>
            <td><form:label path="district"></form:label></td>
            <td><form:input path="district"></form:input></td>
        </tr>
        <tr>
            <td><input type="submit" value="gửi"></td>
        </tr>
    </table>

</form:form>
</body>
</html>
