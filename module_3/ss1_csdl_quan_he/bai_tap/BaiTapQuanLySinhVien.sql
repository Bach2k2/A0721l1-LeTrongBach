create database `student-management`;
use `student-management`;
create Table Class
(
id int primary key auto_increment,
name nvarchar(20) 
);
create Table Teacher
(
id int primary key auto_increment,
name nvarchar(20),
age int check (age>0),
country nvarchar(15) 
);