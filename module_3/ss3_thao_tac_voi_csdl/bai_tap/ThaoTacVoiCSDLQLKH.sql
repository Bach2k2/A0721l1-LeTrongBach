use quanlibanhang;
select * from Customer;
insert into Customer(cName,cAge) values
("Minh Quan",10),
("Ngoc Oanh",20),
("Hong Ha",50);

insert into Product(pName,pPrice) values
("May giat",3),
("Tu lanh",5),
("Dieu hoa",7),
("May giat",3),
("Quat",1),
("Bep Dien",2);

insert into `order`(oId,cId,oDate,oTotalPrice) values
(1,1,'2006-3-21',null),
(2,2,'2006-6-6',null),
(3,1,'2007-3-1',null);
insert into orderdetail values
(1,1,3),
(1,3,7),
(1,4,2),
(2,1,1),
(3,1,8),
(2,5,4);
-- Yeu cau 1:
select oId,oDate,oTotalPrice from `order` ;
-- Yeu cau 2:
select product.*,customer.* from Customer join `order` on Customer.cId=`order`.cId
where Customer.cId in (select cId from `Order`)
Union all
select  Product.* from Product join orderdetail on Product.pId=orderdetail.pId
where orderdetail.oId in (select oId from `Order`)
group by pId;
-- Bai sua: 
   -- Yeu cau 2:
select product.*,customer.* from customer inner join `order` on customer.cId=`order`.cID 
inner join orderdetail on orderdetail.oId=`order`.oId
inner join product on orderdetail.pID=product.pId
group by customer.cId,product.pId ;
-- Yeu cau 3:
select cName from Customer
where cId not in (select cId from `order`); 
-- Yeu cau 4:
select `order`.oId,oDate,odQTY * pPrice as oTotalPrice from `Order`
join Orderdetail on `order`.oId=Orderdetail.oId
join Product on Orderdetail.pId=Product.pId;
-- Bai sua: 

select `order`.oId,oDate, sum(odQTY * pPrice) as
oTotalPrice from `order`
join Orderdetail on `order`.oId=Orderdetail.oId
join Product on Orderdetail.pId=Product.pId
group by `order`.oId;

	
    
 