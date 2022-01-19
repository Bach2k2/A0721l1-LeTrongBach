
 -- Yeu cau 11:
 select dich_vu_di_kem.* from dich_vu_di_kem
 inner join hop_dong_chi_tiet on dich_vu_di_kem.ma_dich_vu_di_kem=hop_dong_chi_tiet.ma_dich_vu_di_kem
 inner join hop_dong on hop_dong.ma_hop_dong=hop_dong_chi_tiet.ma_hop_dong
 inner join khach_hang on khach_hang.ma_khach_hang=hop_dong.ma_khach_hang
 inner join loai_khach on loai_khach.ma_loai_khach=khach_hang.ma_loai_khach
 where ten_loai_khach="Diamond" and dia_chi like "%Vinh" or  dia_chi like "%Quang Ngai";
 
 -- Yeu cau 12:
 select hop_dong.ma_hop_dong, nhan_vien.ho_ten,khach_hang.ho_ten,khach_hang.so_dien_thoai,dich_vu.ma_dich_vu,ten_dich_vu,
count(hop_dong_chi_tiet.ma_hop_dong_chi_tiet) as so_luong_dich_vu_di_kem, tien_dat_coc 
 from nhan_vien inner join hop_dong on nhan_vien.ma_nhan_vien=hop_dong.ma_nhan_vien
 inner join khach_hang on hop_dong.ma_khach_hang=khach_hang.ma_khach_hang
 inner join hop_dong_chi_tiet on hop_dong.ma_hop_dong=hop_dong_chi_tiet.ma_hop_dong
 inner join dich_vu_di_kem on hop_dong_chi_tiet.ma_dich_vu_di_kem=dich_vu_di_kem.ma_dich_vu_di_kem
 inner join dich_vu on dich_vu.ma_dich_vu=hop_dong.ma_dich_vu
 where( khach_hang.ma_khach_hang in (select ma_khach_hang from hop_dong  
 where (ngay_lam_hop_dong between "2020-10-1" and "2020-12-31")))
 and (ngay_lam_hop_dong not in(select ngay_lam_hop_dong from hop_dong 
 where (ngay_lam_hop_dong between "2021-1-1" and "2021-6-30")))
 group by ma_hop_dong_chi_tiet;

   -- Yeu cau 12:
 select hop_dong.ma_hop_dong, nhan_vien.ho_ten,khach_hang.ho_ten,khach_hang.so_dien_thoai,dich_vu.ma_dich_vu,ten_dich_vu,
count(hop_dong_chi_tiet.ma_hop_dong_chi_tiet) as so_luong_dich_vu_di_kem, tien_dat_coc 
 from nhan_vien inner join hop_dong on nhan_vien.ma_nhan_vien=hop_dong.ma_nhan_vien
 inner join khach_hang on hop_dong.ma_khach_hang=khach_hang.ma_khach_hang
 inner join hop_dong_chi_tiet on hop_dong.ma_hop_dong=hop_dong_chi_tiet.ma_hop_dong
 inner join dich_vu_di_kem on hop_dong_chi_tiet.ma_dich_vu_di_kem=dich_vu_di_kem.ma_dich_vu_di_kem
 inner join dich_vu on dich_vu.ma_dich_vu=hop_dong.ma_dich_vu
 where exists (select hop_dong.ma_hop_dong where ngay_lam_hop_dong between  "2020-10-1" and "2020-12-31")
and not exists (select hop_dong.ma_hop_dong where ngay_lam_hop_dong between  "2021-1-1" and "2021-6-30");
	
-- Yêu cầu 13:
select dich_vu_di_kem.* ,count(hop_dong_chi_tiet.ma_dich_vu_di_kem) as so_lan from dich_vu_di_kem
inner join hop_dong_chi_tiet on dich_vu_di_kem.ma_dich_vu_di_kem=hop_dong_chi_tiet.ma_dich_vu_di_kem
inner join hop_dong on hop_dong_chi_tiet.ma_hop_dong=hop_dong.ma_hop_dong
where count(hop_dong_chi_tiet.ma_dich_vu_di_kem) >= all (select count(hop_dong_chi_tiet.ma_dich_vu_di_kem) from hop_dong_chi_tiet group by hop_dong_chi_tiet.ma_dich_vu_di_kem)
group by hop_dong_chi_tiet.ma_dich_vu_di_kem
order by so_lan desc;

-- Bai sua:
create temporary table Dem_so_lan
select ten_dich_vu_di_kem,count(hop_dong_chi_tiet.ma_dich_vu_di_kem) as so_lan from hop_dong_chi_tiet
inner join dich_vu_di_kem on hop_dong_chi_tiet.ma_dich_vu_di_kem=dich_vu_di_kem.ma_dich_vu_di_kem
group by dich_vu_di_kem.ma_dich_vu_di_kem;

create temporary table Lay_max_so_lan
select max(dem_so_lan.so_lan) as max_so_lan_su_dung from dem_so_lan;
select * from lay_max_so_lan;

select dem_so_lan.ten_dich_vu_di_kem,dem_so_lan.so_lan from dem_so_lan inner join Lay_max_so_lan on 
dem_so_lan.so_lan=lay_max_so_lan.max_so_lan_su_dung;
drop temporary table dem_so_lan;
drop temporary table lay_max_so_lan;
-- yeu cau 14:
select hop_dong.ma_hop_dong, ten_loai_dich_vu, ten_dich_vu_di_kem,count(hop_dong_chi_tiet.ma_dich_vu_di_kem) as so_lan_su_dung from hop_dong
inner join dich_vu on hop_dong.ma_dich_vu=dich_vu.ma_dich_vu
inner join loai_dich_vu on dich_vu.ma_loai_dich_vu=loai_dich_vu.ma_loai_dich_vu
inner join hop_dong_chi_tiet on hop_dong_chi_tiet.ma_hop_dong=hop_dong.ma_hop_dong
inner join dich_vu_di_kem on dich_vu_di_kem.ma_dich_vu_di_kem=hop_dong_chi_tiet.ma_dich_vu_di_kem
group by hop_dong_chi_tiet.ma_dich_vu_di_kem
having count(hop_dong_chi_tiet.ma_dich_vu_di_kem)=1;

-- yeu cau 15
select nhan_vien.ma_nhan_vien,ho_ten,ten_trinh_do,ten_bo_phan,so_dien_thoai,dia_chi from nhan_vien
inner join hop_dong on hop_dong.ma_nhan_vien=nhan_vien.ma_nhan_vien
inner join trinh_do on nhan_vien.ma_trinh_do=trinh_do.ma_trinh_do
inner join bo_phan on nhan_vien.ma_bo_phan=bo_phan.ma_bo_phan
where year(ngay_lam_hop_dong) between 2020 and 2021
group by hop_dong.ma_nhan_vien
having count(hop_dong.ma_nhan_vien)<=3;
