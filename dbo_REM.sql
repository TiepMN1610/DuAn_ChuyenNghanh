CREATE DATABASE QLBDS
GO
USE QLBDS
GO
CREATE TABLE vanPhong
(
		Id INT PRIMARY KEY IDENTITY,
		MaVP VARCHAR(10),
		TenVP NVARCHAR(50),
		DcVP NVARCHAR(MAX),
		QuanVP NVARCHAR(30),
		ThanhPhoVP NVARCHAR(30),
		LoaiVP NVARCHAR(30)
);
CREATE TABLE chucVu 
(
		Id INT PRIMARY KEY IDENTITY,
		MaCV VARCHAR(10),
		TenCV NVARCHAR(40)

);
CREATE TABLE taiKhoan
(
		Id INT PRIMARY KEY IDENTITY,
		TenTK VARCHAR(30) UNIQUE,
		MatKhauTK VARCHAR(16)
);
CREATE TABLE nhanVien 
(
		Id INT PRIMARY KEY IDENTITY,
		IdCV INT,
		IdTK INT,
		IdVP INT,
		TenNV NVARCHAR(20),
		TenDemNV NVARCHAR(30),
		HoNV NVARCHAR(30),
		MaNV VARCHAR(10),
		GioiTinhNV BIT,
		EmailNV VARCHAR(40),
		NamSinhNV DATE,
		CccdNV INT
		CONSTRAINT FK_nvcv FOREIGN KEY (IdCV) REFERENCES chucVu(Id),
		CONSTRAINT FK_vpnv FOREIGN KEY (IdVP) REFERENCES vanPhong(Id),
		CONSTRAINT FK_nvtk FOREIGN KEY (IdTK) REFERENCES taiKhoan(Id)
);
CREATE TABLE chuSoHuu
(
		Id INT PRIMARY KEY IDENTITY,
		SdtCSH INT,
		MaCSH VARCHAR(10) UNIQUE,
		TenCSH NVARCHAR(30),
		TenDemCSH NVARCHAR(30),
		HoCSH NVARCHAR(30)
);
CREATE TABLE batDongSan
(
		Id INT PRIMARY KEY IDENTITY,
		IdCSH INT NOT NULL,
		IdVP INT NOT NULL,
		MaBDS VARCHAR(10) UNIQUE NOT NULL,
		DcBDS NVARCHAR(100) NOT NULL,
		QuanBDS NVARCHAR(30) NOT NULL,
		ThanhPhoBDS NVARCHAR(30) NOT NULL,
		LoaiBDS NVARCHAR(40) NOT NULL,
		dienTichBDS INT NOT NULL,
		GiaBDS MONEY NOT NULL,
		CONSTRAINT FK_bdschs FOREIGN KEY (IdCSH) REFERENCES chuSoHuu(Id),
		CONSTRAINT FK_vpbds FOREIGN KEY (IdVP) REFERENCES vanPhong(Id)
);


-- THÊM DỮ LIỆU VÀO BẢNG
/*Id INT PRIMARY KEY,
		Ma VARCHAR(10),
		Ten NVARCHAR(50),
		Dc NVARCHAR(MAX),
		Quan NVARCHAR(30),
		ThanhPho NVARCHAR(30),
		Loai NVARCHAR(30)*/
INSERT vanPhong VALUES ('VP001', N'Bất động sản Thành Hưng', N'tòa nhà Golden Place', N'Nam Từ Liêm', N'Hà Nội', N'Văn Phòng chính thức'),
					   ('VP002', N'Bất động sản Nam Hưng', N'Tầng 2 tòa nhà Ananis', N'Hai Bà Trưng', N'Hà Nội', N'Văn phòng đại diện'),
					   ('VP003', N'Bất động sản Tuấn hưng', N'Tầng 1 tòa nhà Golden City', N'Long Biên', N'Hà Nội', N'Văn phòng đại diện')
