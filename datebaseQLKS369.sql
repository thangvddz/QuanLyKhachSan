create database DA1_N8_V28	
go

use DA1_N8_V28
go

create table KHACHHANG(
	MaKH int primary key identity(1,1),
	SoCMT varchar(15) not null,
	HoTen nvarchar(50) not null,
	SoDienThoai varchar(50) not null,
	NgaySinh date null,
	QueQuan nvarchar(50) null,
	QuocTich nvarchar(30) null,
	Email varchar(50) null,
	GioiTinh bit not null
)

create table NHANVIEN(
	Id int identity not null,
	MaNV varchar(10) not null,
	HoTen nvarchar(30) not null,
	Username nvarchar(20) null,
	Pass_word nvarchar(10) null,
	ThoiGianLap datetime,
	SoCmt nvarchar(30) not null,
	GioiTinh bit not null,
	QueQuan nvarchar(30),
	NgaySinh date null,
	ThoiGianVaolam date,
	SDT nvarchar(20) not null,
	Emai nvarchar(20) null,
	VaiTro bit not null,
	TrangThai int, --bit
	primary key(MaNV)
)

create table DICHVU(
	MaDV int primary key identity(1,1),
	TenDV nvarchar(100) not null,
	PhiDV money not null,
	TrangThai bit default 1
)

create table HOADON(
	MaHD int primary key identity(1,1),
	MaNV varchar(10) foreign key (MaNV) references NHANVIEN(MaNV),
	MaKH int foreign key (MaKH) references KHACHHANG(MaKH),
	ThoiDiemDatPhong datetime not null,
	ThoiDiemTraPhong datetime null,
	TienTraTruoc money null,
	GiamGia money null,
	PhuThu money null,
	ThanhTien money null,
	GhiChu nvarchar(200) null,
	TrangThai bit default 0,
)

create table LOAITHANHTOAN(
	MaLoaiTT int primary key identity(1,1),
	TenLoaiThanhToan nvarchar(50) not null,
	TrangThai bit default 1
)

create table THANHTOAN(
	MaHD int foreign key (MaHD) references HOADON(MaHD),
	MaLoaiTT int foreign key (MaLoaiTT) references LOAITHANHTOAN(MaLoaiTT),
	ThoiGianThanhToan datetime null,
	GhiChu nvarchar(100) null
)

create table LOAIPHONG (
	MaLP int primary key identity(1, 1),
	TenLP nvarchar(30) not null,
	SoGiuong int null,
	giaGio money null,
	giaNgay money null,
)

create table TANG (
	SoTang int primary key identity(1, 1),
	GhiChu nvarchar(100) null,
	TrangThai bit default 1
)

create table TRANGTHAI(
	MaTT int primary key identity(1, 1),
	TenTT nvarchar(50) not null
)

create table PHONG (
	MaPhong varchar(5) not null,
	MaLP int foreign key (MaLP) references LoaiPhong(MaLP),
	SoTang int foreign key (SoTang) references Tang(SoTang),
	MaTT int foreign key (MaTT) references TRANGTHAI(MaTT),
	GhiChu nvarchar(50) null,
	CONSTRAINT ID PRIMARY KEY(MaPhong, SoTang)
)

create table HOADONCHITIET(
	MaHDCT int primary key identity(1,1),
	MaHD int foreign key (MaHD) references HOADON(MaHD) null,
	MaPhong varchar(5) not null,
	SoTang int not null,
	NgayDK datetime not null,
	TrangThai bit default 0,
	constraint TP foreign key (MaPhong, SoTang) references PHONG(MaPhong, SoTang)
)

create table YEUCAU(
	MaDV int foreign key (MaDV) references DICHVU(MaDV) null,
	MaHDCT int foreign key (MaHDCT) references HOADONCHITIET(MaHDCT) null,
	ThoiGianBD datetime null,
	TrangThai bit null
)

create table LICHSUGD(
	MaLSGD int primary key identity(1,1),
	MaHDCT int foreign key (MaHDCT) references HOADONCHITIET(MaHDCT) null,
	ThoiGianBD datetime null,
	ThoiGianKT datetime null,
	TrangThai bit default 0
)
go

create table CaLam(
    TenCaLam varchar(10) primary key,
	ThoiGianBDHD time null,
	ThoiGianKTHD time null,
	GhiChu nvarchar(100) null
)

