-- Tạo một Procedure có tham số là id để in ra khách hàng có id cần tìm
DELIMITER //

CREATE PROCEDURE getCusById

(IN cusNum INT(11))

BEGIN

  SELECT * FROM customers WHERE customerNumber = cusNum;

END //

DELIMITER ;
-- Hàm gọi Procedure 'getCusById' ra
call getCusById(175);

-- Procedure:
DELIMITER //
CREATE PROCEDURE GetCustomersCountByCity(

    IN  in_city VARCHAR(50),

    OUT total INT

)

BEGIN

    SELECT COUNT(customerNumber)

    INTO total

    FROM customers

    WHERE city = in_city;

END//

DELIMITER ;

-- Gọi Procedure với 2 tham số tên procedure và total.
CALL GetCustomersCountByCity('Lyon',@total);

SELECT @total;

-- PROCEDURE 3:
DELIMITER //

CREATE PROCEDURE SetCounter(

    INOUT counter INT,

    IN inc INT

)

BEGIN

    SET counter = counter + inc;

END//

DELIMITER ;