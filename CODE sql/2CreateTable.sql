use QLQA;

create table NHANVIEN(
MANV char(5) primary key not null,
matkhau varchar(30) not null,
tenNV nvarchar(50) not null,
gioitinh bit not null,
img nvarchar(100),
ngaysinh date not null,
sdt varchar(10),
diachi nvarchar(50),
chucvu bit not null
)
create table BAN(
MAB char(4) primary key not null,
tenban nvarchar(15) not null,
tinhtrang bit default 1
)
create table MENU(
MAMN char(5) primary key not null,
tenmon nvarchar(50) not null,
gia int not null,
loai nvarchar(10) not null,
tinhtrang bit default 0
)
create table HOADON(
MAHD char(5) primary key not null,
ngaylap datetime not null,
thanhtien float not null,
MAB char(4) foreign key (MAB) references BAN(MAB) not null,
MANV char(5) foreign key (MANV) references NHANVIEN(MANV) not null
)
create table CHITIETHOADON(
MACTHD char(10) primary key not null,
MAHD char(5) foreign key (MAHD) references HOADON(MAHD) not null,
MAMN char(5) foreign key (MAMN) references MENU(MAMN) not null,
soluong int not null,
tongtien float not null
)
create table LUU(
MAB char(4) foreign key (MAB) references BAN(MAB) not null,
MAMN char(5) foreign key (MAMN) references MENU(MAMN) not null,
soluong int not null,
primary key(MAB,MAMN)
)