create table LSCaLam(
    MaLSCL int primary key identity(1,1),
	MaNV varchar(10) foreign key (MaNV) references NhanVien(MaNV) null,
	TenCaLam varchar(10) foreign key (TenCaLam) references CaLam(TenCaLam) null,
	TienVaoDauCa money null,
	TienCuoiCa money null,
	ThoiGianBD datetime null,
	ThoiGianKT datetime null,
	GhiChu nvarchar(100) null
)

select TANG.SoTang, COUNT(PHONG.SoTang) as so_tang from TANG left outer join PHONG on TANG.SoTang = PHONG.SoTang 
group by TANG.SoTang

insert into NHANVIEN
values('NV01',N'Vũ Đức Thắng','vuducthang','123','01-01-2021','048375823',0 ,N'Hà Nội','09-11-1997','11-11-2017','0902034832','Vuducthang@gmail.com',1,1)
insert into NHANVIEN
values('NV02',N'Phạm Vũ Hưng','phamvuhung','234','01-01-2021','048375823',1 ,N'Hà Nội','09-11-1997','11-11-2017','0902034832','vuhung@gmail.com',2,1)
insert into NHANVIEN
values('NV03',N'Đỗ Thanh Hiền','dothanhhien','345','01-01-2021','048375823',1 ,N'Hà Nội','09-11-1997','11-11-2017','0902034832','thanhhien@gmail.com',2,1)
insert into NHANVIEN
values('NV04',N'Nguyễn Việt Cường','nguyenvietcuong','567','01-01-2021','048375823',1 ,N'Hà Nội','09-11-1997','11-11-2017','0902034832','vietcuong@gmail.com',2,1)
--insert into NHANVIEN(MaNV, HoTen, Username, Pass_word, ThoiGianLap, SoCmt, GioiTinh, QueQuan, NgaySinh, ThoiGianVaolam, SDT, Emai, VaiTro, TrangThai)

insert INTO LOAIPHONG(TenLP, SoGiuong, giaGio, giaNgay) VALUES (N'Phòng đơn', 1, 50000, 450000)
go
INSERT INTO LOAIPHONG(TenLP, SoGiuong, giaGio, giaNgay) VALUES (N'Phòng đôi', 2, 100000, 1200000)
go
INSERT INTO LOAIPHONG(TenLP, SoGiuong, giaGio, giaNgay) VALUES (N'Phòng suite', 2, 500000, 3200000)
go
INSERT INTO LOAIPHONG(TenLP, SoGiuong, giaGio, giaNgay) VALUES (N'Phòng đơn cao cấp', 1, 1000000, 5400000)
go

INSERT INTO TANG(GhiChu,TrangThai) VALUES (N'HELLO', 1)
INSERT INTO TANG(GhiChu,TrangThai) VALUES (N'HELLO', 1)
INSERT INTO TANG(GhiChu,TrangThai) VALUES (N'HELLO', 1)
INSERT INTO TANG(GhiChu,TrangThai) VALUES (N'HELLO', 1)
INSERT INTO TANG(GhiChu,TrangThai) VALUES (N'HELLO', 1)
INSERT INTO TANG(GhiChu,TrangThai) VALUES (N'HELLO', 1)

INSERT INTO TRANGTHAI(TenTT) VALUES(N'Sẵn sàng đón khách')
INSERT INTO TRANGTHAI(TenTT) VALUES(N'Không sẵn sàng đón khách')
INSERT INTO TRANGTHAI(TenTT) VALUES(N'Đang xử lý')
INSERT INTO TRANGTHAI(TenTT) VALUES(N'Đang sửa chữa')
INSERT INTO TRANGTHAI(TenTT) VALUES(N'Chưa dọn dẹp')

INSERT INTO PHONG(MaPhong, MaLP, SoTang, MaTT, GhiChu) VALUES (101, 1, 1, 1, NULL)
INSERT INTO PHONG(MaPhong, MaLP, SoTang, MaTT, GhiChu) VALUES (102, 1, 1, 1, NULL)
INSERT INTO PHONG(MaPhong, MaLP, SoTang, MaTT, GhiChu) VALUES (103, 1, 1, 1, NULL)
INSERT INTO PHONG(MaPhong, MaLP, SoTang, MaTT, GhiChu) VALUES (104, 1, 1, 1, NULL)
INSERT INTO PHONG(MaPhong, MaLP, SoTang, MaTT, GhiChu) VALUES (105, 1, 1, 1, NULL)
INSERT INTO PHONG(MaPhong, MaLP, SoTang, MaTT, GhiChu) VALUES (106, 1, 1, 1, NULL)

