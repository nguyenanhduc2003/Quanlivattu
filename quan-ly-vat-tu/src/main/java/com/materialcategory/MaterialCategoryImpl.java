package com.materialcategory;

import java.sql.*;
import java.util.ArrayList;

import com.basic.BasicImpl;
import com.object.MaterialCategoryObject;

public class MaterialCategoryImpl extends BasicImpl implements MaterialCategory {

    public MaterialCategoryImpl() {
        super("MaterialCategory");
    }

    @Override
    public boolean addCategory(MaterialCategoryObject item) {
        String sql = "INSERT INTO MaterialCategory (category_name, description) VALUES (?, ?)"; // Câu SQL để thêm danh mục
        try {
            PreparedStatement pre = this.con.prepareStatement(sql);
            pre.setString(1, item.getCategory_name());  
            pre.setString(2, item.getDescription());   
            return this.add(pre);  // Gọi phương thức add từ lớp cha BasicImpl để thực hiện câu lệnh INSERT
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean editCategory(MaterialCategoryObject item) {
        String sql = "UPDATE MaterialCategory SET category_name = ?, description = ? WHERE category_id = ?";

        try {
            PreparedStatement pre = this.con.prepareStatement(sql);
            pre.setString(1, item.getCategory_name());   // Cập nhật category_name
            pre.setString(2, item.getDescription());     // Cập nhật description
            pre.setInt(3, item.getCategory_id());        // Cập nhật category_id (WHERE condition)
            return this.edit(pre);  // Gọi phương thức edit từ lớp cha BasicImpl để thực hiện câu lệnh UPDATE
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteCategory(MaterialCategoryObject item) {
        String sql = "DELETE FROM MaterialCategory WHERE category_id = ?";
        try {
            PreparedStatement pre = this.con.prepareStatement(sql);
            pre.setInt(1, item.getCategory_id());  // Xóa theo category_id
            return this.delete(pre);  // Gọi phương thức delete từ lớp cha BasicImpl để thực hiện câu lệnh DELETE
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public ArrayList<ResultSet> getCategory(MaterialCategoryObject similar, int at, byte total) {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM MaterialCategory ");
        sql.append("ORDER BY category_id DESC ");
        sql.append("LIMIT ").append(at).append(", ").append(total).append("; ");
        
        // Đếm tổng số danh mục
        sql.append("SELECT COUNT(category_id) AS total FROM MaterialCategory;");
        
        return this.gets(sql.toString());  // Gọi phương thức gets từ lớp cha BasicImpl để lấy dữ liệu
    }

    @Override
    public ResultSet getCategory(int id) {
        String sql = "SELECT * FROM MaterialCategory WHERE category_id=?";
        return this.get(sql, id);  // Gọi phương thức get từ lớp cha BasicImpl để lấy thông tin một danh mục theo ID
    }

    // Phương thức để lấy danh mục theo tên (category_name)
    
    @Override
	public ResultSet getCategory(String categoryName) {
		// TODO Auto-generated method stub
		return null;
	}

    public static void main(String[] args) {
        MaterialCategoryImpl categoryImpl = new MaterialCategoryImpl();
//
//        // Tạo đối tượng MaterialCategoryObject cho danh mục mới
//        MaterialCategoryObject newCategory = new MaterialCategoryObject();
//        newCategory.setCategory_name("Vật liệu xây dựng");  // Thiết lập tên danh mục
//        newCategory.setDescription("Các loại vật liệu xây dựng cho công trình");  // Thiết lập mô tả
//
//        // Thêm danh mục mới
//        boolean isAdded = categoryImpl.addCategory(newCategory);
//        if (isAdded) {
//            System.out.println("Thêm danh mục thành công!");
//        } else {
//            System.out.println("Thêm danh mục thất bại!");
//        }

        // Tạo đối tượng MaterialCategoryObject để sửa danh mục
//        MaterialCategoryObject updateCategory = new MaterialCategoryObject();
//        updateCategory.setCategory_id(1);  // ID danh mục cần sửa
//        updateCategory.setCategory_name("Vật liệu điện");  // Cập nhật tên danh mục
//        updateCategory.setDescription("Các loại vật liệu điện cho công trình");  // Cập nhật mô tả
//
//        // Sửa thông tin danh mục
//        boolean isUpdated = categoryImpl.editCategory(updateCategory);
//        if (isUpdated) {
//            System.out.println("Sửa danh mục thành công!");
//        } else {
//            System.out.println("Sửa danh mục thất bại!");
//        }

        // Xóa danh mục
        MaterialCategoryObject deleteCategory = new MaterialCategoryObject();
        deleteCategory.setCategory_id(1);  // ID danh mục cần xóa

        boolean isDeleted = categoryImpl.deleteCategory(deleteCategory);
        if (isDeleted) {
            System.out.println("Xóa danh mục thành công!");
        } else {
            System.out.println("Xóa danh mục thất bại!");
        }
    }

	

	
}