INSERT chucVu VALUES   ('GD', N'Giám Đốc'), ('PGD', N'Phó Giám Đốc'),
					   ('QLCN', N'Quản Lý Văn Phòng'), ('PQLCN', N'Phó Quản Lý Văn Phòng'),
					   ('NV', N'Nhân Viên'), ('BV', N'Bảo Vệ'),
					   ('NVLT', N'Nhân Viên Lễ Tân')
/*Id INT PRIMARY KEY,
		Ten VARCHAR(30),
		MatKhau INT*/
INSERT taiKhoan VALUES ('sonptph25875', 191203),('tuanptph25875', 191203),('duongptph25875', 191203),
					   ('namptph25875', 191203),('tungptph25875', 191203),('bachptph25875', 191203),
					   ('Lyptph25875', 191203),('tienptph25875', 191203)
/*Id INT PRIMARY KEY IDENTITY,
		IdCV INT,
		IdTK INT,
		IdVP INT,
		Ten NVARCHAR(20),
		TenDem NVARCHAR(30),
		Ho NVARCHAR(30),
		Ma VARCHAR(10),
		GioiTinh NVARCHAR(5),
		Email VARCHAR(40),
		NamSinh DATE,
		Cccd INT*/
INSERT nhanVien VALUES (001, 001, 001, N'Sơn', N'Thanh', N'Phạm', 'NV1', 1, N'sonptph25875@fpt.edu.vn', '2003-12-19', 172053432), (002, 004, 001, N'Nam', N'Đức', N'Nguyễn', 'NV2', 1, N'ducptph25875@fpt.edu.vn', '2003-01-09', 175526232),
					   (006, null, 002, N'Đức', N'Nam', N'Trần', 'NV3', 1,null, null, null), (003, 002, 002,  N'Tuấn', N'Thanh', N'Nguyễn', 'NV4', 1,  N'tuanptph25875@fpt.edu.vn', '2005-12-19', 172053252),
					   (005, null, 001, N'Diệu', N'Anh', N'Nguyễn', 'NV5', 0,  N'sonptph25875@fpt.edu.vn', '2003-12-19', 17205342), (006, null, 002, N'Quỳnh', N'Ngọc', N'Nguyễn', 'NV6', 1, null, null, null),
					   (004, 005, 001, N'Tùng', N'Minh', N'Nguyễn', 'NV7', 1,  N'tungptph25875@fpt.edu.vn', '2003-12-19', 17205232), (005,null, 002,  N'Nghĩa', N'Trần', N'Nguyễn', 'NV8',1, null, null, null),
					   (005, null, 002, N'Quân', N'Nam', N'Trần', 'NV9', 1, null, null, null), (007, null, 003, N'Giang', N'Đức', N'Phạm', 'NV10',0, null , null, null),
				 	   (005, null, 001, N'Quân', N'Hồng', N'Nguyễn', 'NV11', 1, null, null, null), (005, null, 003, N'Tài', N'Tú', N'Nguyễn', 'NV12', 1, null, null, null),
		    		   (004, 003, 002, N'Dương', N'Thùy', N'Nguyễn', 'NV13', 0,  N'duongptph25875@fpt.edu.vn', '2003-12-19', 17205232), (003, 006, 001, N'Bách', N'Thanh', N'Trần', 'NV14', 1,  N'bachptph25875@fpt.edu.vn', '2004-01-22', 172053232),
					   (007, null, 001, N'Nhi', N'yến', N'Bạch', 'NV15',0, null, null, null), (005, null, 003, N'Hưng', N'Tuấn', N'Phùng', 'NV16', 1, null, null, null),
					   (003, 007,003, N'Ly', N'Thùy', N'Nguyễn', 'NV17', 0,  N'lyptph25875@fpt.edu.vn', '2003-11-29', 172045232), (004, 008, 003, N'Tien', N'Thanh', N'Trần', 'NV14', 1,  N'sonptph25875@fpt.edu.vn', '1998-12-19', 172042232),
					   (006, null, 003, N'Đốc', N'Tuấn', N'Phùng', 'NV16', 1, null, null, null)
