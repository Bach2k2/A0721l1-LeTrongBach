    -- Yeu cau 6:
select dich_vu.ma_dich_vu, ten_dich_vu, dien_tich, chi_phi_thue, ten_loai_dich_vu from dich_vu 
inner join loai_dich_vu on dich_vu.ma_loai_dich_vu=loai_dich_vu.ma_loai_dich_vu
where dich_vu.ma_dich_vu not in (select ma_dich_vu from hop_dong where (month(ngay_lam_hop_dong)between 1 and 3)
and year(ngay_lam_hop_dong));
  
  -- Yeu cau 7:
  select ma_dich_vu, ten_dich_vu, dien_tich, so_nguoi_toi_da, chi_phi_thue, ten_loai_dich_vu
  from dich_vu 
  inner join loai_dich_vu on dich_vu.ma_loai_dich_vu=loai_dich_vu.ma_loai_dich_vu
  where dich_vu.ma_dich_vu in (select ma_dich_vu from hop_dong where year(ngay_lam_hop_dong)=2020) and
  dich_vu.ma_dich_vu not in (select ma_dich_vu from hop_dong where year(ngay_lam_hop_dong)=2021);
  
  -- Yeu cau 8: c1
  select distinct (ho_ten) as ten_khach_hang from khach_hang
  order by ho_ten;
  -- c2:
  select ho_ten from khach_hang
 group by ho_ten;
  -- c3:
  select ho_ten from khach_hang
  union
  select ho_ten from khach_hang;
-- yeu cau 9:
select month(ngay_lam_hop_dong) as thang,count(hop_dong.ma_dich_vu) as so_luong_khach_hang from dich_vu
inner join hop_dong on hop_dong.ma_dich_vu=dich_vu.ma_dich_vu
where year(ngay_lam_hop_dong)=2021
group by month(ngay_lam_hop_dong)
order by month(ngay_lam_hop_dong);

-- Yeu cau 10:
select hop_dong.ma_hop_dong, ngay_lam_hop_dong, ngay_ket_thuc, tien_dat_coc, sum(so_luong) as so_luong_dich_vu_di_kem 
from hop_dong 
left join hop_dong_chi_tiet on hop_dong.ma_hop_dong=hop_dong_chi_tiet.ma_hop_dong
left join dich_vu_di_kem on hop_dong_chi_tiet.ma_dich_vu_di_kem=dich_vu_di_kem.ma_dich_vu_di_kem
 group by hop_dong.ma_hop_dong; 
 