select * from Product;

-- yeu cau 1:
create unique index idx_productCode on Product (ProductCode);
explain select * from product;

Create index idx_pName_pPrice on Product (ProductName,ProductPrice);
explain select * from product 
where productName like 'D%' and productPrice>=22000000;
-- Ket luan : toc do nhanh hon

-- yeu cau 2:
Create view product_views as
select  productCode, productName, productPrice, productStatus from Product;
-- Goi view:
select * from product_views;
-- Update views: 
Create or replace view product_views as
select productCode, productName, productPrice from Product
where productName='Acer';
-- Xoa view
drop view product_views;

-- Tao Procedure:
Delimiter //
Create Procedure display()
begin
	select * from Product;
end // 
Delimiter ;
call display;

 Delimiter //
Create Procedure addNewProduct(
	in pName varchar(50),
	in price int,
	in amount int,
	in pDescription varchar(50),
	in pStatus bit)

begin
	insert into Product(productName,productPrice,productAmount,productDescription,productStatus) 
    value (pName,price,amount,pDescription,pStatus);
end // 
Delimiter ;
call addNewProduct("Acer",3000000,2,"Modern",1);