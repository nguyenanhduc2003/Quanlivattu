USE quanlivattu;

/*
INSERT INTO `role` (`role_name`, `description`) VALUES
('Quản lý hệ thống', 'Có quyền quản lý toàn bộ hệ thống quản lý vật tư y tế'),
('Nhân viên kho', 'Quản lý hàng hóa và vật tư trong kho'),
('Nhân viên kế toán', 'Theo dõi và xử lý thông tin liên quan đến tài chính'),
('Nhân viên y tế', 'Yêu cầu và sử dụng vật tư y tế trong các hoạt động chuyên môn'),
('Người vận chuyển', 'Phụ trách vận chuyển vật tư y tế đến các cơ sở'),
('Quản lý kho vật tư', 'Quản lý số lượng và trạng thái vật tư y tế trong kho'),
('Nhân viên kỹ thuật', 'Bảo trì và sửa chữa thiết bị y tế'),
('Người kiểm tra chất lượng', 'Đảm bảo chất lượng vật tư y tế khi nhập và xuất kho'),
('Nhân viên mua hàng', 'Đặt hàng và mua vật tư y tế từ các nhà cung cấp'),
('Quản lý nhà cung cấp', 'Quản lý thông tin và giao dịch với nhà cung cấp vật tư y tế'),
('Nhân viên điều phối', 'Điều phối việc phân bổ vật tư y tế đến các khoa phòng'),
('Nhân viên báo cáo', 'Thực hiện báo cáo số liệu và trạng thái vật tư y tế'),
('Người giám sát', 'Giám sát các hoạt động quản lý vật tư y tế'),
('Nhân viên hỗ trợ', 'Hỗ trợ người dùng và xử lý các yêu cầu liên quan đến vật tư'),
('Quản lý khoa phòng', 'Quản lý và yêu cầu vật tư y tế cho khoa phòng mình'),
('Nhân viên nhập liệu', 'Nhập dữ liệu về vật tư y tế vào hệ thống'),
('Quản lý thiết bị y tế', 'Theo dõi và quản lý thiết bị y tế sử dụng trong các cơ sở'),
('Nhân viên thu hồi', 'Phụ trách thu hồi vật tư y tế lỗi hoặc hết hạn sử dụng'),
('Quản lý rủi ro', 'Đánh giá và quản lý các rủi ro liên quan đến vật tư y tế'),
('Nhân viên bảo mật', 'Đảm bảo an toàn và bảo mật thông tin trong hệ thống quản lý vật tư y tế');
*/
/*
INSERT INTO `materialcategory` (`category_name`, `description`) VALUES
('Dụng cụ phẫu thuật', 'Các loại dao mổ, kéo phẫu thuật và các dụng cụ cầm tay dùng trong phẫu thuật'),
('Vật tư tiêu hao', 'Các loại băng gạc, bông, kim tiêm, ống truyền dịch sử dụng một lần'),
('Hóa chất y tế', 'Dung dịch sát khuẩn, thuốc thử, chất khử trùng dùng trong y tế'),
('Thiết bị chẩn đoán', 'Máy siêu âm, máy đo huyết áp, máy chụp X-quang và các thiết bị chẩn đoán khác'),
('Dụng cụ phòng chống dịch', 'Khẩu trang y tế, quần áo bảo hộ, kính chống giọt bắn'),
('Vật tư xét nghiệm', 'Ống nghiệm, que thử, dụng cụ lấy mẫu máu và nước tiểu'),
('Thiết bị hồi sức', 'Máy thở, máy sốc tim và các thiết bị hỗ trợ hồi sức cấp cứu'),
('Thiết bị đo lường', 'Nhiệt kế, máy đo đường huyết, máy đo nồng độ oxy trong máu'),
('Vật tư nha khoa', 'Dụng cụ vệ sinh răng miệng, chất trám răng, và các thiết bị nha khoa'),
('Vật tư chỉnh hình', 'Nẹp, bột bó, xe lăn và các dụng cụ hỗ trợ chỉnh hình'),
('Thiết bị phẫu thuật', 'Đèn mổ, bàn mổ và các thiết bị phụ trợ phẫu thuật'),
('Vật tư tiêm truyền', 'Kim tiêm, dây truyền dịch, ống tiêm và các thiết bị liên quan'),
('Dụng cụ y tế cá nhân', 'Máy đo huyết áp cá nhân, nhiệt kế điện tử và dụng cụ sơ cứu cá nhân'),
('Thiết bị lưu trữ', 'Tủ lạnh y tế, hộp lưu trữ mẫu xét nghiệm và các thiết bị bảo quản khác'),
('Hóa chất vệ sinh', 'Dung dịch tẩy rửa và khử khuẩn bề mặt, hóa chất vệ sinh công nghiệp y tế'),
('Vật tư hỗ trợ di chuyển', 'Gậy chống, xe lăn, nạng và các thiết bị hỗ trợ bệnh nhân di chuyển'),
('Trang thiết bị phòng mổ', 'Thiết bị khử trùng, đèn mổ và các dụng cụ hỗ trợ phòng mổ'),
('Vật tư theo dõi bệnh nhân', 'Máy đo ECG, monitor theo dõi bệnh nhân, thiết bị đo nhiệt độ liên tục'),
('Vật tư sơ cứu', 'Băng cứu thương, dụng cụ cầm máu và các vật tư cần thiết cho sơ cứu'),
('Thiết bị lọc máu', 'Máy chạy thận nhân tạo, bộ lọc máu và các vật tư liên quan');
*/
/*
INSERT INTO `supplier` (`supplier_name`, `contact_name`, `phone_number`, `email`, `address`, `website`) VALUES
('Công ty TNHH Dụng Cụ Y Tế Việt Nam', 'Nguyễn Trung Hiếu', '0987654321', 'contact@dungcuytevietnam.com', 'Số 123, Đường ABC, Quận 1, TP. HCM', 'http://dungcuytevietnam.com'),
('Công ty Cổ Phần Vật Tư Y Tế Miền Bắc', 'Trần Thanh Tâm', '0912345678', 'info@vattuytemienbac.vn', 'Số 45, Đường XYZ, Quận Đống Đa, Hà Nội', 'http://vattuytemienbac.vn'),
('Nhà Phân Phối Thiết Bị Y Tế Á Châu', 'Lê Xuân Nghĩa', '0934567890', 'support@thietbiyteachau.com', 'Số 67, Đường LMN, TP. Đà Nẵng', 'http://thietbiyteachau.com'),
('Công ty TNHH Vật Tư Y Tế Hoàng Gia', 'Phạm Hữu Giang', '0971234567', 'hoanggia@vattuyte.com', 'Số 89, Đường DEF, Quận 7, TP. HCM', 'http://vattuytehoanggia.com'),
('Tập Đoàn Y Tế Quốc Tế', 'Đặng Quốc Tuấn', '0909876543', 'info@ytetquocte.com', 'Số 23, Đường QRS, Quận 2, TP. HCM', 'http://ytetquocte.com'),
('Công ty Cổ Phần Vật Tư Y Tế Thiên Long', 'Nguyễn Anh Phong', '0936789123', 'contact@vattuytethienlong.vn', 'Số 56, Đường TUV, TP. Hải Phòng', 'http://vattuytethienlong.vn'),
('Công ty TNHH Vật Tư Y Tế Nam Việt', 'Trần Trí Dũng', '0945678901', 'namviet@vattuyte.com', 'Số 34, Đường WXY, TP. Cần Thơ', 'http://vattuytenamviet.com'),
('Nhà Cung Cấp Thiết Bị Y Tế Phương Đông', 'Lê Quốc Đạt', '0967890123', 'phuongdong@thietbiyte.com', 'Số 78, Đường ZAB, TP. Vũng Tàu', 'http://thietbiytephuongdong.com'),
('Công ty TNHH Hóa Chất Y Tế Việt Hàn', 'Phạm Minh Tú', '0989012345', 'support@viethanchemicals.vn', 'Số 90, Đường CDE, TP. Nha Trang', 'http://viethanchemicals.vn'),
('Công ty Cổ Phần Vật Tư Y Tế Nhật Bản', 'Nguyễn Hồng Sơn', '0954321098', 'contact@vattuytenhatban.jp', 'Số 21, Đường UVW, TP. Bình Dương', 'http://vattuytenhatban.com');
*/
/*
INSERT INTO `user` (`username`, `password`, `role_id`, `full_name`, `email`, `phone_number`, `address`, `position`, `date_of_birth`) VALUES
('ducna', 'hashedpassword1', 1, 'Nguyễn Anh Đức', 'admin@vattuyte.com', '0912345678', 'Số 123, Đường ABC, Quận 1, TP. HCM', 'Quản lý hệ thống', '1990-05-20'),
('manhvt', 'hashedpassword2', 2, 'Trần Văn Mạnh', 'vanmanh@vattuyte.com', '0987654321', 'Số 45, Đường XYZ, Quận Đống Đa, Hà Nội', 'Nhân viên kho', '1985-08-15'),
('anhlt', 'hashedpassword3', 3, 'Lê Thị Ánh', 'leanh@vattuyte.com', '0971234567', 'Số 67, Đường LMN, TP. Đà Nẵng', 'Nhân viên kế toán', '1992-03-10'),
('tupvan', 'hashedpassword4', 4, 'Phạm Văn Tú', 'vantu@vattuyte.com', '0909876543', 'Số 89, Đường DEF, Quận 7, TP. HCM', 'Nhân viên y tế', '1995-12-25'),
('andbinh', 'hashedpassword5', 5, 'Đặng Bình An', 'binhan@vattuyte.com', '0945678901', 'Số 23, Đường QRS, Quận 2, TP. HCM', 'Người vận chuyển', '1993-06-15'),
('ngocnb', 'hashedpassword6', 6, 'Nguyễn Bảo Ngọc', 'ngocbao@vattuyte.com', '0967890123', 'Số 56, Đường TUV, TP. Hải Phòng', 'Quản lý kho vật tư', '1988-01-30'),
('khanhtd', 'hashedpassword7', 7, 'Trần Duy Khánh', 'duykhanh@vattuyte.com', '0989012345', 'Số 34, Đường WXY, TP. Cần Thơ', 'Nhân viên kỹ thuật', '1991-11-10'),
('yenlh', 'hashedpassword8', 8, 'Lê Hải Yến', 'haiyen@vattuyte.com', '0954321098', 'Số 78, Đường ZAB, TP. Vũng Tàu', 'Người kiểm tra chất lượng', '1987-09-20'),
('cuongpn', 'hashedpassword9', 9, 'Phạm Nguyên Cương', 'nguyencuong@vattuyte.com', '0976543210', 'Số 90, Đường CDE, TP. Nha Trang', 'Nhân viên mua hàng', '1990-07-05'),
('hieunc', 'hashedpassword10', 10, 'Nguyễn Công Hiếu', 'conghieu@vattuyte.com', '0934567890', 'Số 21, Đường UVW, TP. Bình Dương', 'Quản lý nhà cung cấp', '1986-04-18'),
('nhacvan', 'hashedpassword11', 11, 'Nguyễn Văn Nhạc', 'vannhac@vattuyte.com', '0911234567', 'Số 12, Đường ABC, TP. Hà Nội', 'Quản lý hệ thống', '1985-02-22'),
('chinhvan', 'hashedpassword12', 12, 'Trần Văn Chinh', 'chinhvan@vattuyte.com', '0908765432', 'Số 34, Đường DEF, TP. Hồ Chí Minh', 'Nhân viên kho', '1989-05-12'),
('molthi', 'hashedpassword13', 13, 'Lê Thị Mơ', 'molethi@vattuyte.com', '0971239876', 'Số 56, Đường GHI, TP. Đà Nẵng', 'Nhân viên kế toán', '1993-07-20'),
('baopm', 'hashedpassword14', 14, 'Phạm Minh Bảo', 'minhbao@vattuyte.com', '0945678321', 'Số 78, Đường JKL, TP. Cần Thơ', 'Nhân viên y tế', '1990-01-15'),
('duynguyen', 'hashedpassword15', 15, 'Nguyễn Duy', 'duynguyen@vattuyte.com', '0936546789', 'Số 34, Đường MNO, TP. Huế', 'Người vận chuyển', '1992-11-25'),
('nghiale', 'hashedpassword16', 16, 'Lê Minh Nghĩa', 'nghiale@vattuyte.com', '0982345678', 'Số 12, Đường PQR, TP. Vũng Tàu', 'Quản lý kho vật tư', '1987-04-30'),
('anhnhat', 'hashedpassword17', 17, 'Trần Nhật Ánh', 'anhnhat@vattuyte.com', '0923456789', 'Số 56, Đường STU, TP. Nha Trang', 'Nhân viên kỹ thuật', '1994-02-18'),
('dungph', 'hashedpassword18', 18, 'Phạm Hữu Dũng', 'dungpham@vattuyte.com', '0905436789', 'Số 23, Đường VWX, TP. Hà Nội', 'Người kiểm tra chất lượng', '1991-09-10'),
('sonnh', 'hashedpassword19', 19, 'Nguyễn Hoàng Sơn', 'hoangson@vattuyte.com', '0954321234', 'Số 67, Đường YZA, TP. Hải Phòng', 'Nhân viên mua hàng', '1995-06-25'),
('tule', 'hashedpassword20', 20, 'Lê Văn Tú', 'tule@vattuyte.com', '0978765432', 'Số 45, Đường BCD, TP. Đà Lạt', 'Quản lý nhà cung cấp', '1984-03-05');
*/
/*
INSERT INTO `material` (`material_name`, `category_id`, `supplier_id`, `unit`, `quantity_in_stock`, `reorder_level`, `color`, `size`, `manufacture_date`, `expiration_date`, `description`) VALUES
('Dao mổ', 1, 1, 'Cái', 50, 10, 'Bạc', 'Lớn', '2023-01-10', '2025-01-10', 'Dùng trong các ca phẫu thuật lớn'),
('Băng gạc', 2, 2, 'Cuộn', 200, 20, 'Trắng', 'N/A', '2023-05-01', '2025-05-01', 'Băng y tế dùng để băng bó vết thương'),
('Thuốc sát khuẩn', 3, 3, 'Chai', 100, 15, 'Xanh', '500ml', '2023-04-15', '2025-04-15', 'Chất sát khuẩn để làm sạch vết thương'),
('Máy đo huyết áp', 4, 4, 'Cái', 30, 5, 'Đen', 'Lớn', '2023-03-01', '2028-03-01', 'Dùng để đo huyết áp cho bệnh nhân'),
('Khẩu trang y tế', 5, 5, 'Hộp', 500, 50, 'Trắng', 'M', '2023-06-20', '2025-06-20', 'Khẩu trang dùng cho phòng chống dịch bệnh'),
('Ống tiêm', 2, 6, 'Cái', 300, 30, 'Trong suốt', '10ml', '2023-07-15', '2026-07-15', 'Dùng để tiêm thuốc hoặc lấy mẫu xét nghiệm'),
('Máy siêu âm', 4, 7, 'Cái', 5, 1, 'Trắng', 'N/A', '2023-02-25', '2028-02-25', 'Máy dùng trong chẩn đoán hình ảnh'),
('Bông y tế', 2, 8, 'Cuộn', 400, 40, 'Trắng', 'N/A', '2023-05-30', '2025-05-30', 'Bông gòn dùng để vệ sinh và băng bó vết thương'),
('Bộ dụng cụ phẫu thuật', 1, 9, 'Bộ', 20, 5, 'Bạc', 'N/A', '2023-01-10', '2026-01-10', 'Dùng trong các ca phẫu thuật lớn và nhỏ'),
('Giường bệnh', 4, 10, 'Cái', 10, 2, 'Xám', 'Đơn', '2023-03-15', '2028-03-15', 'Giường bệnh cho bệnh nhân nằm điều trị'),
('Quần áo bảo hộ', 5, 3, 'Bộ', 150, 20, 'Xanh dương', 'M', '2023-06-10', '2025-06-10', 'Bộ đồ bảo hộ dùng cho nhân viên y tế'),
('Bình oxy', 4, 2, 'Cái', 20, 3, 'Bạc', 'Lớn', '2023-01-30', '2028-01-30', 'Bình oxy cho bệnh nhân thiếu oxy'),
('Kim tiêm', 2, 3, 'Cái', 200, 20, 'Bạc', '5ml', '2023-04-10', '2026-04-10', 'Kim tiêm dùng trong tiêm thuốc'),
('Găng tay y tế', 5, 4, 'Hộp', 1000, 100, 'Trắng', 'M', '2023-02-20', '2025-02-20', 'Găng tay dùng trong phẫu thuật và thăm khám'),
('Máy x-quang', 4, 5, 'Cái', 3, 1, 'Trắng', 'Lớn', '2023-01-10', '2028-01-10', 'Dùng để chụp hình X-quang cho bệnh nhân'),
('Tủ thuốc', 4, 6, 'Cái', 15, 3, 'Xám', 'N/A', '2023-03-20', '2028-03-20', 'Tủ để lưu trữ thuốc trong bệnh viện'),
('Dụng cụ nha khoa', 1, 7, 'Bộ', 40, 5, 'Bạc', 'N/A', '2023-04-25', '2026-04-25', 'Dụng cụ chuyên dụng trong nha khoa'),
('Que thử đường huyết', 2, 8, 'Hộp', 300, 50, 'Xanh', 'N/A', '2023-05-10', '2025-05-10', 'Dùng để kiểm tra mức đường huyết của bệnh nhân'),
('Dụng cụ kiểm tra ECG', 4, 9, 'Cái', 10, 2, 'Đen', 'N/A', '2023-02-01', '2028-02-01', 'Máy kiểm tra điện tâm đồ cho bệnh nhân'),
('Đèn mổ', 4, 2, 'Cái', 10, 1, 'Trắng', 'N/A', '2023-07-01', '2028-07-01', 'Đèn chuyên dụng trong phòng mổ cho phẫu thuật viên');
*/
/*
INSERT INTO `import` (`supplier_id`, `import_date`, `total_amount`, `created_by`, `status`, `payment_status`) VALUES
(1, '2024-11-01 10:00:00', 100000, 1, 'Chờ xử lý', 'Chưa thanh toán'),
(2, '2024-11-05 11:30:00', 50000, 2, 'Đã hoàn thành', 'Đã thanh toán'),
(3, '2024-11-10 15:00:00', 150000, 3, 'Chờ xử lý', 'Chưa thanh toán'),
(4, '2024-11-12 09:45:00', 120000, 4, 'Đã hoàn thành', 'Đã thanh toán'),
(5, '2024-11-15 14:00:00', 80000, 5, 'Chờ xử lý', 'Chưa thanh toán'),
(6, '2024-11-20 08:30:00', 200000, 6, 'Đã hoàn thành', 'Đã thanh toán'),
(7, '2024-11-22 16:15:00', 55000, 7, 'Chờ xử lý', 'Chưa thanh toán'),
(8, '2024-11-25 12:00:00', 130000, 8, 'Đã hoàn thành', 'Đã thanh toán'),
(9, '2024-11-28 18:00:00', 70000, 9, 'Chờ xử lý', 'Chưa thanh toán'),
(10, '2024-11-30 10:30:00', 40000, 10, 'Đã hoàn thành', 'Đã thanh toán'),
(1, '2024-12-02 14:00:00', 95000, 1, 'Chờ xử lý', 'Chưa thanh toán'),
(2, '2024-12-05 11:00:00', 110000, 2, 'Đã hoàn thành', 'Đã thanh toán'),
(3, '2024-12-08 09:30:00', 135000, 3, 'Chờ xử lý', 'Chưa thanh toán'),
(4, '2024-12-10 16:45:00', 125000, 4, 'Đã hoàn thành', 'Đã thanh toán'),
(5, '2024-12-12 13:00:00', 90000, 5, 'Chờ xử lý', 'Chưa thanh toán'),
(6, '2024-12-15 10:15:00', 175000, 6, 'Đã hoàn thành', 'Đã thanh toán'),
(7, '2024-12-18 14:45:00', 60000, 7, 'Chờ xử lý', 'Chưa thanh toán'),
(8, '2024-12-20 12:30:00', 145000, 8, 'Đã hoàn thành', 'Đã thanh toán'),
(9, '2024-12-22 17:00:00', 85000, 9, 'Chờ xử lý', 'Chưa thanh toán'),
(10, '2024-12-25 10:00:00', 35000, 10, 'Đã hoàn thành', 'Đã thanh toán');
*/
/*
INSERT INTO `importdetail` (`import_id`, `material_id`, `quantity`, `price`, `expiry_date`, `note`) VALUES
(1, 1, 50, 2000, '2025-01-10', 'Đặt hàng theo yêu cầu của bệnh viện'),
(2, 2, 200, 500, '2025-05-01', 'Cung cấp cho các khoa phẫu thuật'),
(3, 3, 100, 1500, '2025-04-15', 'Đặt mua thuốc sát khuẩn để sử dụng lâu dài'),
(4, 4, 30, 50000, '2028-03-01', 'Để phục vụ công tác kiểm tra huyết áp tại phòng khám'),
(5, 5, 500, 1000, '2025-06-20', 'Cung cấp khẩu trang cho nhân viên và bệnh nhân'),
(6, 6, 300, 2000, '2026-07-15', 'Đặt thêm ống tiêm cho ca xét nghiệm'),
(7, 7, 5, 150000, '2028-02-25', 'Máy siêu âm để phục vụ công tác chẩn đoán'),
(8, 8, 400, 800, '2025-05-30', 'Bông y tế được sử dụng trong các phòng phẫu thuật'),
(9, 9, 20, 300000, '2026-01-10', 'Đặt bộ dụng cụ phẫu thuật cho các ca mổ'),
(10, 10, 10, 1200000, '2028-03-15', 'Giường bệnh cho bệnh nhân lâu dài'),
(11, 11, 150, 2000, '2025-06-10', 'Bảo vệ nhân viên y tế trong suốt ca làm việc'),
(12, 12, 20, 35000, '2028-01-30', 'Bình oxy cung cấp cho bệnh nhân cần hỗ trợ thở'),
(13, 13, 200, 1000, '2026-04-10', 'Cung cấp kim tiêm dùng cho nhiều bệnh viện'),
(14, 14, 1000, 2500, '2025-02-20', 'Đặt hàng găng tay y tế cho các bệnh viện'),
(15, 15, 3, 2000000, '2028-01-10', 'Máy x-quang hỗ trợ trong việc chuẩn đoán hình ảnh'),
(16, 16, 15, 50000, '2028-03-20', 'Tủ thuốc dùng để bảo quản thuốc trong bệnh viện'),
(17, 17, 40, 70000, '2026-04-25', 'Dụng cụ nha khoa phục vụ các bệnh viện'),
(18, 18, 300, 3000, '2025-05-10', 'Que thử đường huyết cho bệnh nhân tiểu đường'),
(19, 19, 10, 150000, '2028-02-01', 'Máy kiểm tra ECG cho bệnh viện đa khoa'),
(20, 20, 10, 500000, '2028-07-01', 'Đèn mổ cho phòng mổ của bệnh viện');
*/
/*
INSERT INTO `export` (`department`, `export_date`, `total_amount`, `approved_by`, `status`, `note`) VALUES
('Phòng Kinh Doanh', '2024-11-01 10:00:00', 100000.00, 1, 'Chờ xử lý', 'Cần xuất gấp hàng hóa cho khách hàng'),
('Phòng Y Tế', '2024-11-05 11:30:00', 50000.00, 2, 'Đã duyệt', 'Đơn hàng cần giao nhanh'),
('Phòng Kỹ Thuật', '2024-11-10 15:00:00', 150000.00, 3, 'Chờ xử lý', 'Cần kiểm tra số lượng trước khi xuất'),
('Phòng Vật Tư', '2024-11-12 09:45:00', 120000.00, 4, 'Đã duyệt', 'Chờ quyết định giao hàng'),
('Phòng Marketing', '2024-11-15 14:00:00', 80000.00, 5, 'Chờ xử lý', 'Giao hàng đúng hẹn'),
('Phòng Sản Xuất', '2024-11-20 08:30:00', 200000.00, 6, 'Đã duyệt', 'Đảm bảo chất lượng hàng hóa'),
('Phòng Kinh Doanh', '2024-11-22 16:15:00', 55000.00, 7, 'Chờ xử lý', 'Cần giao hàng ngay'),
('Phòng Y Tế', '2024-11-25 12:00:00', 130000.00, 8, 'Đã duyệt', 'Giao hàng kịp thời'),
('Phòng Kỹ Thuật', '2024-11-28 18:00:00', 70000.00, 9, 'Chờ xử lý', 'Kiểm tra chất lượng hàng hóa'),
('Phòng Vật Tư', '2024-11-30 10:30:00', 40000.00, 10, 'Đã duyệt', 'Giao đúng số lượng yêu cầu'),
('Phòng Marketing', '2024-12-02 14:00:00', 95000.00, 1, 'Chờ xử lý', 'Giao hàng đúng hạn cho đối tác'),
('Phòng Sản Xuất', '2024-12-05 11:00:00', 110000.00, 2, 'Đã duyệt', 'Xuất hàng cho đơn hàng mới'),
('Phòng Kinh Doanh', '2024-12-08 09:30:00', 135000.00, 3, 'Chờ xử lý', 'Kiểm tra kỹ lưỡng số lượng trước khi xuất'),
('Phòng Y Tế', '2024-12-10 16:45:00', 125000.00, 4, 'Đã duyệt', 'Giao đúng thời gian yêu cầu'),
('Phòng Kỹ Thuật', '2024-12-12 13:00:00', 90000.00, 5, 'Chờ xử lý', 'Cần xuất gấp do khẩn cấp'),
('Phòng Vật Tư', '2024-12-15 10:15:00', 175000.00, 6, 'Đã duyệt', 'Đảm bảo hàng hóa không bị hư hỏng trong quá trình vận chuyển'),
('Phòng Marketing', '2024-12-18 14:45:00', 60000.00, 7, 'Chờ xử lý', 'Xuất hàng cho chiến dịch mới'),
('Phòng Sản Xuất', '2024-12-20 12:30:00', 145000.00, 8, 'Đã duyệt', 'Giao đúng yêu cầu khách hàng'),
('Phòng Kinh Doanh', '2024-12-22 17:00:00', 85000.00, 9, 'Chờ xử lý', 'Đảm bảo không thiếu hàng khi giao'),
('Phòng Y Tế', '2024-12-25 10:00:00', 35000.00, 10, 'Đã duyệt', 'Giao đúng số lượng và thời gian yêu cầu');
*/
/*
INSERT INTO `exportdetail` (`export_id`, `material_id`, `quantity`, `price`, `expiry_date`, `note`) VALUES
(1, 1, 100, 10.50, '2025-12-31', 'Giao hàng đúng hạn'),
(2, 2, 50, 20.75, '2025-11-30', 'Cần xử lý gấp'),
(3, 3, 200, 15.30, '2026-01-15', 'Đảm bảo chất lượng'),
(4, 4, 150, 25.00, '2025-12-25', 'Kiểm tra số lượng trước khi giao'),
(5, 5, 120, 30.60, '2025-10-20', 'Không có yêu cầu đặc biệt'),
(6, 6, 180, 22.40, '2026-03-10', 'Yêu cầu bảo quản ở nhiệt độ thấp'),
(7, 7, 75, 18.90, '2025-09-15', 'Giao hàng trước Tết'),
(8, 8, 90, 19.20, '2025-12-10', 'Giao đúng ngày đã hẹn'),
(9, 9, 250, 14.50, '2026-02-28', 'Kiểm tra chất lượng khi nhập kho'),
(10, 10, 100, 28.75, '2025-08-05', 'Cần giao trong ngày hôm nay'),
(11, 1, 80, 11.50, '2026-01-10', 'Kiểm tra kỹ trước khi giao'),
(12, 2, 60, 21.90, '2025-11-01', 'Đảm bảo số lượng'),
(13, 3, 150, 16.00, '2025-12-20', 'Giảm giá cho khách hàng thân thiết'),
(14, 4, 130, 24.80, '2025-10-15', 'Cần giao nhanh chóng'),
(15, 5, 110, 29.50, '2025-11-25', 'Yêu cầu giao sớm hơn'),
(16, 6, 170, 23.10, '2025-09-25', 'Chăm sóc khách hàng sau khi giao'),
(17, 7, 85, 19.50, '2025-10-30', 'Cần phối hợp với vận chuyển'),
(18, 8, 100, 18.00, '2025-12-05', 'Giao đúng theo yêu cầu'),
(19, 9, 220, 14.00, '2026-03-15', 'Kiểm tra lại khi nhập kho'),
(20, 10, 95, 27.20, '2025-08-25', 'Giao hàng trong vòng 48 giờ');
*/


