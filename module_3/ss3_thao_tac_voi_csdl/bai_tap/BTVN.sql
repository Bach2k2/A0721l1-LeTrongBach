-- Lấy ra thông tin của các học viên đang theo học tại lớp, và lớp đó do giảng viên nào dạy?
use cg_student_manage;
select ten_hoc_vien,ten_lop,ten_giang_vien from hoc_vien
inner join lop_hoc on lop_hoc.ma_lop_hoc=hoc_vien.ma_lop_hoc
inner join giang_vien_day_lop_hoc on giang_vien_day_lop_hoc.ma_lop_hoc=lop_hoc.ma_lop_hoc
inner join giang_vien on giang_vien_day_lop_hoc.ma_giang_vien=giang_vien.ma_giang_vien;
select * from hoc_vien;
select hoc_vien.*,max(Year(ngay_sinh)) as Nguoi_nho_nhat from hoc_vien;
select hoc_vien.*,min(Year(ngay_sinh)) as Nguoi_lon_nhat from hoc_vien;