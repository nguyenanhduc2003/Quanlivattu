package com.user;
import java.sql.*;
import java.util.ArrayList;

import com.basic.BasicImpl;
import com.object.UserObject;

public class UserImpl extends BasicImpl implements User {

	public UserImpl() {
		super("User");
	}

	@Override
	public boolean addUser(UserObject item) {
	    String sql = "INSERT INTO user (username, password, role_id, full_name, email, phone_number, address, position, created_at) "
	               + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)"; // Đã sửa lại câu SQL đúng với các trường của bảng
	    try {
	        PreparedStatement pre = this.con.prepareStatement(sql);
	        pre.setString(1, item.getUsername()); // Thêm giá trị cho username
	        pre.setString(2, item.getPassword());
	        pre.setInt(3, item.getRole_id()); // Thêm giá trị cho role_id
	        pre.setString(4, item.getFull_name());
	        pre.setString(5, item.getEmail());
	        pre.setString(6, item.getPhone_number());
	        pre.setString(7, item.getAddress());
	        pre.setString(8, item.getPosition()); // Thêm giá trị cho position
	        pre.setDate(9, item.getCreated_at()); // Chuyển từ java.util.Date sang java.sql.Date
	        return this.add(pre); // Gọi phương thức để thực hiện câu lệnh INSERT
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return false;
	}


