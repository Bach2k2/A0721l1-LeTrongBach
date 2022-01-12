-- Tạo view:
CREATE VIEW customer_views AS

SELECT customerNumber, customerName, phone

FROM  customers;
-- Goi view:
select * from customer_views;

--  Update view:

CREATE OR REPLACE VIEW customer_views AS

SELECT customerNumber, customerName, contactFirstName, contactLastName, phone

FROM customers

WHERE city = 'Nantes';

-- Xoa views:
DROP VIEW customer_views;