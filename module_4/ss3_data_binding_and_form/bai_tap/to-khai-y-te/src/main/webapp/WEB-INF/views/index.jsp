<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Tờ khai y tế Đà Nẵng</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
    <style>
        .content {
            width: 100%;
        }

        .header {
            text-align: center;
            font-family: Arial, Tahoma;
            font-size: 20px;
            color: black;
        }

        .footer {
            text-align: center;
            font-family: Arial, Tahoma;
            font-size: 20px;
            color: green;
        }

        span {
            color: red;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="content">
        <div class="header">
            <h1>Tờ khai y tế</h1>
            <p>ĐÂY LÀ TÀI LIỆU QUAN TRỌNG, THÔNG TIN CỦA ANH/CHỊ SẼ GIÚP CƠ QUAN Y TẾ LIÊN LẠC KHI CẦN THIẾT ĐỂ PHÒNG
                CHỐNG
                DỊCH
                BỆNH TRUYỀN NHIỄM.</p>
            <p style="color: red; font-size: 16px">Khuyến cáo, khai báo thông tin sai là vi phạm phạm pháp luật Việt Nam
                và
                có thể xử lý hình sự</p>
        </div>
        <div style="text-align: left">
            <form:form action="/declare" method="post" modelAttribute="declaredForm">
            <table class="tab-header-background">
                <tr>
                    <th colspan="6"><form:label path="name">Họ tên(Ghi chữ in hoa)</form:label></th>
                </tr>
                <tr>
                    <td colspan="6"><form:input path="name" size="100%"></form:input></td>
                </tr>
                <tr>
                    <th colspan="2"><form:label path="yearBirth">Năm sinh: </form:label></th>
                    <th colspan="2"><form:label path="gender">Giới tính</form:label></th>
                    <th colspan="2"><form:label path="nationality">Quốc tịch</form:label></th>
                </tr>
                <tr>

                    <td colspan="2"><form:input path="yearBirth"></form:input></td>
                    <td colspan="2"><form:select path="gender">
                        <form:option value="Nam">Nam</form:option>
                        <form:option value="Nữ">Nữ</form:option>
                    </form:select></td>
                    <td colspan="2"><form:select path="nationality">
                        <form:option value="VietNam">Việt Nam</form:option>
                        <form:option value="Anh">English</form:option>
                    </form:select></td>
                </tr>
                <tr>
                    <td colspan="6"><form:label
                            path="identityCard">Số hộ chiếu hoặc số CMND hoặc giấy thông hành hợp pháp khác</form:label></td>

                </tr>
                <tr>
                    <td colspan="6"><form:input path="identityCard"></form:input></td>
                </tr>
                    <%--            Chỉnh sửa code--%>
                    <%--            <tr>--%>
                    <%--                <td><form:label path="transportName">Thông tin đi lai</form:label></td>--%>
                    <%--                <td><form:radiobuttons path="transportName" items="${transportNameArray}" itemValue="${transportNameValues}"></form:radiobuttons></td>--%>
                    <%--            </tr>--%>
                <tr>
                    <td colspan="3"><form:radiobutton path="transportName" label="Tàu bay"
                                                      value="Tàu bay"></form:radiobutton>
                        <form:radiobutton path="transportName" label="Tàu thuyền"
                                          value="Tàu thuyền"></form:radiobutton>
                        <form:radiobutton path="transportName" label="Ô tô" value="Ô tô"></form:radiobutton>
                        <form:radiobutton path="transportName" label="khác" value="khác"></form:radiobutton></td>
                    <td colspan="3"></td>

                </tr>
                <tr>
                    <td><form:label path="transportId">Số hiệu phương tiện: </form:label></td>
                    <td><form:input path="transportId"></form:input></td>
                </tr>
                <tr>
                    <td><form:label path="seatNum">Số ghế</form:label></td>
                    <td><form:input path="seatNum"></form:input></td>
                </tr>
                <tr>
                    <td><form:label path="departureDate">Ngày khởi hành</form:label></td>
                    <td><form:input path="departureDate"></form:input></td>
                </tr>
                <tr>
                    <td><form:label path="returnDate">Ngày kết thúc</form:label></td>
                    <td><form:input path="returnDate"></form:input></td>
                </tr>
                <tr>
                    <td><form:label
                            path="_14DaysAgo">Trong vòng 14 ngày qua,Anh/Chị có đi đến Tỉnh/Thành phố nào không?</form:label></td>
                    <td><form:textarea path="_14DaysAgo" rows="3" cols="9"></form:textarea></td>
                </tr>
                <tr>
                    <th>Địa chỉ liên lạc</th>
                </tr>
                <tr>
                    <td><form:label path="city">Tỉnh/ thành <span>(*)</span></form:label></td>
                    <td><form:select path="city"></form:select></td>
                </tr>
                <tr>
                    <td><form:label path="district">Quận/huyện</form:label></td>
                    <td><form:input path="district"></form:input></td>
                </tr>
                <tr>
                    <td><form:label path="ward">Phường/xã</form:label></td>
                    <td><form:input path="ward"></form:input></td>
                </tr>
                <tr>
                    <td><form:label path="currentAddress">Địa chỉ hiện tại</form:label></td>
                    <td><form:input path="currentAddress"></form:input></td>
                </tr>
                <tr>
                    <td><form:label path="phoneNumber">Điện thoại</form:label></td>
                    <td><form:label path="email">Email</form:label></td>

                </tr>
                <tr>
                    <td><form:input path="phoneNumber"></form:input></td>
                    <td><form:input path="email"></form:input></td>
                </tr>
                    <%--        <tr>--%>
                    <%--            <td><form:radiobuttons path="symptom" items="${symptom}"></form:radiobuttons></td>--%>
                    <%--        </tr>--%>
                <tr>
                    <th>Trong vòng 14 ngày qua, Anh/Chị có thấy xuất hiện giá trị nào sau đây không?</th>
                </tr>
<%--                <tr>--%>
<%--                    <th>Triệu chứng</th>--%>
<%--                    <td>Có</td>--%>
<%--                    <td>Không</td>--%>
<%--                    <th>Triệu chứng</th>--%>
<%--                    <td>Có</td>--%>
<%--                    <td>Không</td>--%>
<%--                </tr>--%>
<%--                <tr>--%>
<%--                    <td><form:label path="symptom">Sốt</form:label></td>--%>
<%--                    <td><form:radiobutton path="symptom">Có</form:radiobutton></td>--%>
<%--                    <td><form:radiobutton path="symptom" value="${false}">Không</form:radiobutton></td>--%>
<%--                    <td><form:label path="symptom">Nôn/buồn nôn</form:label></td>--%>
<%--                    <td><form:radiobutton path="symptom" value="${true}">Có</form:radiobutton></td>--%>
<%--                    <td><form:radiobutton path="symptom" value="${false}">Không</form:radiobutton></td>--%>
<%--                </tr>--%>

            </table>
        </div>


        <div class="footer">
            <p>Dữ liệu bạn cung cấp hoàn toàn bảo mật và chỉ phục vụ cho việc phòng chống dịch, thuộc ban quản lý
                của Ban chỉ đạo quốc gia về Phòng chống dịch Covid 19 </p>
            <p>Khi bạn nhấn nút "Gửi" là bạn đã đồng ý</p>
            <input type="submit" value="GỬI TỜ KHAI" style="color: white;background-color: green">
        </div>
        </form:form>
    </div>
</div>
</body>
</html>
