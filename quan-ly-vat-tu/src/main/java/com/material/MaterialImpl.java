package com.material;

import java.sql.*;
import java.util.ArrayList;
import com.object.MaterialObject;
import com.basic.BasicImpl;

public class MaterialImpl extends BasicImpl implements Material {

    public MaterialImpl() {
        super("Material");
    }

    @Override
    public boolean addMaterial(MaterialObject item) {
        String sql = "INSERT INTO material (material_name, category_id, supplier_id, unit, quantity_in_stock, reorder_level, color, size, manufacture_date, expiration_date, description) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pre = this.con.prepareStatement(sql)) {
            pre.setString(1, item.getMaterial_name());
            pre.setInt(2, item.getCategory_id());
            pre.setInt(3, item.getSupplier_id());
            pre.setString(4, item.getUnit());
            pre.setInt(5, item.getQuantity_in_stock());
            pre.setInt(6, item.getReorder_level());
            pre.setString(7, item.getColor());
            pre.setString(8, item.getSize());
            pre.setDate(9, item.getManufacture_date());
            pre.setDate(10, item.getExpiration_date());
            pre.setString(11, item.getDescription());
            return this.add(pre); // Sử dụng phương thức add từ BasicImpl để thực hiện câu lệnh INSERT
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean editMaterial(MaterialObject item) {
        String sql = "UPDATE material SET material_name = ?, category_id = ?, supplier_id = ?, unit = ?, quantity_in_stock = ?, reorder_level = ?, "
                + "color = ?, size = ?, manufacture_date = ?, expiration_date = ?, description = ? WHERE material_id = ?";

        try (PreparedStatement pre = this.con.prepareStatement(sql)) {
            pre.setString(1, item.getMaterial_name());
            pre.setInt(2, item.getCategory_id());
            pre.setInt(3, item.getSupplier_id());
            pre.setString(4, item.getUnit());
            pre.setInt(5, item.getQuantity_in_stock());
            pre.setInt(6, item.getReorder_level());
            pre.setString(7, item.getColor());
            pre.setString(8, item.getSize());
            pre.setDate(9, item.getManufacture_date());
            pre.setDate(10, item.getExpiration_date());
            pre.setString(11, item.getDescription());
            pre.setInt(12, item.getMaterial_id());
            return this.edit(pre); // Sử dụng phương thức edit từ BasicImpl để thực hiện câu lệnh UPDATE
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteMaterial(MaterialObject item) {
        String sql = "DELETE FROM material WHERE material_id = ?";

        try (PreparedStatement pre = this.con.prepareStatement(sql)) {
            pre.setInt(1, item.getMaterial_id());
            return this.delete(pre); // Sử dụng phương thức delete từ BasicImpl để thực hiện câu lệnh DELETE
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public ArrayList<ResultSet> getMaterials(MaterialObject similar, int at, byte total) {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM material ");
        
        // Nếu có thông tin tương tự trong đối tượng 'similar', thêm điều kiện tìm kiếm
        if (similar != null) {
            if (similar.getMaterial_name() != null && !similar.getMaterial_name().isEmpty()) {
                sql.append("WHERE material_name LIKE ? ");
            }
            // Có thể thêm các điều kiện khác cho category_id, supplier_id, color, etc.
        }

        // Phân trang
        sql.append("ORDER BY material_id DESC ");
        sql.append("LIMIT ").append(at).append(", ").append(total);

        // Đếm tổng số vật tư
        sql.append("SELECT COUNT(material_id) AS total FROM material;");

        // Trả về kết quả
        return this.gets(sql.toString());
    }

    @Override
    public ResultSet getMaterial(int id) {
        String sql = "SELECT * FROM material WHERE material_id = ?";
        return this.get(sql, id); // Sử dụng phương thức get từ BasicImpl để truy vấn vật tư theo ID
    }

    @Override
    public ResultSet getMaterial(String materialName, int supplierId) {
    	return null;
    }

    // Phương thức main để kiểm tra
    public static void main(String[] args) {
        MaterialImpl materialImpl = new MaterialImpl();
        
//        // Tạo đối tượng MaterialObject cho vật tư mới
//        MaterialObject newMaterial = new MaterialObject();
//        newMaterial.setMaterial_name("Vật tư A");
//        newMaterial.setCategory_id(7);
//        newMaterial.setSupplier_id(8);
//        newMaterial.setUnit("Cái");
//        newMaterial.setQuantity_in_stock(100);
//        newMaterial.setReorder_level(10);
//        newMaterial.setColor("Đỏ");
//        newMaterial.setSize("Lớn");
//        newMaterial.setManufacture_date(Date.valueOf("2024-01-01"));
//        newMaterial.setExpiration_date(Date.valueOf("2025-01-01"));
//        newMaterial.setDescription("Vật tư A mô tả");
//
//        // Thêm vật tư vào cơ sở dữ liệu
//        boolean isAdded = materialImpl.addMaterial(newMaterial);
//        if (isAdded) {
//            System.out.println("Vật tư đã được thêm thành công.");
//        } else {
//            System.out.println("Thêm vật tư thất bại.");
//        }
        
        // Tạo đối tượng MaterialObject để sửa thông tin vật tư
//        MaterialObject updateMaterial = new MaterialObject();
//        updateMaterial.setMaterial_id(3); // ID vật tư cần sửa (ví dụ: ID = 1)
//        updateMaterial.setMaterial_name("Vật tư 3 Updated");
//        updateMaterial.setCategory_id(6);
//        updateMaterial.setSupplier_id(3);
//        updateMaterial.setUnit("kg");
//        updateMaterial.setQuantity_in_stock(150);
//        updateMaterial.setReorder_level(5);
//        updateMaterial.setColor("Xanh");
//        updateMaterial.setSize("Nhỏ");
//        updateMaterial.setManufacture_date(java.sql.Date.valueOf("2023-01-01"));
//        updateMaterial.setExpiration_date(java.sql.Date.valueOf("2025-01-01"));
//        updateMaterial.setDescription("Vật tư đã cập nhật");
//
//        // Gọi phương thức editMaterial để sửa vật tư
//        boolean isUpdated = materialImpl.editMaterial(updateMaterial);
//        if (isUpdated) {
//            System.out.println("Cập nhật vật tư thành công!");
//        } else {
//            System.out.println("Cập nhật vật tư thất bại!");
//        }
//
        // Tạo đối tượng MaterialObject để xóa vật tư
        MaterialObject deleteMaterial = new MaterialObject();
        deleteMaterial.setMaterial_id(3);  // ID vật tư cần xóa

        // Gọi phương thức deleteMaterial để xóa vật tư
        boolean isDeleted = materialImpl.deleteMaterial(deleteMaterial);
        if (isDeleted) {
            System.out.println("Xóa vật tư thành công!");
        } else {
            System.out.println("Xóa vật tư thất bại!");
        }
    }
}