	@Override
	public boolean editUser(UserObject item) {
	    String sql = "UPDATE user SET username = ?, password = ?, role_id = ?, full_name = ?, "
	               + "email = ?, phone_number = ?, address = ?, position = ?, created_at = ? "
	               + "WHERE user_id = ?";

	    try {
	        PreparedStatement pre = this.con.prepareStatement(sql);
	        
	        // Cập nhật tham số đúng với số lượng tham số trong câu lệnh SQL
	        pre.setString(1, item.getUsername());      // username
	        pre.setString(2, item.getPassword());      // password
	        pre.setInt(3, item.getRole_id());          // role_id
	        pre.setString(4, item.getFull_name());     // full_name
	        pre.setString(5, item.getEmail());         // email
	        pre.setString(6, item.getPhone_number());  // phone_number
	        pre.setString(7, item.getAddress());       // address
	        pre.setString(8, item.getPosition());      // position
	        pre.setDate(9, item.getCreated_at());      // created_at
	        pre.setInt(10, item.getUser_id());         // user_id (WHERE condition)
	        
	        return this.edit(pre);
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return false;
	}





	@Override
	public boolean deleteUser(UserObject item) {
		String sql = "DELETE FROM user WHERE user_id = ?";
	    try {
	        PreparedStatement pre = this.con.prepareStatement(sql);
	        pre.setInt(1, item.getUser_id());
	        return this.delete(pre);
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return false;
	}

	@Override
	public ArrayList<ResultSet> getUser(UserObject similar, int at, byte total) {
	    StringBuilder sql = new StringBuilder();
	    sql.append("SELECT * FROM user ");
	    sql.append("ORDER BY user_id DESC ");
	    sql.append("LIMIT ").append(at).append(", ").append(total).append("; ");
	    
	    // Đếm số lượng người sử dụng trên hệ thống
	    sql.append("SELECT COUNT(user_id) AS total FROM user;");
	    
	    return this.gets(sql.toString());
	}

	@Override
	public ResultSet getUser(int id) {
		
		String sql = "SELECT * FROM user WHERE user_id=?";
		// TODO Auto-generated method stub
		return this.get(sql, id);
	}

	@Override
	public ResultSet getUser(String username, String userpass) {
		String sql = "SELECT * FROM user WHERE (username=?) AND (password=?)";
		// TODO Auto-generated method stub
		return this.get(sql, username, userpass);
	}
	
	public static void main(String[] args) {
	    User u = new UserImpl();
//	    
//	    // Danh sách người sử dụng
//	    ArrayList<ResultSet> res = u.getUser(null, 0, (byte) 15);
//	    
//	    if (res != null && res.size() >= 2) {
//	        // Duyệt và hiển thị danh sách người dùng
//	        try (ResultSet rs = res.get(0)) {
//	            String row;
//	            while (rs.next()) {
//	                row = "User ID: " + rs.getInt("user_id");
//	                row += "\tUsername: " + rs.getString("username");
//	                row += "\tPassword: " + rs.getString("password");
//	                row += "\tRole ID: " + rs.getInt("role_id");
//	                row += "\tFull Name: " + rs.getString("full_name");
//	                row += "\tEmail: " + rs.getString("email");
//	                row += "\tPhone Number: " + rs.getString("phone_number");
//	                row += "\tAddress: " + rs.getString("address");
//	                row += "\tPosition: " + rs.getString("position");
//	                row += "\tCreated At: " + rs.getDate("created_at");
//	                System.out.println(row);
//	            }
//	        } catch (SQLException e) {
//	            e.printStackTrace();
//	        }
//
//	        // Tổng số người sử dụng
//	        try (ResultSet rs = res.get(1)) {
//	            if (rs.next()) {
//	                System.out.println("Tổng số người sử dụng: " + rs.getInt("total"));
//	            }
//	        } catch (SQLException e) {
//	            e.printStackTrace();
//	        }
//	    } else {
//	        System.out.println("Không tìm thấy kết quả nào.");
//	    }
//	}
	 //Khởi tạo đối tượng UserImpl
    UserImpl userImpl = new UserImpl();
//
//    // Tạo đối tượng UserObject cho người dùng mới
//    UserObject newUser = new UserObject();
//    newUser.setUsername("NguyenThiKimChi"); // Thiết lập username
//    newUser.setPassword("123456");       // Thiết lập password
//    newUser.setRole_id(3);               // Thiết lập role_id (ví dụ: 1 là người dùng)
//    newUser.setFull_name("Nguyen Thi Kim Chi");
//    newUser.setEmail("NguyenThiKimChi@gmail.com");
//    newUser.setPhone_number("0123456789");
//    newUser.setAddress("Ha Noi");
//    newUser.setPosition("tester");
//    newUser.setCreated_at(new java.sql.Date(System.currentTimeMillis())); // Thiết lập created_at
//
//    // Gọi phương thức addUser để thêm người dùng mới
//    boolean isAdded = userImpl.addUser(newUser);
//
//    // Kết quả thêm người dùng
//    if (isAdded) {
//        System.out.println("Thêm người dùng thành công!");
//    } else {
//        System.out.println("Thêm người dùng thất bại!");
//    }

    // Tạo đối tượng UserObject để sửa thông tin người dùng
//    UserObject update = new UserObject();
//    update.setUsername("nguyenthikimchi_updated"); // Cập nhật username
//    update.setPassword("newpassword123");       // Cập nhật password
//    update.setRole_id(2);                       // Cập nhật role_id (ví dụ: 2 là admin)
//    update.setFull_name("Nguyen Thi Kim Chi Updated");
//    update.setEmail("NguyenThiKimChi_updated@gmail.com");
//    update.setPhone_number("0347346716");
//    update.setAddress("Thanh Hoa");
//    update.setPosition("tester");
//    update.setUser_id(7);                       // Cập nhật user_id (người dùng cần sửa)
//
//    // Gọi phương thức editUser để sửa thông tin người dùng
//    boolean isUpdate = userImpl.editUser(update);
//
//    // Kết quả sửa người dùng
//    if (isUpdate) {
//        System.out.println("Sửa người dùng thành công!");
//    } else {
//        System.out.println("Sửa người dùng thất bại!");
//    }
//
    // Tạo đối tượng UserObject để xóa người dùng
    UserObject delete = new UserObject();
    delete.setUser_id(7);  // ID người dùng cần xóa

    // Gọi phương thức deleteUser để xóa người dùng
    boolean isDeleted = userImpl.deleteUser(delete);

    // Kết quả xóa người dùng
    if (isDeleted) {
        System.out.println("Xóa người dùng thành công!");
    } else {
        System.out.println("Xóa người dùng thất bại!");
    }
}
}

