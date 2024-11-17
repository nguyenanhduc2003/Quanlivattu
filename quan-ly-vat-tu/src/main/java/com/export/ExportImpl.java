package com.export;

import java.sql.*;
import java.util.ArrayList;
import com.object.ExportObject;
import com.basic.BasicImpl;

public class ExportImpl extends BasicImpl implements Export {

    public ExportImpl() {
        super("Export");
    }

    @Override
    public boolean addExport(ExportObject item) {
        String sql = "INSERT INTO export (department, export_date, total_amount, approved_by, status, note) "
                + "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pre = this.con.prepareStatement(sql)) {
            pre.setString(1, item.getDepartment());
            pre.setDate(2, item.getExport_date());
            pre.setDouble(3, item.getTotal_amount());
            pre.setInt(4, item.getApproved_by());
            pre.setString(5, item.getStatus());
            pre.setString(6, item.getNote());
            return this.add(pre); // Sử dụng phương thức add từ BasicImpl để thực hiện câu lệnh INSERT
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean editExport(ExportObject item) {
        String sql = "UPDATE export SET department = ?, export_date = ?, total_amount = ?, approved_by = ?, "
                + "status = ?, note = ? WHERE export_id = ?";

        try (PreparedStatement pre = this.con.prepareStatement(sql)) {
            pre.setString(1, item.getDepartment());
            pre.setDate(2, item.getExport_date());
            pre.setDouble(3, item.getTotal_amount());
            pre.setInt(4, item.getApproved_by());
            pre.setString(5, item.getStatus());
            pre.setString(6, item.getNote());
            pre.setInt(7, item.getExport_id());
            return this.edit(pre); // Sử dụng phương thức edit từ BasicImpl để thực hiện câu lệnh UPDATE
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteExport(ExportObject item) {
        String sql = "DELETE FROM export WHERE export_id = ?";

        try (PreparedStatement pre = this.con.prepareStatement(sql)) {
            pre.setInt(1, item.getExport_id());
            return this.delete(pre); // Sử dụng phương thức delete từ BasicImpl để thực hiện câu lệnh DELETE
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public ArrayList<ResultSet> getExports(ExportObject similar, int at, byte total) {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM export ");
        
        // Nếu có thông tin tương tự trong đối tượng 'similar', thêm điều kiện tìm kiếm
        if (similar != null) {
            if (similar.getDepartment() != null && !similar.getDepartment().isEmpty()) {
                sql.append("WHERE department LIKE ? ");
            }
            // Có thể thêm các điều kiện khác cho status, approved_by, etc.
        }

        // Phân trang
        sql.append("ORDER BY export_id DESC ");
        sql.append("LIMIT ").append(at).append(", ").append(total);

        // Đếm tổng số phiếu xuất
        sql.append("SELECT COUNT(export_id) AS total FROM export;");

        // Trả về kết quả
        return this.gets(sql.toString());
    }

    @Override
    public ResultSet getExport(int id) {
        String sql = "SELECT * FROM export WHERE export_id = ?";
        return this.get(sql, id); // Sử dụng phương thức get từ BasicImpl để truy vấn phiếu xuất theo ID
    }

    @Override
	public ResultSet getExport(String department, String status) {
    	 String sql = "SELECT * FROM export WHERE (department = ?) AND (status =?)";
    	 return this.get(sql, department,status );
	}

    // Phương thức main để kiểm tra
    public static void main(String[] args) {
        ExportImpl exportImpl = new ExportImpl();
        
//        ExportObject newExport = new ExportObject(); 
//        newExport.setDepartment("Phòng Marketing");  
//        newExport.setExport_date(Date.valueOf("2024-11-17"));  
//        newExport.setTotal_amount(1000.50);  
//        newExport.setApproved_by(5); 
//        newExport.setStatus("Pending");  
//        newExport.setNote("Phiếu xuất hàng hóa cho chiến dịch");  
//        
//        // Thêm phiếu xuất vào cơ sở dữ liệu
//        boolean isAdded = exportImpl.addExport(newExport);
//        if (isAdded) {
//            System.out.println("Phiếu xuất đã được thêm thành công.");
//        } else {
//            System.out.println("Thêm phiếu xuất thất bại.");
//        }

        // Tạo đối tượng ExportObject để sửa thông tin phiếu xuất
//        ExportObject updateExport = new ExportObject();
//        updateExport.setExport_id(3);
//        updateExport.setDepartment("Phòng Kỹ thuật");  
//        updateExport.setExport_date(java.sql.Date.valueOf("2024-12-01")); 
//        updateExport.setTotal_amount(2000.75); 
//        updateExport.setApproved_by(2);  
//        updateExport.setStatus("Approved");  
//        updateExport.setNote("Phiếu xuất vật tư cho dự án mới"); 
//        
//        // Gọi phương thức editExport để sửa phiếu xuất
//        boolean isUpdated = exportImpl.editExport(updateExport);
//        if (isUpdated) {
//            System.out.println("Cập nhật phiếu xuất thành công!");
//        } else {
//            System.out.println("Cập nhật phiếu xuất thất bại!");
//        }

        // Tạo đối tượng ExportObject để xóa phiếu xuất
        ExportObject deleteExport = new ExportObject();
        deleteExport.setExport_id(3);  
        
        // Gọi phương thức deleteExport để xóa phiếu xuất
        boolean isDeleted = exportImpl.deleteExport(deleteExport);
        if (isDeleted) {
            System.out.println("Xóa phiếu xuất thành công!");
        } else {
            System.out.println("Xóa phiếu xuất thất bại!");
        }
    }

	
}