INSERT INTO PHONG(MaPhong, MaLP, SoTang, MaTT, GhiChu) VALUES (107, 1, 2, 1, NULL)
INSERT INTO PHONG(MaPhong, MaLP, SoTang, MaTT, GhiChu) VALUES (108, 1, 2, 1, NULL)
INSERT INTO PHONG(MaPhong, MaLP, SoTang, MaTT, GhiChu) VALUES (109, 1, 2, 1, NULL)
INSERT INTO PHONG(MaPhong, MaLP, SoTang, MaTT, GhiChu) VALUES (110, 1, 2, 1, NULL)
INSERT INTO PHONG(MaPhong, MaLP, SoTang, MaTT, GhiChu) VALUES (111, 1, 2, 1, NULL)
INSERT INTO PHONG(MaPhong, MaLP, SoTang, MaTT, GhiChu) VALUES (112, 1, 2, 1, NULL)
INSERT INTO PHONG(MaPhong, MaLP, SoTang, MaTT, GhiChu) VALUES (114, 1, 2, 1, NULL)

INSERT INTO PHONG(MaPhong, MaLP, SoTang, MaTT, GhiChu) VALUES (115, 1, 3, 1, NULL)
INSERT INTO PHONG(MaPhong, MaLP, SoTang, MaTT, GhiChu) VALUES (116, 1, 3, 1, NULL)
INSERT INTO PHONG(MaPhong, MaLP, SoTang, MaTT, GhiChu) VALUES (117, 1, 3, 1, NULL)
INSERT INTO PHONG(MaPhong, MaLP, SoTang, MaTT, GhiChu) VALUES (118, 1, 3, 1, NULL)
INSERT INTO PHONG(MaPhong, MaLP, SoTang, MaTT, GhiChu) VALUES (119, 1, 3, 1, NULL)
INSERT INTO PHONG(MaPhong, MaLP, SoTang, MaTT, GhiChu) VALUES (120, 1, 3, 1, NULL)

INSERT INTO PHONG(MaPhong, MaLP, SoTang, MaTT, GhiChu) VALUES (121, 1, 4, 1, NULL)
INSERT INTO PHONG(MaPhong, MaLP, SoTang, MaTT, GhiChu) VALUES (122, 1, 4, 1, NULL)
INSERT INTO PHONG(MaPhong, MaLP, SoTang, MaTT, GhiChu) VALUES (123, 1, 4, 1, NULL)
INSERT INTO PHONG(MaPhong, MaLP, SoTang, MaTT, GhiChu) VALUES (124, 1, 4, 1, NULL)
INSERT INTO PHONG(MaPhong, MaLP, SoTang, MaTT, GhiChu) VALUES (125, 1, 4, 1, NULL)
INSERT INTO PHONG(MaPhong, MaLP, SoTang, MaTT, GhiChu) VALUES (126, 1, 4, 1, NULL)

INSERT INTO PHONG(MaPhong, MaLP, SoTang, MaTT, GhiChu) VALUES (127, 1, 5, 1, NULL)
INSERT INTO PHONG(MaPhong, MaLP, SoTang, MaTT, GhiChu) VALUES (128, 1, 5, 1, NULL)
INSERT INTO PHONG(MaPhong, MaLP, SoTang, MaTT, GhiChu) VALUES (129, 1, 5, 1, NULL)
INSERT INTO PHONG(MaPhong, MaLP, SoTang, MaTT, GhiChu) VALUES (130, 1, 5, 1, NULL)
INSERT INTO PHONG(MaPhong, MaLP, SoTang, MaTT, GhiChu) VALUES (131, 1, 5, 1, NULL)
INSERT INTO PHONG(MaPhong, MaLP, SoTang, MaTT, GhiChu) VALUES (132, 1, 5, 1, NULL)

INSERT INTO PHONG(MaPhong, MaLP, SoTang, MaTT, GhiChu) VALUES (133, 1, 6, 1, NULL)
INSERT INTO PHONG(MaPhong, MaLP, SoTang, MaTT, GhiChu) VALUES (134, 1, 6, 1, NULL)
INSERT INTO PHONG(MaPhong, MaLP, SoTang, MaTT, GhiChu) VALUES (135, 1, 6, 1, NULL)
INSERT INTO PHONG(MaPhong, MaLP, SoTang, MaTT, GhiChu) VALUES (136, 1, 6, 1, NULL)
INSERT INTO PHONG(MaPhong, MaLP, SoTang, MaTT, GhiChu) VALUES (137, 1, 6, 1, NULL)

