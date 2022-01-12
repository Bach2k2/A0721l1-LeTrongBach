use cg_student_manage;
create table tai_khoan
(
username varchar(15) primary key,
password char(12) not null -- bat buoc
);
create table hoc_vien
(
ma_hoc_vien varchar(15) primary key,
ten_hoc_vien varchar(15),
ngay_sinh date,
email varchar(20),
username varchar(15) unique,
ma_lop_hoc varchar(7) not null,
foreign key(ma_lop_hoc) references lop_hoc(ma_lop_hoc),
foreign key(username) references  tai_khoan(username)
);

create table dia_chi
( ma_dia_chi varchar(3) primary key,
ten_dia_chi varchar(20),
ma_hoc_vien varchar(40),
constraint fk_mhv_mdc foreign key(ma_hoc_vien) references hoc_vien(ma_hoc_vien)
);
create table lop_hoc
(
ma_lop_hoc varchar(7) primary key,
ten_lop varchar(15)
);
create table giang_vien(
ma_giang_vien varchar(7) primary key,
ten_giang_vien varchar(15) unique,
ngay_sinh date
);
create table giang_vien_day_lop_hoc
(
	ma_giang_vien varchar(7),
    ma_lop_hoc varchar(7),
    primary key(ma_giang_vien,ma_lop_hoc),
    foreign key(ma_giang_vien) references giang_vien(ma_giang_vien),
    foreign key(ma_lop_hoc) references lop_hoc(ma_lop_hoc)
);
insert into tai_khoan values
('LeTrongBach_CG','bach123'),
('LeNhatHuy_CG','huy456'),
('NguyenVanTi_CG','Tidev012'),
('NguyenVanTy_CG','Ty2000'),
('BuiThiHang_CG','Hang2002'),
('LuongThiXuan_CG','Xuancute'),
('Yasuo010gg_CG','hasagi123');
insert into lop_hoc values
('A0721i1','Lop Java i1'),
('A0721i2','Lop Java i2'),
('A0821i1','Lop PHP i1'),
('A0821i2','Lop PHP i2'),
('A0921i1','Lop Python i1'),
('A0921i2','Lop Python i2'),
('B012345','Lop  C#');
insert into hoc_vien values
('HV01','Le Trong Bach','2002-11-3','bach.codegym@gmail.com','LeTrongBach_CG','A0721i1'),
('HV02','Le Nhat Huy','2002-11-4','Huy.codegym@gmail.com','LeNhatHuy_CG','A0721i1'),
('HV03','Nguyen Van Ti','2000-10-3','tiQuay.codegym@gmail.com','NguyenVanTi_CG','A0721i2'),
('HV04','Nguyen Van Ty','1999-5-4','TyVan.codegym@gmail.com','NguyenVanTy_CG','A0721i2'),
('HV05','Bui Thi Hang','2003-12-15','hangSan.codegym@gmail.com','BuiThiHang_CG','A0721i2'),
('HV06','Luong Thi Xuan','2003-10-2','xuanCute.codegym@gmail.com','LuongThiXuan_CG','A0721i1'),
('HV07','Dao Huy Tuong','2001-1-1','TuongSV.codegym@gmail.com','Yasuo010gg_CG','A0721i2');
insert into dia_chi values
('K01','Ngu Hanh Son','HV01'),
('K02','Son Tra','HV02'),
('K03','Hai Chau','HV03'),
('K04','Thanh Khe','HV04'),
('K05','Cam Le','HV05'),
('K06','Lien Chieu','HV06'),
('K07','Hoa Vang','HV07');
insert into giang_vien values
('T01','NV Chanh','1985-10-11'),
('T02','DP Trung','1984-9-12'),
('T03','DN Linh','1988-8-13'),
('T04','TT Hai','1989-7-14'),
('T05','ND Linh','1987-6-12'),
('T06','NV Quoc Anh','1990-5-11'),
('T07','LV Nguyen','1990-5-11');
insert into giang_vien_day_lop_hoc values
('T01','A0721i1'),
('T02','A0721i2'),
('T03','A0721i1'),
('T04','A0721i2'),
('T05','A0821i1'),
('T06','A0821i2'),
('T07','A0821i1'),
('T01','A0921i1'),
('T02','A0921i2'),
('T03','B012345');

select * from lop_hoc;
select ten_hoc_vien,ten_lop,ten_giang_vien from hoc_vien
 join lop_hoc on lop_hoc.ma_lop_hoc=hoc_vien.ma_lop_hoc
 join giang_vien_day_lop_hoc on giang_vien_day_lop_hoc.ma_lop_hoc=lop_hoc.ma_lop_hoc
join giang_vien on giang_vien_day_lop_hoc.ma_giang_vien=giang_vien.ma_giang_vien;







