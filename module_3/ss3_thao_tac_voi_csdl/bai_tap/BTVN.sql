-- Lấy ra thông tin của các học viên đang theo học tại lớp, và lớp đó do giảng viên nào dạy?
use cg_student_manage;
select ten_hoc_vien,ten_lop,ten_giang_vien from hoc_vien
inner join lop_hoc on lop_hoc.ma_lop_hoc=hoc_vien.ma_lop_hoc
inner join giang_vien_day_lop_hoc on giang_vien_day_lop_hoc.ma_lop_hoc=lop_hoc.ma_lop_hoc
inner join giang_vien on giang_vien_day_lop_hoc.ma_giang_vien=giang_vien.ma_giang_vien;
select * from hoc_vien;
select hoc_vien.*,max(Year(ngay_sinh)) as Nguoi_nho_nhat from hoc_vien;
select hoc_vien.*,min(Year(ngay_sinh)) as Nguoi_lon_nhat from hoc_vien 
group by ma_lop_hoc;

-- Yeu cau 4: Liet ke ten hoc sinh lan giang vien: 
select ma_hoc_vien as "ma_HV", ten_hoc_vien as "Ten_hv" ,"Hoc vien" as "role" from hoc_vien
union 
select ma_giang_vien as "ma_GV", ten_giang_vien as "Ten_gv",'Giang vien' as "role" from giang_vien;
-- Yeu cau 5: Chọn ra 3 người nhỏ tuổi nhất;
select * from hoc_vien order by ngay_sinh desc limit 3;
-- yeu cau 6 : chon 2 them 2nguoi nho tuoi nhat
select * from hoc_vien order by ngay_sinh desc limit 4,2;

-- Yeu ca 7 :Lay ra ten hoc vien co chu bat dau la A:
-- Cach 1:
select * from lop_hoc inner join hoc_vien on 
lop_hoc.ma_lop_hoc=hoc_vien.ma_lop_hoc
where hoc_vien.ten_hoc_vien like 'A%';
-- Cach 2:
select * from lop_hoc where lop_hoc.ma_lop_hoc = (select hoc_vien.ma_lop_hoc from hoc_vien where hoc_vien.ten_hoc_vien like 'A%';
-- Cach 3:
select * from lop_hoc;

select * from lop_hoc where exists( select * from hoc_vien where hoc_vien.ten_hoc_vien like "L%" and lop_hoc.ma_lop_hoc=hoc_vien.ma_lop_hoc);