create database quanlybanhang;
use quanlybanhang;
create table Customer
(cId int primary key auto_increment,
cName varchar(25) not null,
cAge tinyint check(cAge>0)
);
create table `Order`
(oId int primary key auto_increment,
cId int,
oDate date,
oTotalPrice int ,
foreign key (cId) references Customer(cId)
);
create table Product
( pId int primary key auto_increment,
pName varchar(25),
pPrice int
);
create table OderDetail
(oId int ,
pId int,
odQTy int,
foreign key(oId) references `Order`(oId),
foreign key(pId) references Product(pId)
);