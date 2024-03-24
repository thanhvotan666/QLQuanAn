use QLQA;
delete from LUU;
delete from CHITIETHOADON;
delete from HOADON;
delete from BAN;
delete from NHANVIEN;
delete from	MENU;
insert into NHANVIEN values 
('NV000','******',N'Deleted',0,N'','2000-01-01','',N'',0);

insert into NHANVIEN values 
('NV001','111111',N'Võ Tấn Thành',1,N'\img\img1.png','2002-04-22','0909124565',N'Ngọc Hiển, Cà Mau',1),
('NV002','222222',N'Đặng Thành Phát',1,N'\img\img2.png','2003-05-19','0987542361',N'Ninh Kiều, Cần Thơ',0),
('NV003','333333',N'Nguyễn Thị Thảo Nhi',0,N'\img\img3.png','2000-01-19','0985741239',N'Cái Răng, Cần Thơ',0),
('NV004','444444',N'Nguyễn Lê Gia Bảo',1,N'\img\img4.png','2002-05-29','0978965234',N'Hà Nội',0),
('NV005','555555',N'Nguyễn Ngô Thanh Huy',1,N'\img\img5.png','2002-08-1','0978541236',N'Lạng Sơn',0),
('NV006','666666',N'Trần Quốc Trọng',1,N'\img\img6.png','2003-10-19','0987541962',N'Sài Gòn',1);

-- Ngay sinh Năm-tháng-ngày
insert into BAN values 
('B000',N'Deleted',1);
insert into BAN values 
('B001',N'Bàn 1',1),
('B002',N'Bàn 2',1),
('B003',N'Bàn 3',1),
('B004',N'Bàn 4',1),
('B005',N'Bàn 5',1),
('B006',N'Bàn 6',1),
('B007',N'Bàn 7',1),
('B008',N'Bàn 8',1),
('B009',N'Bàn 9',1),
('B010',N'Bàn 10',1);

insert into MENU values 
('MN000',N'Deleted',0,N'',0);

insert into MENU values 
('MN001',N'Mẹt độc thân',35000,N'Món chính',1),
('MN002',N'Mẹt cập đôi',65000,N'Món chính',1),
('MN003',N'Mẹt chuyện 3 người',95000,N'Món chính',1),
('MN004',N'Mẹt độc thân đặc biệt',45000,N'Món chính',1),
('MN005',N'Mẹt cập đôi đặc biệt',80000,N'Món chính',1),
('MN006',N'Mẹt chuyện 3 người đặc biệt',115000,N'Món chính',1),
('MN007',N'Mẹt SIÊU TO KHỔNG LỒ',399000,N'Món chính',1),
('MN008',N'Cà pháo',3000,N'Món thêm',1),
('MN009',N'Bánh tráng',3000,N'Món thêm',1),
('MN010',N'Đậu',8000,N'Món thêm',1),
('MN011',N'Giò',15000,N'Món thêm',1),
('MN012',N'Chả cốm',12000,N'Món thêm',1),
('MN013',N'Nem rán',12000,N'Món thêm',1),
('MN014',N'Chả sụn',12000,N'Món thêm',1),
('MN015',N'Hoành Thánh',12000,N'Món thêm',1),
('MN016',N'Khóm, chuối, dưa leo',3000,N'Món thêm',1),
('MN017',N'Pepsi',10000,N'Đồ uống',1),
('MN018',N'7UP',10000,N'Đồ uống',1),
('MN019',N'Sting',10000,N'Đồ uống',1),
('MN020',N'Dâu tằm',10000,N'Đồ uống',1),
('MN021',N'Nước suối',5000,N'Đồ uống',1),
('MN022',N'Trà xanh 0 độ',10000,N'Đồ uống',1),
('MN023',N'Trà xanh Tea+',10000,N'Đồ uống',1),
('MN024',N'Bánh ịn',3000,N'Món thêm',1);