select * from KHACHHANG
insert into KHACHHANG(SoCMT, HoTen, SoDienThoai, NgaySinh, QueQuan,QuocTich, Email, GioiTinh)
values('001200027615', N'Nguyễn Văn Thành', '00125152350', '3-3-2002',N'Việt Nam', N'Việt Nam','Hellohi@gmail.com', 1) 
go

insert into HOADON(MaNV, MaKH, ThoiDiemDatPhong, ThoiDiemTraPhong, TienTraTruoc,GiamGia,PhuThu,ThanhTien, GhiChu, TrangThai)
values('NV02',1,'9-6-2019', '9-7-2019', 500000,null, null, null, N'Thêm dịch vụ đặt xe lúc 2 giờ', 0)

insert into LOAITHANHTOAN(TenLoaiThanhToan, TrangThai)
values(N'Thẻ tín dụng', 1)
insert into LOAITHANHTOAN(TenLoaiThanhToan, TrangThai)
values(N'Tiền mặt', 1)
insert into LOAITHANHTOAN(TenLoaiThanhToan, TrangThai)
values(N'Vàng', 1)
insert into LOAITHANHTOAN(TenLoaiThanhToan, TrangThai)
values(N'Séc', 1)

insert into THANHTOAN(MaHD, MaLoaiTT, ThoiGianThanhToan, GhiChu)
values(1,2, '5-5-2021', N'Thanh toán bằng tiền việt nam đồng')


insert into DICHVU(TenDV, PhiDV, TrangThai) values(N'Giặt đồ', 150000, 1)
insert into DICHVU(TenDV, PhiDV, TrangThai) values(N'Sấy đồ', 100000, 1)
insert into DICHVU(TenDV, PhiDV, TrangThai) values(N'Đặt xe taxi', 50000, 1)
insert into DICHVU(TenDV, PhiDV, TrangThai) values(N'Gọi đồ ăn', 10000, 1)
insert into DICHVU(TenDV, PhiDV, TrangThai) values(N'Báo thức', 30000, 1)

insert into HOADONCHITIET(MaHD, MaPhong, SoTang, NgayDK, TrangThai)
values (1, 107, 2, '5-15-2019', 0)

insert into YEUCAU(MaDV, MaHDCT, ThoiGianBD, TrangThai)
values(2, 1, '5-15-2019', 1)

insert into LICHSUGD(MaHDCT, ThoiGianBD, ThoiGianKT, TrangThai)
values(1, '9-6-2019', '9-7-2019', 0)

select * from LICHSUGD
select * from YEUCAU
select * from HOADONCHITIET
select * from NHANVIEN
select * from PHONG
select * from TRANGTHAI
select * from TANG
select * from LOAIPHONG
select * from KHACHHANG
select * from HOADON
select * from DICHVU
select * from LOAITHANHTOAN
select * from THANHTOAN



select * from LSCaLam
select * from CaLam
go
insert into CaLam(TenCaLam,ThoiGianBDHD,ThoiGianKTHD,GhiChu) values ('CaSang','07:00:00','19:00:00','Đến muộn bị trừ lương')
insert into CaLam(TenCaLam,ThoiGianBDHD,ThoiGianKTHD,GhiChu) values ('CaDem','19:00:00','07:00:00','Đến muộn bị trừ lương')

insert into LSCaLam(MaNV,TenCaLam,TienVaoDauCa,TienCuoiCa,ThoiGianBD,ThoiGianKT,GhiChu) 
values ('NV01','CaSang',3000000,5000000,'2021-11-27 07:00:00','2021-11-27 19:00:00','Đi làm đúng giờ')


IF OBJECT_ID('checkOverCheckOut') IS NOT NULL
	DROP PROC checkOverCheckOut
GO
CREATE PROC checkOverCheckOut @checkOutLS datetime, @checkOutHD datetime, @maHD int 
as
	if DATEDIFF(MINUTE, @checkOutLS, @checkOutHD) < 0
		BEGIN
			UPDATE HOADON SET ThoiDiemTraPhong=@checkOutLS where MaHD=@maHD
			select 1 as result
		END
	else
		begin
			select 0 as result
		end
go

-- Tính tiền nhận phòng sớm. mặc định giờ checkin là 14:00h (9-14) (5-9)
IF OBJECT_ID('TienNhanPhongSom') IS NOT NULL
	DROP PROC TienNhanPhongSom
