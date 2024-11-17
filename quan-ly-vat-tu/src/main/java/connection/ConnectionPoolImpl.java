package connection;

import java.sql.*;
import java.util.*; 

public class ConnectionPoolImpl implements ConnectionPool {
	private String driver;
	private String username;
	private String password;
	
	private String url;
	
	private Stack<Connection> pool;
	
	// singleton design parttern
	private static ConnectionPool cp=null;
	
	private ConnectionPoolImpl() {
		// xac dinh trinh dieu khien
		this.driver="com.mysql.cj.jdbc.Driver";
		
		// xac dinh duong dan chay mysql
		this.url="jdbc:mysql://localhost:3306/qlvtbv?allowMultiQueries=true";// 
		
		// xac dinh tai khoan lam viec
		this.username="root";
		this.password="123456789";
		
		// nap trinh dieu khien
		try {
			Class.forName(this.driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// khoi tao bo nho luu tru doi tuong ket noi
		this.pool = new Stack<>();
	}

	@Override
	public Connection getConnection(String objectName) throws SQLException {
		// TODO Auto-generated method stub
		if(this.pool.isEmpty()) {
			// khoi tao ket noi moi
			System.out.println(objectName+"have created a new Connection");
			return DriverManager.getConnection(this.url, this.username, this.password);
		}else {
			// lay ket noi da duoc luu tru
			System.out.println(objectName+"have poped the Connection");
			return this.pool.pop();
		}
	}
//Lợi ích của thiết kế
	//Quản lý tài nguyên hiệu quả : 
	//An toàn luồng 
	//Khả năng mở rộng : Cho phép quản lý nhiều yêu cầu một cách hiệu quả bằng cách sử dụng lại các kết nối từ nhóm.

	@Override
	public void releaseConnection(Connection con, String objectName) throws SQLException {
		// TODO Auto-generated method stub
		// thu hoi lai ket noi
		System.out.println(objectName+"have pushed the  Connection");
		this.pool.push(con);

	}
	
	public static ConnectionPool getInstance() {
		if(cp==null) {
			synchronized (ConnectionPoolImpl.class) {
				if(cp== null) {
					cp= new ConnectionPoolImpl();
				}
					
			}
		}
		 
		return cp;
	}

}