-- Hóa đơn được tự động bằng code TAY :v
insert into HOADON values('HD001','2023-09-18',309000.0,'B006','NV003');
insert into CHITIETHOADON values('CTHD000001','HD001','MN003',3,285000.0);
insert into CHITIETHOADON values('CTHD000002','HD001','MN014',2,24000.0);
-------------------------------------
insert into HOADON values('HD002','2023-09-18',214000.0,'B009','NV003');
insert into CHITIETHOADON values('CTHD000003','HD002','MN003',2,190000.0);
insert into CHITIETHOADON values('CTHD000004','HD002','MN016',3,9000.0);
insert into CHITIETHOADON values('CTHD000005','HD002','MN021',3,15000.0);
-------------------------------------
insert into HOADON values('HD003','2023-09-18',151000.0,'B001','NV004');
insert into CHITIETHOADON values('CTHD000006','HD003','MN004',3,135000.0);
insert into CHITIETHOADON values('CTHD000007','HD003','MN010',2,16000.0);
-------------------------------------
insert into HOADON values('HD004','2023-09-18',345000.0,'B010','NV005');
insert into CHITIETHOADON values('CTHD000008','HD004','MN006',3,345000.0);
-------------------------------------
insert into HOADON values('HD005','2023-09-19',65000.0,'B003','NV005');
insert into CHITIETHOADON values('CTHD000009','HD005','MN002',1,65000.0);
-------------------------------------
insert into HOADON values('HD006','2023-09-19',240000.0,'B009','NV003');
insert into CHITIETHOADON values('CTHD000010','HD006','MN005',3,240000.0);
-------------------------------------
insert into HOADON values('HD007','2023-09-19',151000.0,'B005','NV001');
insert into CHITIETHOADON values('CTHD000011','HD007','MN001',3,105000.0);
insert into CHITIETHOADON values('CTHD000012','HD007','MN015',3,36000.0);
insert into CHITIETHOADON values('CTHD000013','HD007','MN018',1,10000.0);
-------------------------------------
insert into HOADON values('HD008','2023-09-20',190000.0,'B005','NV003');
insert into CHITIETHOADON values('CTHD000014','HD008','MN003',2,190000.0);
-------------------------------------
insert into HOADON values('HD009','2023-09-20',148000.0,'B008','NV002');
insert into CHITIETHOADON values('CTHD000015','HD009','MN006',1,115000.0);
insert into CHITIETHOADON values('CTHD000016','HD009','MN009',1,3000.0);
insert into CHITIETHOADON values('CTHD000017','HD009','MN019',3,30000.0);
-------------------------------------
insert into HOADON values('HD010','2023-09-20',220000.0,'B005','NV002');
insert into CHITIETHOADON values('CTHD000018','HD010','MN003',2,190000.0);
insert into CHITIETHOADON values('CTHD000019','HD010','MN011',2,30000.0);
-------------------------------------
insert into HOADON values('HD011','2023-09-21',176000.0,'B008','NV003');
insert into CHITIETHOADON values('CTHD000020','HD011','MN005',2,160000.0);
insert into CHITIETHOADON values('CTHD000021','HD011','MN010',2,16000.0);
-------------------------------------
insert into HOADON values('HD012','2023-09-21',105000.0,'B009','NV004');
insert into CHITIETHOADON values('CTHD000022','HD012','MN001',3,105000.0);
-------------------------------------
insert into HOADON values('HD013','2023-09-21',195000.0,'B002','NV005');
insert into CHITIETHOADON values('CTHD000023','HD013','MN002',3,195000.0);
-------------------------------------
insert into HOADON values('HD014','2023-09-22',308000.0,'B004','NV002');
insert into CHITIETHOADON values('CTHD000024','HD014','MN003',3,285000.0);
insert into CHITIETHOADON values('CTHD000025','HD014','MN008',1,3000.0);
insert into CHITIETHOADON values('CTHD000026','HD014','MN022',2,20000.0);
-------------------------------------
insert into HOADON values('HD015','2023-09-22',80000.0,'B008','NV006');
insert into CHITIETHOADON values('CTHD000027','HD015','MN005',1,80000.0);
-------------------------------------
insert into HOADON values('HD016','2023-09-22',124000.0,'B005','NV001');
insert into CHITIETHOADON values('CTHD000028','HD016','MN004',2,90000.0);
insert into CHITIETHOADON values('CTHD000029','HD016','MN012',2,24000.0);
insert into CHITIETHOADON values('CTHD000030','HD016','MN019',1,10000.0);
-------------------------------------
insert into HOADON values('HD017','2023-09-22',95000.0,'B010','NV001');
insert into CHITIETHOADON values('CTHD000031','HD017','MN003',1,95000.0);
-------------------------------------
insert into HOADON values('HD018','2023-09-22',136000.0,'B004','NV003');
insert into CHITIETHOADON values('CTHD000032','HD018','MN001',2,70000.0);
insert into CHITIETHOADON values('CTHD000033','HD018','MN014',3,36000.0);
insert into CHITIETHOADON values('CTHD000034','HD018','MN020',3,30000.0);
-------------------------------------
insert into HOADON values('HD019','2023-09-23',435000.0,'B008','NV006');
insert into CHITIETHOADON values('CTHD000035','HD019','MN007',1,399000.0);
insert into CHITIETHOADON values('CTHD000036','HD019','MN008',2,6000.0);
insert into CHITIETHOADON values('CTHD000037','HD019','MN018',3,30000.0);
-------------------------------------
insert into HOADON values('HD020','2023-09-24',109000.0,'B006','NV003');
insert into CHITIETHOADON values('CTHD000038','HD020','MN003',1,95000.0);
insert into CHITIETHOADON values('CTHD000039','HD020','MN016',3,9000.0);
insert into CHITIETHOADON values('CTHD000040','HD020','MN021',1,5000.0);
-------------------------------------
insert into HOADON values('HD021','2023-09-24',166000.0,'B009','NV005');
insert into CHITIETHOADON values('CTHD000041','HD021','MN002',2,130000.0);
insert into CHITIETHOADON values('CTHD000042','HD021','MN016',2,6000.0);
insert into CHITIETHOADON values('CTHD000043','HD021','MN019',3,30000.0);
-------------------------------------
insert into HOADON values('HD022','2023-09-24',45000.0,'B001','NV004');
insert into CHITIETHOADON values('CTHD000044','HD022','MN004',1,45000.0);
-------------------------------------
insert into HOADON values('HD023','2023-09-24',54000.0,'B001','NV002');
insert into CHITIETHOADON values('CTHD000045','HD023','MN001',1,35000.0);
insert into CHITIETHOADON values('CTHD000046','HD023','MN016',3,9000.0);
insert into CHITIETHOADON values('CTHD000047','HD023','MN023',1,10000.0);
-------------------------------------
insert into HOADON values('HD024','2023-09-24',71000.0,'B006','NV002');
insert into CHITIETHOADON values('CTHD000048','HD024','MN004',1,45000.0);
insert into CHITIETHOADON values('CTHD000049','HD024','MN010',2,16000.0);
insert into CHITIETHOADON values('CTHD000050','HD024','MN019',1,10000.0);
-------------------------------------
insert into HOADON values('HD025','2023-09-25',810000.0,'B006','NV002');
insert into CHITIETHOADON values('CTHD000051','HD025','MN007',2,798000.0);
insert into CHITIETHOADON values('CTHD000052','HD025','MN014',1,12000.0);
-------------------------------------
insert into HOADON values('HD026','2023-09-25',151000.0,'B004','NV006');
insert into CHITIETHOADON values('CTHD000053','HD026','MN006',1,115000.0);
insert into CHITIETHOADON values('CTHD000054','HD026','MN014',3,36000.0);
-------------------------------------
insert into HOADON values('HD027','2023-09-26',90000.0,'B002','NV006');
insert into CHITIETHOADON values('CTHD000055','HD027','MN004',2,90000.0);
-------------------------------------
insert into HOADON values('HD028','2023-09-26',70000.0,'B006','NV005');
insert into CHITIETHOADON values('CTHD000056','HD028','MN001',2,70000.0);
-------------------------------------
insert into HOADON values('HD029','2023-09-26',135000.0,'B010','NV006');
insert into CHITIETHOADON values('CTHD000057','HD029','MN001',2,70000.0);
insert into CHITIETHOADON values('CTHD000058','HD029','MN011',3,45000.0);
insert into CHITIETHOADON values('CTHD000059','HD029','MN017',2,20000.0);
-------------------------------------
insert into HOADON values('HD030','2023-09-26',115000.0,'B002','NV003');
insert into CHITIETHOADON values('CTHD000060','HD030','MN006',1,115000.0);
-------------------------------------
insert into HOADON values('HD031','2023-09-27',101000.0,'B006','NV005');
insert into CHITIETHOADON values('CTHD000061','HD031','MN002',1,65000.0);
insert into CHITIETHOADON values('CTHD000062','HD031','MN008',2,6000.0);
insert into CHITIETHOADON values('CTHD000063','HD031','MN018',3,30000.0);
-------------------------------------
insert into HOADON values('HD032','2023-09-27',119000.0,'B003','NV006');
insert into CHITIETHOADON values('CTHD000064','HD032','MN002',1,65000.0);
insert into CHITIETHOADON values('CTHD000065','HD032','MN012',2,24000.0);
insert into CHITIETHOADON values('CTHD000066','HD032','MN019',3,30000.0);
-------------------------------------
insert into HOADON values('HD033','2023-09-27',195000.0,'B009','NV006');
insert into CHITIETHOADON values('CTHD000067','HD033','MN002',3,195000.0);
-------------------------------------
insert into HOADON values('HD034','2023-09-27',101000.0,'B010','NV006');
insert into CHITIETHOADON values('CTHD000068','HD034','MN002',1,65000.0);
insert into CHITIETHOADON values('CTHD000069','HD034','MN015',3,36000.0);
-------------------------------------
insert into HOADON values('HD035','2023-09-27',230000.0,'B010','NV005');
insert into CHITIETHOADON values('CTHD000070','HD035','MN006',2,230000.0);
-------------------------------------
insert into HOADON values('HD036','2023-09-28',119000.0,'B001','NV003');
insert into CHITIETHOADON values('CTHD000071','HD036','MN003',1,95000.0);
insert into CHITIETHOADON values('CTHD000072','HD036','MN013',2,24000.0);
-------------------------------------
insert into HOADON values('HD037','2023-09-29',377000.0,'B003','NV005');
insert into CHITIETHOADON values('CTHD000073','HD037','MN006',3,345000.0);
insert into CHITIETHOADON values('CTHD000074','HD037','MN014',1,12000.0);
insert into CHITIETHOADON values('CTHD000075','HD037','MN019',2,20000.0);
-------------------------------------
insert into HOADON values('HD038','2023-09-29',95000.0,'B008','NV006');
insert into CHITIETHOADON values('CTHD000076','HD038','MN003',1,95000.0);
-------------------------------------
insert into HOADON values('HD039','2023-09-30',130000.0,'B004','NV002');
insert into CHITIETHOADON values('CTHD000077','HD039','MN002',2,130000.0);
-------------------------------------
insert into HOADON values('HD040','2023-09-30',375000.0,'B009','NV006');
insert into CHITIETHOADON values('CTHD000078','HD040','MN006',3,345000.0);
insert into CHITIETHOADON values('CTHD000079','HD040','MN011',2,30000.0);
-------------------------------------
insert into HOADON values('HD041','2023-09-30',1197000.0,'B008','NV006');
insert into CHITIETHOADON values('CTHD000080','HD041','MN007',3,1197000.0);
-------------------------------------
insert into HOADON values('HD042','2023-09-30',90000.0,'B005','NV006');
insert into CHITIETHOADON values('CTHD000081','HD042','MN004',2,90000.0);
-------------------------------------
insert into HOADON values('HD043','2023-10-01',134000.0,'B007','NV002');
insert into CHITIETHOADON values('CTHD000082','HD043','MN006',1,115000.0);
insert into CHITIETHOADON values('CTHD000083','HD043','MN016',3,9000.0);
insert into CHITIETHOADON values('CTHD000084','HD043','MN020',1,10000.0);
-------------------------------------
insert into HOADON values('HD044','2023-10-02',119000.0,'B009','NV001');
insert into CHITIETHOADON values('CTHD000085','HD044','MN005',1,80000.0);
insert into CHITIETHOADON values('CTHD000086','HD044','MN010',3,24000.0);
insert into CHITIETHOADON values('CTHD000087','HD044','MN021',3,15000.0);
-------------------------------------
insert into HOADON values('HD045','2023-10-02',241000.0,'B008','NV001');
insert into CHITIETHOADON values('CTHD000088','HD045','MN003',2,190000.0);
insert into CHITIETHOADON values('CTHD000089','HD045','MN015',3,36000.0);
insert into CHITIETHOADON values('CTHD000090','HD045','MN021',3,15000.0);
-------------------------------------
insert into HOADON values('HD046','2023-10-02',399000.0,'B009','NV003');
insert into CHITIETHOADON values('CTHD000091','HD046','MN007',1,399000.0);
-------------------------------------
insert into HOADON values('HD047','2023-10-02',79000.0,'B009','NV001');
insert into CHITIETHOADON values('CTHD000092','HD047','MN004',1,45000.0);
insert into CHITIETHOADON values('CTHD000093','HD047','MN014',2,24000.0);
insert into CHITIETHOADON values('CTHD000094','HD047','MN020',1,10000.0);
-------------------------------------
insert into HOADON values('HD048','2023-10-03',89000.0,'B004','NV002');
insert into CHITIETHOADON values('CTHD000095','HD048','MN005',1,80000.0);
insert into CHITIETHOADON values('CTHD000096','HD048','MN016',3,9000.0);
-------------------------------------
insert into HOADON values('HD049','2023-10-03',329000.0,'B008','NV004');
insert into CHITIETHOADON values('CTHD000097','HD049','MN003',3,285000.0);
insert into CHITIETHOADON values('CTHD000098','HD049','MN012',2,24000.0);
insert into CHITIETHOADON values('CTHD000099','HD049','MN017',2,20000.0);
-------------------------------------
insert into HOADON values('HD050','2023-10-03',119000.0,'B009','NV002');
insert into CHITIETHOADON values('CTHD000100','HD050','MN003',1,95000.0);
insert into CHITIETHOADON values('CTHD000101','HD050','MN013',2,24000.0);
-------------------------------------
insert into HOADON values('HD051','2023-10-03',129000.0,'B003','NV005');
insert into CHITIETHOADON values('CTHD000102','HD051','MN004',2,90000.0);
insert into CHITIETHOADON values('CTHD000103','HD051','MN016',3,9000.0);
insert into CHITIETHOADON values('CTHD000104','HD051','MN019',3,30000.0);
-------------------------------------
insert into HOADON values('HD052','2023-10-04',91000.0,'B009','NV006');
insert into CHITIETHOADON values('CTHD000105','HD052','MN002',1,65000.0);
insert into CHITIETHOADON values('CTHD000106','HD052','MN010',2,16000.0);
insert into CHITIETHOADON values('CTHD000107','HD052','MN017',1,10000.0);
-------------------------------------
insert into HOADON values('HD053','2023-10-05',102000.0,'B002','NV003');
insert into CHITIETHOADON values('CTHD000108','HD053','MN001',2,70000.0);
insert into CHITIETHOADON values('CTHD000109','HD053','MN015',1,12000.0);
insert into CHITIETHOADON values('CTHD000110','HD053','MN022',2,20000.0);
-------------------------------------
insert into HOADON values('HD054','2023-10-05',190000.0,'B006','NV006');
insert into CHITIETHOADON values('CTHD000111','HD054','MN003',2,190000.0);
-------------------------------------
insert into HOADON values('HD055','2023-10-05',121000.0,'B006','NV004');
insert into CHITIETHOADON values('CTHD000112','HD055','MN005',1,80000.0);
insert into CHITIETHOADON values('CTHD000113','HD055','MN014',3,36000.0);
insert into CHITIETHOADON values('CTHD000114','HD055','MN021',1,5000.0);
-------------------------------------
insert into HOADON values('HD056','2023-10-05',1230000.0,'B008','NV004');
insert into CHITIETHOADON values('CTHD000115','HD056','MN007',3,1197000.0);
insert into CHITIETHOADON values('CTHD000116','HD056','MN009',1,3000.0);
insert into CHITIETHOADON values('CTHD000117','HD056','MN017',3,30000.0);
-------------------------------------
insert into HOADON values('HD057','2023-10-05',270000.0,'B008','NV004');
insert into CHITIETHOADON values('CTHD000118','HD057','MN005',3,240000.0);
insert into CHITIETHOADON values('CTHD000119','HD057','MN011',2,30000.0);
-------------------------------------
insert into HOADON values('HD058','2023-10-06',98000.0,'B001','NV005');
insert into CHITIETHOADON values('CTHD000120','HD058','MN004',2,90000.0);
insert into CHITIETHOADON values('CTHD000121','HD058','MN010',1,8000.0);
-------------------------------------
insert into HOADON values('HD059','2023-10-06',65000.0,'B003','NV003');
insert into CHITIETHOADON values('CTHD000122','HD059','MN002',1,65000.0);
-------------------------------------
insert into HOADON values('HD060','2023-10-07',285000.0,'B008','NV002');
insert into CHITIETHOADON values('CTHD000123','HD060','MN003',3,285000.0);
-------------------------------------
insert into HOADON values('HD061','2023-10-07',204000.0,'B009','NV003');
insert into CHITIETHOADON values('CTHD000124','HD061','MN002',3,195000.0);
insert into CHITIETHOADON values('CTHD000125','HD061','MN016',3,9000.0);
-------------------------------------
insert into HOADON values('HD062','2023-10-07',134000.0,'B005','NV001');
insert into CHITIETHOADON values('CTHD000126','HD062','MN005',1,80000.0);
insert into CHITIETHOADON values('CTHD000127','HD062','MN010',3,24000.0);
insert into CHITIETHOADON values('CTHD000128','HD062','MN022',3,30000.0);
-------------------------------------
insert into HOADON values('HD063','2023-10-08',105000.0,'B001','NV004');
insert into CHITIETHOADON values('CTHD000129','HD063','MN001',3,105000.0);
-------------------------------------
insert into HOADON values('HD064','2023-10-08',804000.0,'B005','NV001');
insert into CHITIETHOADON values('CTHD000130','HD064','MN007',2,798000.0);
insert into CHITIETHOADON values('CTHD000131','HD064','MN016',2,6000.0);
-------------------------------------
insert into HOADON values('HD065','2023-10-08',105000.0,'B004','NV002');
insert into CHITIETHOADON values('CTHD000132','HD065','MN001',3,105000.0);
-------------------------------------
insert into HOADON values('HD066','2023-10-09',165000.0,'B005','NV005');
insert into CHITIETHOADON values('CTHD000133','HD066','MN006',1,115000.0);
insert into CHITIETHOADON values('CTHD000134','HD066','MN011',2,30000.0);
insert into CHITIETHOADON values('CTHD000135','HD066','MN022',2,20000.0);
-------------------------------------
insert into HOADON values('HD067','2023-10-09',70000.0,'B002','NV005');
insert into CHITIETHOADON values('CTHD000136','HD067','MN001',2,70000.0);
-------------------------------------
insert into HOADON values('HD068','2023-10-09',166000.0,'B004','NV001');
insert into CHITIETHOADON values('CTHD000137','HD068','MN005',2,160000.0);
insert into CHITIETHOADON values('CTHD000138','HD068','MN016',2,6000.0);
-------------------------------------
insert into HOADON values('HD069','2023-10-09',399000.0,'B001','NV005');
insert into CHITIETHOADON values('CTHD000139','HD069','MN007',1,399000.0);
-------------------------------------
insert into HOADON values('HD070','2023-10-09',1241000.0,'B005','NV001');
insert into CHITIETHOADON values('CTHD000140','HD070','MN007',3,1197000.0);
insert into CHITIETHOADON values('CTHD000141','HD070','MN015',2,24000.0);
insert into CHITIETHOADON values('CTHD000142','HD070','MN023',2,20000.0);
-------------------------------------
insert into HOADON values('HD071','2023-10-10',81000.0,'B003','NV003');
insert into CHITIETHOADON values('CTHD000143','HD071','MN002',1,65000.0);
insert into CHITIETHOADON values('CTHD000144','HD071','MN009',2,6000.0);
insert into CHITIETHOADON values('CTHD000145','HD071','MN019',1,10000.0);
-------------------------------------
insert into HOADON values('HD072','2023-10-10',230000.0,'B001','NV004');
insert into CHITIETHOADON values('CTHD000146','HD072','MN006',2,230000.0);
-------------------------------------
insert into HOADON values('HD073','2023-10-11',441000.0,'B009','NV004');
insert into CHITIETHOADON values('CTHD000147','HD073','MN007',1,399000.0);
insert into CHITIETHOADON values('CTHD000148','HD073','MN015',1,12000.0);
insert into CHITIETHOADON values('CTHD000149','HD073','MN018',3,30000.0);
-------------------------------------
insert into HOADON values('HD074','2023-10-12',308000.0,'B004','NV004');
insert into CHITIETHOADON values('CTHD000150','HD074','MN003',3,285000.0);
insert into CHITIETHOADON values('CTHD000151','HD074','MN016',1,3000.0);
insert into CHITIETHOADON values('CTHD000152','HD074','MN019',2,20000.0);
-------------------------------------
insert into HOADON values('HD075','2023-10-12',361000.0,'B006','NV004');
insert into CHITIETHOADON values('CTHD000153','HD075','MN006',3,345000.0);
insert into CHITIETHOADON values('CTHD000154','HD075','MN016',2,6000.0);
insert into CHITIETHOADON values('CTHD000155','HD075','MN019',1,10000.0);
-------------------------------------
insert into HOADON values('HD076','2023-10-12',262000.0,'B004','NV004');
insert into CHITIETHOADON values('CTHD000156','HD076','MN006',2,230000.0);
insert into CHITIETHOADON values('CTHD000157','HD076','MN012',1,12000.0);
insert into CHITIETHOADON values('CTHD000158','HD076','MN019',2,20000.0);
-------------------------------------
insert into HOADON values('HD077','2023-10-12',208000.0,'B002','NV004');
insert into CHITIETHOADON values('CTHD000159','HD077','MN002',3,195000.0);
insert into CHITIETHOADON values('CTHD000160','HD077','MN008',1,3000.0);
insert into CHITIETHOADON values('CTHD000161','HD077','MN017',1,10000.0);
-------------------------------------
insert into HOADON values('HD078','2023-10-12',1223000.0,'B010','NV003');
insert into CHITIETHOADON values('CTHD000162','HD078','MN007',3,1197000.0);
insert into CHITIETHOADON values('CTHD000163','HD078','MN010',2,16000.0);
insert into CHITIETHOADON values('CTHD000164','HD078','MN017',1,10000.0);
-------------------------------------
insert into HOADON values('HD079','2023-10-13',828000.0,'B007','NV001');
insert into CHITIETHOADON values('CTHD000165','HD079','MN007',2,798000.0);
insert into CHITIETHOADON values('CTHD000166','HD079','MN011',2,30000.0);
-------------------------------------
insert into HOADON values('HD080','2023-10-13',104000.0,'B009','NV003');
insert into CHITIETHOADON values('CTHD000167','HD080','MN003',1,95000.0);
insert into CHITIETHOADON values('CTHD000168','HD080','MN016',3,9000.0);
-------------------------------------
insert into HOADON values('HD081','2023-10-13',1210000.0,'B001','NV001');
insert into CHITIETHOADON values('CTHD000169','HD081','MN007',3,1197000.0);
insert into CHITIETHOADON values('CTHD000170','HD081','MN008',1,3000.0);
insert into CHITIETHOADON values('CTHD000171','HD081','MN017',1,10000.0);
-------------------------------------
insert into HOADON values('HD082','2023-10-14',50000.0,'B006','NV003');
insert into CHITIETHOADON values('CTHD000172','HD082','MN001',1,35000.0);
insert into CHITIETHOADON values('CTHD000173','HD082','MN011',1,15000.0);
-------------------------------------
insert into HOADON values('HD083','2023-10-14',45000.0,'B004','NV006');
insert into CHITIETHOADON values('CTHD000174','HD083','MN004',1,45000.0);
-------------------------------------
insert into HOADON values('HD084','2023-10-14',219000.0,'B002','NV006');
insert into CHITIETHOADON values('CTHD000175','HD084','MN002',3,195000.0);
insert into CHITIETHOADON values('CTHD000176','HD084','MN015',2,24000.0);
-------------------------------------
insert into HOADON values('HD085','2023-10-14',112000.0,'B009','NV003');
insert into CHITIETHOADON values('CTHD000177','HD085','MN005',1,80000.0);
insert into CHITIETHOADON values('CTHD000178','HD085','MN014',1,12000.0);
insert into CHITIETHOADON values('CTHD000179','HD085','MN019',2,20000.0);
-------------------------------------
insert into HOADON values('HD086','2023-10-14',98000.0,'B008','NV003');
insert into CHITIETHOADON values('CTHD000180','HD086','MN003',1,95000.0);
insert into CHITIETHOADON values('CTHD000181','HD086','MN008',1,3000.0);
-------------------------------------
insert into HOADON values('HD087','2023-10-15',804000.0,'B007','NV002');
insert into CHITIETHOADON values('CTHD000182','HD087','MN007',2,798000.0);
insert into CHITIETHOADON values('CTHD000183','HD087','MN016',2,6000.0);
-------------------------------------
insert into HOADON values('HD088','2023-10-15',266000.0,'B010','NV005');
insert into CHITIETHOADON values('CTHD000184','HD088','MN005',3,240000.0);
insert into CHITIETHOADON values('CTHD000185','HD088','MN010',2,16000.0);
insert into CHITIETHOADON values('CTHD000186','HD088','MN022',1,10000.0);
-------------------------------------
insert into HOADON values('HD089','2023-10-15',281000.0,'B010','NV005');
insert into CHITIETHOADON values('CTHD000187','HD089','MN006',2,230000.0);
insert into CHITIETHOADON values('CTHD000188','HD089','MN015',3,36000.0);
insert into CHITIETHOADON values('CTHD000189','HD089','MN021',3,15000.0);
-------------------------------------
insert into HOADON values('HD090','2023-10-15',171000.0,'B010','NV003');
insert into CHITIETHOADON values('CTHD000190','HD090','MN004',3,135000.0);
insert into CHITIETHOADON values('CTHD000191','HD090','MN014',3,36000.0);
-------------------------------------
insert into HOADON values('HD091','2023-10-16',804000.0,'B008','NV001');
insert into CHITIETHOADON values('CTHD000192','HD091','MN007',2,798000.0);
insert into CHITIETHOADON values('CTHD000193','HD091','MN008',2,6000.0);
-------------------------------------
insert into HOADON values('HD092','2023-10-16',160000.0,'B006','NV001');
insert into CHITIETHOADON values('CTHD000194','HD092','MN005',2,160000.0);
-------------------------------------
insert into HOADON values('HD093','2023-10-16',53000.0,'B003','NV003');
insert into CHITIETHOADON values('CTHD000195','HD093','MN004',1,45000.0);
insert into CHITIETHOADON values('CTHD000196','HD093','MN010',1,8000.0);
-------------------------------------
insert into HOADON values('HD094','2023-10-16',381000.0,'B002','NV006');
insert into CHITIETHOADON values('CTHD000197','HD094','MN006',3,345000.0);
insert into CHITIETHOADON values('CTHD000198','HD094','MN013',3,36000.0);
-------------------------------------
insert into HOADON values('HD095','2023-10-17',115000.0,'B005','NV001');
insert into CHITIETHOADON values('CTHD000199','HD095','MN006',1,115000.0);
-------------------------------------
insert into HOADON values('HD096','2023-10-17',432000.0,'B005','NV001');
insert into CHITIETHOADON values('CTHD000200','HD096','MN007',1,399000.0);
insert into CHITIETHOADON values('CTHD000201','HD096','MN016',1,3000.0);
insert into CHITIETHOADON values('CTHD000202','HD096','MN023',3,30000.0);
-------------------------------------
insert into HOADON values('HD097','2023-10-17',435000.0,'B008','NV004');
insert into CHITIETHOADON values('CTHD000203','HD097','MN007',1,399000.0);
insert into CHITIETHOADON values('CTHD000204','HD097','MN016',2,6000.0);
insert into CHITIETHOADON values('CTHD000205','HD097','MN019',3,30000.0);
-------------------------------------
insert into HOADON values('HD098','2023-10-17',121000.0,'B010','NV003');
insert into CHITIETHOADON values('CTHD000206','HD098','MN001',3,105000.0);
insert into CHITIETHOADON values('CTHD000207','HD098','MN010',2,16000.0);
-------------------------------------
insert into HOADON values('HD099','2023-10-18',240000.0,'B009','NV006');
insert into CHITIETHOADON values('CTHD000208','HD099','MN005',3,240000.0);
-------------------------------------
insert into HOADON values('HD100','2023-10-18',65000.0,'B003','NV003');
insert into CHITIETHOADON values('CTHD000209','HD100','MN002',1,65000.0);
-------------------------------------
insert into HOADON values('HD101','2023-10-18',131000.0,'B008','NV002');
insert into CHITIETHOADON values('CTHD000210','HD101','MN002',1,65000.0);
insert into CHITIETHOADON values('CTHD000211','HD101','MN015',3,36000.0);
insert into CHITIETHOADON values('CTHD000212','HD101','MN018',3,30000.0);
-------------------------------------
insert into HOADON values('HD102','2023-10-18',159000.0,'B010','NV001');
insert into CHITIETHOADON values('CTHD000213','HD102','MN004',3,135000.0);
insert into CHITIETHOADON values('CTHD000214','HD102','MN012',2,24000.0);
-------------------------------------
insert into HOADON values('HD103','2023-10-18',1206000.0,'B010','NV003');
insert into CHITIETHOADON values('CTHD000215','HD103','MN007',3,1197000.0);
insert into CHITIETHOADON values('CTHD000216','HD103','MN008',3,9000.0);
-------------------------------------
insert into HOADON values('HD104','2023-10-19',139000.0,'B001','NV003');
insert into CHITIETHOADON values('CTHD000217','HD104','MN001',3,105000.0);
insert into CHITIETHOADON values('CTHD000218','HD104','MN015',2,24000.0);
insert into CHITIETHOADON values('CTHD000219','HD104','MN023',1,10000.0);
-------------------------------------
insert into HOADON values('HD105','2023-10-19',104000.0,'B003','NV005');
insert into CHITIETHOADON values('CTHD000220','HD105','MN005',1,80000.0);
insert into CHITIETHOADON values('CTHD000221','HD105','MN014',2,24000.0);
-------------------------------------
insert into HOADON values('HD106','2023-10-19',161000.0,'B006','NV005');
insert into CHITIETHOADON values('CTHD000222','HD106','MN004',3,135000.0);
insert into CHITIETHOADON values('CTHD000223','HD106','MN016',2,6000.0);
insert into CHITIETHOADON values('CTHD000224','HD106','MN017',2,20000.0);
-------------------------------------
insert into HOADON values('HD107','2023-10-20',214000.0,'B003','NV001');
insert into CHITIETHOADON values('CTHD000225','HD107','MN003',2,190000.0);
insert into CHITIETHOADON values('CTHD000226','HD107','MN014',2,24000.0);
-------------------------------------
insert into HOADON values('HD108','2023-10-20',104000.0,'B010','NV001');
insert into CHITIETHOADON values('CTHD000227','HD108','MN005',1,80000.0);
insert into CHITIETHOADON values('CTHD000228','HD108','MN010',3,24000.0);
-------------------------------------
insert into HOADON values('HD109','2023-10-20',276000.0,'B007','NV002');
insert into CHITIETHOADON values('CTHD000229','HD109','MN005',3,240000.0);
insert into CHITIETHOADON values('CTHD000230','HD109','MN016',2,6000.0);
insert into CHITIETHOADON values('CTHD000231','HD109','MN020',3,30000.0);
-------------------------------------
insert into HOADON values('HD110','2023-10-20',230000.0,'B009','NV005');
insert into CHITIETHOADON values('CTHD000232','HD110','MN006',2,230000.0);
-------------------------------------
insert into HOADON values('HD111','2023-10-21',1233000.0,'B005','NV004');
insert into CHITIETHOADON values('CTHD000233','HD111','MN007',3,1197000.0);
insert into CHITIETHOADON values('CTHD000234','HD111','MN010',2,16000.0);
insert into CHITIETHOADON values('CTHD000235','HD111','MN022',2,20000.0);
-------------------------------------
insert into HOADON values('HD112','2023-10-21',136000.0,'B001','NV001');
insert into CHITIETHOADON values('CTHD000236','HD112','MN002',2,130000.0);
insert into CHITIETHOADON values('CTHD000237','HD112','MN008',2,6000.0);
-------------------------------------
insert into HOADON values('HD113','2023-10-21',209000.0,'B004','NV004');
insert into CHITIETHOADON values('CTHD000238','HD113','MN003',2,190000.0);
insert into CHITIETHOADON values('CTHD000239','HD113','MN016',3,9000.0);
insert into CHITIETHOADON values('CTHD000240','HD113','MN017',1,10000.0);
-------------------------------------
insert into HOADON values('HD114','2023-10-21',105000.0,'B001','NV002');
insert into CHITIETHOADON values('CTHD000241','HD114','MN001',3,105000.0);
-------------------------------------
insert into HOADON values('HD115','2023-10-21',65000.0,'B010','NV002');
insert into CHITIETHOADON values('CTHD000242','HD115','MN002',1,65000.0);
-------------------------------------
insert into HOADON values('HD116','2023-10-22',240000.0,'B004','NV002');
insert into CHITIETHOADON values('CTHD000243','HD116','MN005',3,240000.0);
-------------------------------------
insert into HOADON values('HD117','2023-10-22',102000.0,'B001','NV005');
insert into CHITIETHOADON values('CTHD000244','HD117','MN004',2,90000.0);
insert into CHITIETHOADON values('CTHD000245','HD117','MN013',1,12000.0);
-------------------------------------
insert into HOADON values('HD118','2023-10-22',101000.0,'B010','NV001');
insert into CHITIETHOADON values('CTHD000246','HD118','MN002',1,65000.0);
insert into CHITIETHOADON values('CTHD000247','HD118','MN013',3,36000.0);
-------------------------------------
insert into HOADON values('HD119','2023-10-22',115000.0,'B001','NV001');
insert into CHITIETHOADON values('CTHD000248','HD119','MN006',1,115000.0);
-------------------------------------
insert into HOADON values('HD120','2023-10-23',204000.0,'B001','NV005');
insert into CHITIETHOADON values('CTHD000249','HD120','MN002',3,195000.0);
insert into CHITIETHOADON values('CTHD000250','HD120','MN009',3,9000.0);
-------------------------------------
insert into HOADON values('HD121','2023-10-23',351000.0,'B003','NV005');
insert into CHITIETHOADON values('CTHD000251','HD121','MN006',3,345000.0);
insert into CHITIETHOADON values('CTHD000252','HD121','MN009',2,6000.0);
-------------------------------------
insert into HOADON values('HD122','2023-10-24',51000.0,'B007','NV005');
insert into CHITIETHOADON values('CTHD000253','HD122','MN004',1,45000.0);
insert into CHITIETHOADON values('CTHD000254','HD122','MN008',2,6000.0);
-------------------------------------
insert into HOADON values('HD123','2023-10-24',104000.0,'B008','NV002');
insert into CHITIETHOADON values('CTHD000255','HD123','MN002',1,65000.0);
insert into CHITIETHOADON values('CTHD000256','HD123','MN009',3,9000.0);
insert into CHITIETHOADON values('CTHD000257','HD123','MN022',3,30000.0);
-------------------------------------
insert into HOADON values('HD124','2023-10-25',215000.0,'B006','NV002');
insert into CHITIETHOADON values('CTHD000258','HD124','MN005',2,160000.0);
insert into CHITIETHOADON values('CTHD000259','HD124','MN011',3,45000.0);
insert into CHITIETHOADON values('CTHD000260','HD124','MN023',1,10000.0);
-------------------------------------
insert into HOADON values('HD125','2023-10-25',169000.0,'B009','NV003');
insert into CHITIETHOADON values('CTHD000261','HD125','MN005',2,160000.0);
insert into CHITIETHOADON values('CTHD000262','HD125','MN009',3,9000.0);
-------------------------------------
insert into HOADON values('HD126','2023-10-25',104000.0,'B006','NV001');
insert into CHITIETHOADON values('CTHD000263','HD126','MN001',2,70000.0);
insert into CHITIETHOADON values('CTHD000264','HD126','MN012',2,24000.0);
insert into CHITIETHOADON values('CTHD000265','HD126','MN023',1,10000.0);
-------------------------------------
insert into HOADON values('HD127','2023-10-26',115000.0,'B005','NV001');
insert into CHITIETHOADON values('CTHD000266','HD127','MN006',1,115000.0);
-------------------------------------
insert into HOADON values('HD128','2023-10-26',45000.0,'B010','NV002');
insert into CHITIETHOADON values('CTHD000267','HD128','MN004',1,45000.0);
-------------------------------------
insert into HOADON values('HD129','2023-10-26',95000.0,'B007','NV006');
insert into CHITIETHOADON values('CTHD000268','HD129','MN003',1,95000.0);
-------------------------------------
insert into HOADON values('HD130','2023-10-27',167000.0,'B002','NV005');
insert into CHITIETHOADON values('CTHD000269','HD130','MN004',3,135000.0);
insert into CHITIETHOADON values('CTHD000270','HD130','MN015',1,12000.0);
insert into CHITIETHOADON values('CTHD000271','HD130','MN019',2,20000.0);
-------------------------------------
insert into HOADON values('HD131','2023-10-27',112000.0,'B001','NV005');
insert into CHITIETHOADON values('CTHD000272','HD131','MN004',2,90000.0);
insert into CHITIETHOADON values('CTHD000273','HD131','MN012',1,12000.0);
insert into CHITIETHOADON values('CTHD000274','HD131','MN018',1,10000.0);
-------------------------------------
insert into HOADON values('HD132','2023-10-27',169000.0,'B006','NV004');
insert into CHITIETHOADON values('CTHD000275','HD132','MN005',2,160000.0);
insert into CHITIETHOADON values('CTHD000276','HD132','MN008',3,9000.0);
-------------------------------------
insert into HOADON values('HD133','2023-10-28',105000.0,'B008','NV004');
insert into CHITIETHOADON values('CTHD000277','HD133','MN001',3,105000.0);
-------------------------------------
insert into HOADON values('HD134','2023-10-28',169000.0,'B004','NV005');
insert into CHITIETHOADON values('CTHD000278','HD134','MN004',3,135000.0);
insert into CHITIETHOADON values('CTHD000279','HD134','MN014',2,24000.0);
insert into CHITIETHOADON values('CTHD000280','HD134','MN020',1,10000.0);
-------------------------------------
insert into HOADON values('HD135','2023-10-28',70000.0,'B005','NV006');
insert into CHITIETHOADON values('CTHD000281','HD135','MN001',2,70000.0);
-------------------------------------
insert into HOADON values('HD136','2023-10-28',190000.0,'B005','NV004');
insert into CHITIETHOADON values('CTHD000282','HD136','MN003',2,190000.0);
-------------------------------------
insert into HOADON values('HD137','2023-10-28',205000.0,'B006','NV006');
insert into CHITIETHOADON values('CTHD000283','HD137','MN005',2,160000.0);
insert into CHITIETHOADON values('CTHD000284','HD137','MN011',3,45000.0);
-------------------------------------
insert into HOADON values('HD138','2023-10-29',35000.0,'B004','NV006');
insert into CHITIETHOADON values('CTHD000285','HD138','MN001',1,35000.0);
-------------------------------------
insert into HOADON values('HD139','2023-10-29',80000.0,'B007','NV004');
insert into CHITIETHOADON values('CTHD000286','HD139','MN005',1,80000.0);
-------------------------------------
insert into HOADON values('HD140','2023-10-29',115000.0,'B008','NV004');
insert into CHITIETHOADON values('CTHD000287','HD140','MN006',1,115000.0);
-------------------------------------
insert into HOADON values('HD141','2023-10-29',135000.0,'B010','NV001');
insert into CHITIETHOADON values('CTHD000288','HD141','MN004',3,135000.0);
-------------------------------------
insert into HOADON values('HD142','2023-10-30',240000.0,'B007','NV004');
insert into CHITIETHOADON values('CTHD000289','HD142','MN005',3,240000.0);
-------------------------------------
insert into HOADON values('HD143','2023-10-30',345000.0,'B010','NV004');
insert into CHITIETHOADON values('CTHD000290','HD143','MN006',3,345000.0);
-------------------------------------
insert into HOADON values('HD144','2023-10-31',134000.0,'B004','NV002');
insert into CHITIETHOADON values('CTHD000291','HD144','MN001',3,105000.0);
insert into CHITIETHOADON values('CTHD000292','HD144','MN016',3,9000.0);
insert into CHITIETHOADON values('CTHD000293','HD144','MN020',2,20000.0);
-------------------------------------
insert into HOADON values('HD145','2023-10-31',70000.0,'B007','NV003');
insert into CHITIETHOADON values('CTHD000294','HD145','MN001',2,70000.0);
-------------------------------------
insert into HOADON values('HD146','2023-11-01',138000.0,'B003','NV002');
insert into CHITIETHOADON values('CTHD000295','HD146','MN002',2,130000.0);
insert into CHITIETHOADON values('CTHD000296','HD146','MN010',1,8000.0);
-------------------------------------
insert into HOADON values('HD147','2023-11-02',130000.0,'B003','NV003');
insert into CHITIETHOADON values('CTHD000297','HD147','MN002',2,130000.0);
-------------------------------------
insert into HOADON values('HD148','2023-11-02',193000.0,'B008','NV003');
insert into CHITIETHOADON values('CTHD000298','HD148','MN003',2,190000.0);
insert into CHITIETHOADON values('CTHD000299','HD148','MN008',1,3000.0);
-------------------------------------
insert into HOADON values('HD149','2023-11-02',105000.0,'B006','NV002');
insert into CHITIETHOADON values('CTHD000300','HD149','MN001',3,105000.0);
-------------------------------------
insert into HOADON values('HD150','2023-11-03',65000.0,'B010','NV005');
insert into CHITIETHOADON values('CTHD000301','HD150','MN002',1,65000.0);
-------------------------------------
insert into HOADON values('HD151','2023-11-03',64000.0,'B008','NV004');
insert into CHITIETHOADON values('CTHD000302','HD151','MN001',1,35000.0);
insert into CHITIETHOADON values('CTHD000303','HD151','MN014',2,24000.0);
insert into CHITIETHOADON values('CTHD000304','HD151','MN021',1,5000.0);
-------------------------------------
insert into HOADON values('HD152','2023-11-03',308000.0,'B004','NV002');
insert into CHITIETHOADON values('CTHD000305','HD152','MN003',3,285000.0);
insert into CHITIETHOADON values('CTHD000306','HD152','MN016',1,3000.0);
insert into CHITIETHOADON values('CTHD000307','HD152','MN020',2,20000.0);
-------------------------------------
insert into HOADON values('HD153','2023-11-03',117000.0,'B008','NV001');
insert into CHITIETHOADON values('CTHD000308','HD153','MN001',3,105000.0);
insert into CHITIETHOADON values('CTHD000309','HD153','MN015',1,12000.0);
-------------------------------------
insert into HOADON values('HD154','2023-11-03',89000.0,'B005','NV004');
insert into CHITIETHOADON values('CTHD000310','HD154','MN005',1,80000.0);
insert into CHITIETHOADON values('CTHD000311','HD154','MN016',3,9000.0);
-------------------------------------
insert into HOADON values('HD155','2023-11-04',124000.0,'B001','NV003');
insert into CHITIETHOADON values('CTHD000312','HD155','MN004',2,90000.0);
insert into CHITIETHOADON values('CTHD000313','HD155','MN012',2,24000.0);
insert into CHITIETHOADON values('CTHD000314','HD155','MN019',1,10000.0);
-------------------------------------
insert into HOADON values('HD156','2023-11-04',126000.0,'B001','NV001');
insert into CHITIETHOADON values('CTHD000315','HD156','MN004',2,90000.0);
insert into CHITIETHOADON values('CTHD000316','HD156','MN013',3,36000.0);
-------------------------------------
insert into HOADON values('HD157','2023-11-04',65000.0,'B002','NV006');
insert into CHITIETHOADON values('CTHD000317','HD157','MN002',1,65000.0);
-------------------------------------
insert into HOADON values('HD158','2023-11-04',119000.0,'B006','NV001');
insert into CHITIETHOADON values('CTHD000318','HD158','MN003',1,95000.0);
insert into CHITIETHOADON values('CTHD000319','HD158','MN012',2,24000.0);
-------------------------------------
insert into HOADON values('HD159','2023-11-04',159000.0,'B010','NV002');
insert into CHITIETHOADON values('CTHD000320','HD159','MN004',3,135000.0);
insert into CHITIETHOADON values('CTHD000321','HD159','MN012',2,24000.0);
-------------------------------------
insert into HOADON values('HD160','2023-11-05',43000.0,'B010','NV004');
insert into CHITIETHOADON values('CTHD000322','HD160','MN001',1,35000.0);
insert into CHITIETHOADON values('CTHD000323','HD160','MN010',1,8000.0);
-------------------------------------
insert into HOADON values('HD161','2023-11-05',95000.0,'B006','NV002');
insert into CHITIETHOADON values('CTHD000324','HD161','MN003',1,95000.0);
-------------------------------------
insert into HOADON values('HD162','2023-11-05',231000.0,'B008','NV002');
insert into CHITIETHOADON values('CTHD000325','HD162','MN002',3,195000.0);
insert into CHITIETHOADON values('CTHD000326','HD162','MN016',2,6000.0);
insert into CHITIETHOADON values('CTHD000327','HD162','MN022',3,30000.0);
-------------------------------------
insert into HOADON values('HD163','2023-11-06',65000.0,'B010','NV001');
insert into CHITIETHOADON values('CTHD000328','HD163','MN002',1,65000.0);
-------------------------------------
insert into HOADON values('HD164','2023-11-06',93000.0,'B005','NV003');
insert into CHITIETHOADON values('CTHD000329','HD164','MN001',2,70000.0);
insert into CHITIETHOADON values('CTHD000330','HD164','MN008',1,3000.0);
insert into CHITIETHOADON values('CTHD000331','HD164','MN017',2,20000.0);
-------------------------------------
insert into HOADON values('HD165','2023-11-07',275000.0,'B009','NV003');
insert into CHITIETHOADON values('CTHD000332','HD165','MN006',2,230000.0);
insert into CHITIETHOADON values('CTHD000333','HD165','MN011',1,15000.0);
insert into CHITIETHOADON values('CTHD000334','HD165','MN019',3,30000.0);
-------------------------------------
insert into HOADON values('HD166','2023-11-07',80000.0,'B003','NV001');
insert into CHITIETHOADON values('CTHD000335','HD166','MN001',1,35000.0);
insert into CHITIETHOADON values('CTHD000336','HD166','MN011',1,15000.0);
insert into CHITIETHOADON values('CTHD000337','HD166','MN022',3,30000.0);
-------------------------------------
insert into HOADON values('HD167','2023-11-07',65000.0,'B003','NV003');
insert into CHITIETHOADON values('CTHD000338','HD167','MN002',1,65000.0);
-------------------------------------
insert into HOADON values('HD168','2023-11-07',285000.0,'B010','NV003');
insert into CHITIETHOADON values('CTHD000339','HD168','MN003',3,285000.0);
-------------------------------------
insert into HOADON values('HD169','2023-11-08',105000.0,'B003','NV003');
insert into CHITIETHOADON values('CTHD000340','HD169','MN001',3,105000.0);
-------------------------------------
insert into HOADON values('HD170','2023-11-08',279000.0,'B003','NV002');
insert into CHITIETHOADON values('CTHD000341','HD170','MN005',3,240000.0);
insert into CHITIETHOADON values('CTHD000342','HD170','MN009',3,9000.0);
insert into CHITIETHOADON values('CTHD000343','HD170','MN018',3,30000.0);
-------------------------------------
insert into HOADON values('HD171','2023-11-08',90000.0,'B002','NV005');
insert into CHITIETHOADON values('CTHD000344','HD171','MN004',2,90000.0);
-------------------------------------
insert into HOADON values('HD172','2023-11-09',219000.0,'B007','NV004');
insert into CHITIETHOADON values('CTHD000345','HD172','MN003',2,190000.0);
insert into CHITIETHOADON values('CTHD000346','HD172','MN015',2,24000.0);
insert into CHITIETHOADON values('CTHD000347','HD172','MN021',1,5000.0);
-------------------------------------
insert into HOADON values('HD173','2023-11-09',135000.0,'B003','NV001');
insert into CHITIETHOADON values('CTHD000348','HD173','MN004',3,135000.0);
-------------------------------------
insert into HOADON values('HD174','2023-11-09',321000.0,'B009','NV003');
insert into CHITIETHOADON values('CTHD000349','HD174','MN003',3,285000.0);
insert into CHITIETHOADON values('CTHD000350','HD174','MN010',2,16000.0);
insert into CHITIETHOADON values('CTHD000351','HD174','MN023',2,20000.0);
-------------------------------------
insert into HOADON values('HD175','2023-11-10',181000.0,'B009','NV002');
insert into CHITIETHOADON values('CTHD000352','HD175','MN006',1,115000.0);
insert into CHITIETHOADON values('CTHD000353','HD175','MN014',3,36000.0);
insert into CHITIETHOADON values('CTHD000354','HD175','MN019',3,30000.0);
-------------------------------------
insert into HOADON values('HD176','2023-11-10',154000.0,'B001','NV004');
insert into CHITIETHOADON values('CTHD000355','HD176','MN006',1,115000.0);
insert into CHITIETHOADON values('CTHD000356','HD176','MN009',3,9000.0);
insert into CHITIETHOADON values('CTHD000357','HD176','MN023',3,30000.0);
-------------------------------------
insert into HOADON values('HD177','2023-11-10',136000.0,'B008','NV002');
insert into CHITIETHOADON values('CTHD000358','HD177','MN002',2,130000.0);
insert into CHITIETHOADON values('CTHD000359','HD177','MN009',2,6000.0);
-------------------------------------
insert into HOADON values('HD178','2023-11-11',105000.0,'B002','NV004');
insert into CHITIETHOADON values('CTHD000360','HD178','MN001',3,105000.0);
-------------------------------------
insert into HOADON values('HD179','2023-11-12',190000.0,'B006','NV002');
insert into CHITIETHOADON values('CTHD000361','HD179','MN003',2,190000.0);
-------------------------------------
insert into HOADON values('HD180','2023-11-12',212000.0,'B007','NV003');
insert into CHITIETHOADON values('CTHD000362','HD180','MN002',3,195000.0);
insert into CHITIETHOADON values('CTHD000363','HD180','MN014',1,12000.0);
insert into CHITIETHOADON values('CTHD000364','HD180','MN021',1,5000.0);
-------------------------------------
insert into HOADON values('HD181','2023-11-12',184000.0,'B008','NV004');
insert into CHITIETHOADON values('CTHD000365','HD181','MN005',2,160000.0);
insert into CHITIETHOADON values('CTHD000366','HD181','MN015',2,24000.0);
-------------------------------------
insert into HOADON values('HD182','2023-11-12',95000.0,'B002','NV005');
insert into CHITIETHOADON values('CTHD000367','HD182','MN003',1,95000.0);
-------------------------------------
insert into HOADON values('HD183','2023-11-13',90000.0,'B001','NV004');
insert into CHITIETHOADON values('CTHD000368','HD183','MN004',2,90000.0);
-------------------------------------
insert into HOADON values('HD184','2023-11-14',348000.0,'B005','NV005');
insert into CHITIETHOADON values('CTHD000369','HD184','MN006',3,345000.0);
insert into CHITIETHOADON values('CTHD000370','HD184','MN009',1,3000.0);
-------------------------------------
insert into HOADON values('HD185','2023-11-14',127000.0,'B004','NV006');
insert into CHITIETHOADON values('CTHD000371','HD185','MN006',1,115000.0);
insert into CHITIETHOADON values('CTHD000372','HD185','MN013',1,12000.0);
-------------------------------------
insert into HOADON values('HD186','2023-11-15',190000.0,'B008','NV002');
insert into CHITIETHOADON values('CTHD000373','HD186','MN003',2,190000.0);
-------------------------------------
insert into HOADON values('HD187','2023-11-15',45000.0,'B004','NV006');
insert into CHITIETHOADON values('CTHD000374','HD187','MN004',1,45000.0);
-------------------------------------
insert into HOADON values('HD188','2023-11-16',135000.0,'B007','NV001');
insert into CHITIETHOADON values('CTHD000375','HD188','MN004',3,135000.0);
-------------------------------------
insert into HOADON values('HD189','2023-11-16',214000.0,'B001','NV006');
insert into CHITIETHOADON values('CTHD000376','HD189','MN005',2,160000.0);
insert into CHITIETHOADON values('CTHD000377','HD189','MN014',2,24000.0);
insert into CHITIETHOADON values('CTHD000378','HD189','MN022',3,30000.0);
-------------------------------------
insert into HOADON values('HD190','2023-11-16',222000.0,'B007','NV002');
insert into CHITIETHOADON values('CTHD000379','HD190','MN003',2,190000.0);
insert into CHITIETHOADON values('CTHD000380','HD190','MN013',1,12000.0);
insert into CHITIETHOADON values('CTHD000381','HD190','MN020',2,20000.0);
-------------------------------------
insert into HOADON values('HD191','2023-11-17',399000.0,'B006','NV001');
insert into CHITIETHOADON values('CTHD000382','HD191','MN007',1,399000.0);
-------------------------------------
insert into HOADON values('HD192','2023-11-17',129000.0,'B008','NV001');
insert into CHITIETHOADON values('CTHD000383','HD192','MN001',3,105000.0);
insert into CHITIETHOADON values('CTHD000384','HD192','MN010',3,24000.0);
-------------------------------------
insert into HOADON values('HD193','2023-11-17',1212000.0,'B008','NV004');
insert into CHITIETHOADON values('CTHD000385','HD193','MN007',3,1197000.0);
insert into CHITIETHOADON values('CTHD000386','HD193','MN011',1,15000.0);
-------------------------------------
insert into HOADON values('HD194','2023-11-17',92000.0,'B006','NV001');
insert into CHITIETHOADON values('CTHD000387','HD194','MN005',1,80000.0);
insert into CHITIETHOADON values('CTHD000388','HD194','MN012',1,12000.0);
-------------------------------------
insert into HOADON values('HD195','2023-11-17',130000.0,'B008','NV005');
insert into CHITIETHOADON values('CTHD000389','HD195','MN002',2,130000.0);
-------------------------------------
insert into HOADON values('HD196','2023-11-18',822000.0,'B003','NV003');
insert into CHITIETHOADON values('CTHD000390','HD196','MN007',2,798000.0);
insert into CHITIETHOADON values('CTHD000391','HD196','MN015',2,24000.0);
-------------------------------------
insert into HOADON values('HD197','2023-11-18',70000.0,'B008','NV006');
insert into CHITIETHOADON values('CTHD000392','HD197','MN001',2,70000.0);
-------------------------------------
insert into HOADON values('HD198','2023-11-18',266000.0,'B001','NV006');
insert into CHITIETHOADON values('CTHD000393','HD198','MN006',2,230000.0);
insert into CHITIETHOADON values('CTHD000394','HD198','MN013',3,36000.0);
-------------------------------------
insert into HOADON values('HD199','2023-11-19',327000.0,'B001','NV006');
insert into CHITIETHOADON values('CTHD000395','HD199','MN003',3,285000.0);
insert into CHITIETHOADON values('CTHD000396','HD199','MN013',1,12000.0);
insert into CHITIETHOADON values('CTHD000397','HD199','MN023',3,30000.0);
-------------------------------------
insert into HOADON values('HD200','2023-11-19',107000.0,'B010','NV006');
insert into CHITIETHOADON values('CTHD000398','HD200','MN002',1,65000.0);
insert into CHITIETHOADON values('CTHD000399','HD200','MN014',1,12000.0);
insert into CHITIETHOADON values('CTHD000400','HD200','MN023',3,30000.0);
-------------------------------------
insert into HOADON values('HD201','2023-11-19',218000.0,'B010','NV003');
insert into CHITIETHOADON values('CTHD000401','HD201','MN003',2,190000.0);
insert into CHITIETHOADON values('CTHD000402','HD201','MN010',1,8000.0);
insert into CHITIETHOADON values('CTHD000403','HD201','MN022',2,20000.0);
-------------------------------------
insert into HOADON values('HD202','2023-11-19',147000.0,'B003','NV002');
insert into CHITIETHOADON values('CTHD000404','HD202','MN002',2,130000.0);
insert into CHITIETHOADON values('CTHD000405','HD202','MN014',1,12000.0);
insert into CHITIETHOADON values('CTHD000406','HD202','MN021',1,5000.0);
-------------------------------------
insert into HOADON values('HD203','2023-11-19',264000.0,'B008','NV006');
insert into CHITIETHOADON values('CTHD000407','HD203','MN005',3,240000.0);
insert into CHITIETHOADON values('CTHD000408','HD203','MN012',2,24000.0);
-------------------------------------
insert into HOADON values('HD204','2023-11-20',114000.0,'B001','NV006');
insert into CHITIETHOADON values('CTHD000409','HD204','MN004',2,90000.0);
insert into CHITIETHOADON values('CTHD000410','HD204','MN015',2,24000.0);
-------------------------------------
insert into HOADON values('HD205','2023-11-20',399000.0,'B006','NV006');
insert into CHITIETHOADON values('CTHD000411','HD205','MN007',1,399000.0);
-------------------------------------
insert into HOADON values('HD206','2023-11-20',381000.0,'B001','NV002');
insert into CHITIETHOADON values('CTHD000412','HD206','MN006',3,345000.0);
insert into CHITIETHOADON values('CTHD000413','HD206','MN015',3,36000.0);
-------------------------------------
insert into HOADON values('HD207','2023-11-20',65000.0,'B009','NV002');
insert into CHITIETHOADON values('CTHD000414','HD207','MN002',1,65000.0);
-------------------------------------
insert into HOADON values('HD208','2023-11-21',396000.0,'B010','NV002');
insert into CHITIETHOADON values('CTHD000415','HD208','MN006',3,345000.0);
insert into CHITIETHOADON values('CTHD000416','HD208','MN014',3,36000.0);
insert into CHITIETHOADON values('CTHD000417','HD208','MN021',3,15000.0);
-------------------------------------
insert into HOADON values('HD209','2023-11-22',174000.0,'B010','NV006');
insert into CHITIETHOADON values('CTHD000418','HD209','MN002',2,130000.0);
insert into CHITIETHOADON values('CTHD000419','HD209','MN015',2,24000.0);
insert into CHITIETHOADON values('CTHD000420','HD209','MN023',2,20000.0);
-------------------------------------
insert into HOADON values('HD210','2023-11-22',138000.0,'B010','NV004');
insert into CHITIETHOADON values('CTHD000421','HD210','MN004',3,135000.0);
insert into CHITIETHOADON values('CTHD000422','HD210','MN008',1,3000.0);
-------------------------------------
insert into HOADON values('HD211','2023-11-23',115000.0,'B007','NV005');
insert into CHITIETHOADON values('CTHD000423','HD211','MN006',1,115000.0);
-------------------------------------
insert into HOADON values('HD212','2023-11-24',834000.0,'B005','NV003');
insert into CHITIETHOADON values('CTHD000424','HD212','MN007',2,798000.0);
insert into CHITIETHOADON values('CTHD000425','HD212','MN013',3,36000.0);
-------------------------------------
insert into HOADON values('HD213','2023-11-24',240000.0,'B008','NV002');
insert into CHITIETHOADON values('CTHD000426','HD213','MN005',3,240000.0);
-------------------------------------
insert into HOADON values('HD214','2023-11-25',212000.0,'B002','NV006');
insert into CHITIETHOADON values('CTHD000427','HD214','MN003',2,190000.0);
insert into CHITIETHOADON values('CTHD000428','HD214','MN015',1,12000.0);
insert into CHITIETHOADON values('CTHD000429','HD214','MN021',2,10000.0);
-------------------------------------
insert into HOADON values('HD215','2023-11-25',159000.0,'B005','NV001');
insert into CHITIETHOADON values('CTHD000430','HD215','MN004',3,135000.0);
insert into CHITIETHOADON values('CTHD000431','HD215','MN013',2,24000.0);
-------------------------------------
insert into HOADON values('HD216','2023-11-26',142000.0,'B005','NV005');
insert into CHITIETHOADON values('CTHD000432','HD216','MN002',2,130000.0);
insert into CHITIETHOADON values('CTHD000433','HD216','MN012',1,12000.0);