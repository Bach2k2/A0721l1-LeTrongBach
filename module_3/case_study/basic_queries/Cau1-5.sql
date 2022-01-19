-- Yeu cau 2:
select nhan_vien.* from nhan_vien
where (ho_ten like 'H%' or ho_ten like 'K%' or ho_ten like 'T%')and length(ho_ten)<=15;

-- Yeu cau 3:
select khach_hang.* from khach_hang
where (year(curdate())-year(ngay_sinh) between 18 and 50) 
and (dia_chi like "%Quang Tri" or dia_chi like "%Da Nang"); 

-- Yeu cau 4:
	select khach_hang.ma_khach_hang,khach_hang.ho_ten, count(hop_dong.ma_khach_hang) as so_lan_dat_phong from khach_hang
    inner join hop_dong on khach_hang.ma_khach_hang=hop_dong.ma_khach_hang
    where ma_loai_khach in (select ma_loai_khach from loai_khach where ten_loai_khach="Diamond")
    group by hop_dong.ma_khach_hang
    order by so_lan_dat_phong asc;
    
    -- Yeu cau 5:
    select khach_hang.ma_khach_hang, ho_ten, ten_loai_khach,hop_dong.ma_hop_dong, ten_dich_vu, ngay_lam_hop_dong, ngay_ket_thuc,
    sum(dich_vu.chi_phi_thue+(hop_dong_chi_tiet.so_luong*dich_vu_di_kem.gia)) as tong_tien
    from khach_hang left join hop_dong on khach_hang.ma_khach_hang=hop_dong.ma_khach_hang
	left join loai_khach on loai_khach.ma_loai_khach=khach_hang.ma_loai_khach
    left join dich_vu on hop_dong.ma_dich_vu=dich_vu.ma_dich_vu
    left join hop_dong_chi_tiet on hop_dong.ma_hop_dong=hop_dong_chi_tiet.ma_hop_dong
    left join dich_vu_di_kem on dich_vu_di_kem.ma_dich_vu_di_kem=hop_dong_chi_tiet.ma_dich_vu_di_kem
    group by hop_dong.ma_hop_dong;

    

-- Yeu cau 16
alter table hop_dong
drop constraint hop_dong_ibfk_1;

delete from nhan_vien where not exists (select nhan_vien.ma_nhan_vien from hop_dong
where hop_dong.ngay_lam_hop_dong between '2017-1-1' and '2019-12-31' and hop_dong.ma_nhan_vien=nhan_vien.ma_nhan_vien);


-- Yeu cau 17 --Dung
update khach_hang ,(select hop_dong.ma_hop_dong as id,sum(hop_dong.tien_dat_coc) as tong_tien from hop_dong
where year(hop_dong.ngay_lam_hop_dong) =2019
group by hop_dong.ma_hop_dong
having tong_tien>10000000) as 
temp set khach_hang.ma_loai_khach=(select loai_khach.ma_loai_khach from loai_khach where ten_loai_khach="Diamond")
 where khach_hang.ma_loai_khach=( select loai_khach.ma_loai_khach from loai_khach where loai_khach.ten_loai_khach="Platinium")
 and temp.id=khach_hang.ma_khach_hang;
 
 -- Yeu cau 18
 delete khach_hang,hop_dong,hop_dong_chi_tiet from khach_hang
 inner join hop_dong on hop_dong.ma_khach_hang=khach_hang.ma_khach_hang
 inner join hop_dong_chi_tiet on hop_dong_chi_tiet.ma_hop_dong=hop_dong.ma_hop_dong
 where not exists( select hop_dong.ma_hop_dong where year(ngay_lam_hop_dong)< 2021 and hop_dong.ma_khach_hang=khach_hang.ma_khach_hang);

 -- Yeu cau 19:
 set SQL_SAFE_UPDATES=1;
 update dich_vu_di_kem inner join (select dich_vu_di_kem.ten_dich_vu_di_kem from hop_dong_chi_tiet inner join 
 dich_vu_di_kem on dich_vu_di_kem.ma_dich_vu_di_kem=hop_dong_chi_tiet.ma_dich_vu_di_kem
 group by dich_vu_di_kem.ma_dich_vu_di_kem
 having count(hop_dong_chi_tiet.ma_dich_vu_di_kem) >=10) as temp set dich_vu_di_kem.gia=dich_vu_di_kem.gia*2
 where dich_vu_di_kem.ten_dich_vu_di_kem=temp.ten_dich_vu_di_kem;
  
  -- Yeu cau 20:
  select khach_hang.ma_khach_hang as id,
  khach_hang.ho_ten as ho_ten,
  khach_hang.email as email ,
  khach_hang.so_dien_thoai as sdt,
  khach_hang.ngay_sinh as ns,
  khach_hang.dia_chi as dia_chi from khach_hang left join hop_dong
  on khach_hang.ma_khach_hang=hop_dong.ma_khach_hang
  left join nhan_vien on nhan_vien.ma_nhan_vien=hop_dong.ma_nhan_vien
  union 
  select nhan_vien.ma_nhan_vien as id,
  nhan_vien.ho_ten as ho_ten ,
  nhan_vien.email as email ,nhan_vien.so_dien_thoai as sdt ,
  nhan_vien.ngay_sinh as ns,
  nhan_vien.dia_chi as dia_chi from nhan_vien left join hop_dong
  on nhan_vien.ma_nhan_vien=hop_dong.ma_nhan_vien
 left join khach_hang on khach_hang.ma_khach_hang=hop_dong.ma_khach_hang;
 
 -- Yeu cau 20:
 select khach_hang.ma_khach_hang as id,
  khach_hang.ho_ten ,
  khach_hang.email  ,
  khach_hang.so_dien_thoai ,
  khach_hang.ngay_sinh,
  khach_hang.dia_chi,"khach_hang" as FromTable from khach_hang 
  union
 select nhan_vien.ma_nhan_vien as id,
  nhan_vien.ho_ten  ,
  nhan_vien.email ,nhan_vien.so_dien_thoai ,
  nhan_vien.ngay_sinh ,
  nhan_vien.dia_chi,"nhan_vien" as FromTable from nhan_vien;
    