GO
CREATE PROC TienNhanPhongSom @nowCheckIn datetime, @CheckIn datetime, @GiaPhong money
as
	declare @numHours int = (DATEDIFF(HOUR, @nowCheckIn, @CheckIn))
	declare @numMinutes int = (DATEDIFF(MINUTE, @nowCheckIn, @CheckIn)%60)
	declare @TienCongThem money = @GiaPhong
 	IF @numHours >= 9
		BEGIN
			select @tienCongThem as TienPhongSom
		END
	ELSE IF @numHours >= 5
		BEGIN
			set @TienCongThem = @TienCongThem*0.5
			select @TienCongThem as TienPhongSom
		END
	ELSE IF @numHours = 1 and @numMinutes <= 15
		BEGIN
			select 0 as TienPhongSom
		END
	ELSE IF @numHours < 5 and @numHours >= 1
		BEGIN
			set @TienCongThem = @TienCongThem*0.3
			select @TienCongThem as TienPhongSom
		END
	ELSE
		BEGIN
			select 0 as TienPhongSom
		END
go

IF OBJECT_ID('TienTraPhongTre') IS NOT NULL
	DROP PROC TienTraPhongTre
GO
create proc TienTraPhongTre @nowCheckOut datetime, @checkOut datetime, @giaPhong money
as
	declare @numHours int = (DATEDIFF(HOUR, @checkOut, @nowCheckOut))
	declare @numMinutes int = (DATEDIFF(MINUTE, @checkOut, @nowCheckOut)%60)
	declare @TienCongThem money = @GiaPhong

	IF @numHours >= 6
		BEGIN
			select @tienCongThem as TienPhongTre
		END
	ELSE IF @numHours >= 3
		BEGIN
			set @TienCongThem = @TienCongThem*0.5
			select @TienCongThem as TienPhongTre
		END
	ELSE IF @numHours >= 0 and @numMinutes>15
		BEGIN
			set @TienCongThem = @TienCongThem*0.3
			select @TienCongThem as TienPhongTre
		END
	ELSE
		BEGIN
			select 0 as TienPhongTre
		END
go

IF OBJECT_ID('ThoiGianDaThue') IS NOT NULL
	DROP PROC ThoiGianDaThue
GO
create proc ThoiGianDaThue @MaHDCT int
as
	declare @DateBD datetime = (select top 1 ThoiGianBD from LICHSUGD where MaHDCT=@MaHDCT order by MaLSGD desc)
	declare @DateKT datetime = getdate()
	select datediff(HOUR, @DateBD, @DateKT) as soGio
go
--exec ThoiGianDaThue 1

IF OBJECT_ID('LichSuThoiGianThue') IS NOT NULL
	DROP PROC LichSuThoiGianThue
GO
create proc LichSuThoiGianThue @DateBD datetime, @DateKT datetime 
as
	declare @SoNgay int = datediff(DAY, @DateBD, @DateKT)
	declare @Sogio int = datediff(HOUR, @DateBD, @DateKT)
	declare @SoPhut int = datediff(MINUTE, @DateBD, @DateKT)
	if @SoPhut <= 59
	BEGIN
		select datediff(DAY, @DateBD, @DateKT) as soNgay,
		0 as soGio, 
		(datediff(MINUTE, @DateBD, @DateKT)) as soPhut
	END
	else
	BEGIN
		select datediff(DAY, @DateBD, @DateKT) as soNgay,
		datediff(MINUTE, @DateBD, @DateKT)/60 as soGio, 
		(datediff(MINUTE, @DateBD, @DateKT)%60) as soPhut
	END
go
exec LichSuThoiGianThue '2021-11-25 20:31:00.000', '2021-11-25 22:35:00.000'

IF OBJECT_ID('DichVuDaDung') IS NOT NULL
	DROP PROC DichVuDaDung
GO
create proc DichVuDaDung @SoTang int, @MaPhong varchar(5)
as
	select TenDV,SUM(PhiDV) as TongPhiDV
	from HOADONCHITIET join YEUCAU on HOADONCHITIET.MaHDCT=YEUCAU.MaHDCT
	join DICHVU on YEUCAU.MaDV = DICHVU.MaDV 
	where MaPhong=@MaPhong and SoTang=@SoTang and HOADONCHITIET.TrangThai=0
	group by TenDV, ThoiGianBD
go


