Create proc sp_LichSu
as begin
	select
		ThoiDiemTraPhong NgayGD,
		HoaDon.MaHD MaHD,
		KhachHang.HoTen TenKH,
		HOADONCHITIET.MaPhong MaPhong,
		HoaDon.ThanhTien TongTien,
		NhanVien.HoTen HoTenNV
	from HoaDon join NhanVien on NhanVien.MaNV = HoaDon.MaNV 
				join KhachHang on HoaDon.MaKH = KhachHang.MaKH 
				join HOADONCHITIET on HoaDon.MaHD = HOADONCHITIET.MaHD
end