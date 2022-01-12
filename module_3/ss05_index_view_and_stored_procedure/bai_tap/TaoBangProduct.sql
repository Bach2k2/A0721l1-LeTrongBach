create database demo;
use demo;
create table Product
(id int primary key auto_increment,
productCode char(10),
productName varchar(50),
productPrice int,
productAmount int,
productDescription varchar(50),
productStatus bit
);
insert into Product values
(1,"P001","Dell",21490000,10,"Dell Vostro",1),
(2,"P002","HP",21790000,50,"HP Pavilion 15",1),
(3,"P003","Dell",22470000,15,"Dell Inspiron",1),
(4,"P004","Dell",24990000,20,"Dell Latitude",0);