/*Id INT PRIMARY KEY,
		Sdt INT,
		Ma VARCHAR(10),
		Ten NVARCHAR(30),
		TenDem NVARCHAR(30),
		Ho NVARCHAR(30)*/
INSERT chuSoHuu VALUES (0333228864, 'CHS001', N'Đức', N'Thanh', N'Nguyễn'),
					   (0339528837, 'CHS002', N'Tuấn', N'Thanh', N'Nguyễn'),
					   (0379228852, 'CHS003', N'Hiệu', N'Thanh', N'Nguyễn'),
					   (0389528394, 'CHS004', N'Nam', N'Thanh', N'Nguyễn'),
					   (0389428821, 'CHS005', N'Tùng', N'Thanh', N'Nguyễn')
					  
/*Id INT PRIMARY KEY,
		IdCSH INT,
		IdVP INT,
		Ma VARCHAR(10),
		Dc NVARCHAR(100),
		Quan NVARCHAR(30),
		ThanhPho NVARCHAR(30),
		Loai NVARCHAR(40),
		dienTich INT
		GIA MONEY*/
INSERT batDongSan VALUES	   (001, 001,'BDS001', N'Số 21, Ngõ 59 Mễ Trì Hạ', N'Nam Từ Liêm', N'Hà Nội', N'Đất thổ cư', 620, 1200000),
							   (001, 001,'BDS002', N'Số 5, Ngõ 52/3 Mễ Trì Hạ', N'Nam Từ Liêm', N'Hà Nội', N'Đất nông nghiệp', 126, 1200000),
							   (001, 001,'BDS003', N'Số 4, Ngõ 59 Mễ Trì Hạ', N'Nam Từ Liêm', N'Hà Nội', N'Đất thổ cư', 150, 1200000),
							   (001, 001,'BDS004', N'Số 9, Ngõ 34/1 Mễ Trì Hạ', N'Nam Từ Liêm', N'Hà Nội', N'Đất thổ cư', 630, 400000),
							   (001, 001,'BDS005', N'Số 8, Ngõ 31/6 Mễ Trì Hạ', N'Nam Từ Liêm', N'Hà Nội', N'Đất thổ cư', 130, 1000000),
							   (002, 002,'BDS006', N'Số 2C, Ngõ 03 Tu Hoàng', N'Bắc Từ Liêm', N'Hà Nội', N'Đất lâm nhệp', 103, 93000),
							   (002, 002,'BDS007', N'Số 4A1, Ngõ 10 Tu Hoàng', N'Bắc Từ Liêm', N'Hà Nội', N'Đất thổ cư', 320, 1000000),
							   (002, 002,'BDS008', N'Số 4D, Ngõ 29/5 Tu Hoàng', N'Bắc Từ Liêm', N'Hà Nội', N'Đất thổ cư', 130, 93000),
							   (002, 002,'BDS009', N'Số 43, Ngõ 23 Tu Hoàng', N'Bắc Từ Liêm', N'Hà Nội', N'Đất thổ cư', 120, 93000),
							   (002, 002,'BDS010', N'Số 20, Ngõ 23/5 Tu Hoàng', N'Bắc Từ Liêm', N'Hà Nội', N'Đất thổ cư', 100, 53000),
							   (003, 003,'BDS011', N'Số 32, Ngõ 39 Mai Hắc Đế', N'Hai Bà Chưng', N'Hà Nội', N'Đất thổ cư', 200, 113000),
							   (003, 003,'BDS012', N'Số 4, Ngõ 15 Mai Hắc Đế', N'Hai Bà Chưng', N'Hà Nội', N'Đất nông nghiệp', 90, 9000),
							   (003, 003,'BDS013', N'Số 4A, Ngõ 160 Mai Hắc Đế', N'Hai Bà Chưng', N'Hà Nội', N'Đất thổ cư', 300, 190000),
							   (003, 003,'BDS014', N'Số 43, Ngõ 30 Mai Hắc Đế', N'Hai Bà Chưng', N'Hà Nội', N'Đất thổ cư', 150, 93000),
							   (003, 003,'BDS015', N'Số 9, Ngõ 35 Mai Hắc Đế', N'Hai Bà Chưng', N'Hà Nội', N'Đất nông nghiệp', 620, 9300000),
							   (004, 003,'BDS016', N'Số 35, Ngõ 01 Mai Hắc Đế', N'Hai Bà Chưng', N'Hà Nội', N'Đất thổ cư', 213, 93000),
							   (004, 003,'BDS017', N'Số 53, Ngõ 10 Mai Hắc Đế', N'Hai Bà Chưng', N'Hà Nội', N'Đất thổ cư', 320, 93000),
							   (004, 003,'BDS018', N'Số 71, Ngõ 89 Mai Hắc Đế', N'Hai Bà Chưng', N'Hà Nội', N'Đất lâm nghiệp', 532, 26000),
							   (004, 003,'BDS019', N'Số 3, Ngõ 60 Mai Hắc Đế', N'Hai Bà Chưng', N'Hà Nội', N'Đất thổ cư', 520, 5300000),
							   (004, 003,'BDS020', N'Số 6, Ngõ 4 Mai Hắc Đế', N'Hai Bà Chưng', N'Hà Nội', N'Đất quy hoạch', 600, 1000000),
							   (005, 003,'BDS021', N'Số 54, Ngõ 46/6 Lâm Hạ', N'Long Biên', N'Hà Nội', N'Đất thổ cư', 130, 93000),
							   (005, 003,'BDS022', N'Số 23, Ngõ 05 Lâm Hạ', N'Long Biên', N'Hà Nội', N'Đất thổ cư', 110, 93000),
							   (005, 003,'BDS023', N'Số 12, Ngõ 06/05 Lâm Hạ', N'Long Biên', N'Hà Nội', N'Đất thổ cư', 106, 93000),
							   (002, 003,'BDS024', N'Số 03, Ngõ 06/21 Lâm Hạ', N'Long Biên', N'Hà Nội', N'Đất thổ cư', 103, 93000),
							   (005, 003,'BDS025', N'Số 51, Ngõ 03 Lâm Hạ', N'Long Biên', N'Hà Nội', N'Đất quy hoạch', 130, 93000),
							   (005, 003,'BDS026', N'Số 06, Ngõ 53 Lâm Hạ', N'Long Biên', N'Hà Nội', N'Đất thổ cư', 160, 93000),
							   (003, 003,'BDS027', N'Số 03, Ngõ 13 Lâm Hạ', N'Long Biên', N'Hà Nội', N'Đất lâm nghiệp', 110, 93000),
							   (005, 003,'BDS028', N'Số 07, Ngõ 42 Lâm Hạ', N'Long Biên', N'Hà Nội', N'Đất thổ cư', 156, 93000),
							   (005, 003,'BDS029', N'Số 09, Ngõ 82 Lâm Hạ', N'Long Biên', N'Hà Nội', N'Đất nông nghiệp', 261, 93000),
							   (005, 003,'BDS030', N'Số 2A/5, Ngõ 13/5 Lâm Hạ', N'Long Biên', N'Hà Nội', N'Đất thổ cư', 620, 6000000)


--GO
--CREATE TRIGGER TG_INSERT_BDS ON batDongSan
--FOR INSERT
--AS
--BEGIN
--			IF(SELECT GiaBDS FROM inserted) < 5000000 AND (SELECT dienTichBDS FROM inserted) < 0 
--			BEGIN
--					PRINT N'GIÁ TIỀN KHÔNG ĐƯỢC NHỎ HƠN 50000000'
--					ROLLBACK TRANSACTION
--			END
--END

--GO 
--CREATE TRIGGER TG_INSERT_NHANVIEN ON nhanVien
--FOR INSERT
--AS
--BEGIN
--			IF(SELECT Email FROM inserted) NOT LIKE '%[A-Z0-9][@][A-Z0-9]%[.][A-Z0-9]%' 
--			BEGIN
--					PRINT N'Email không hợp lệ'
--					ROLLBACK TRANSACTION
--			END
--END