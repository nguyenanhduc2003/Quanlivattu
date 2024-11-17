package com.object;

import java.sql.Date;

public class UserObject {
	private int user_id; 
	private String username; 
	private String password;
	private int role_id; 
	private String full_name;
	private String email;  
	private String phone_number;
	private String address;
	private String position; 
	private Date created_at;
	public UserObject() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UserObject(int user_id, String username,String password, int role_id, String full_name, String email,String phone_number, String address, String position, Date date_of_birth, Date created_at) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.password = password;
		this.role_id = role_id;
		this.full_name = full_name;
		this.email = email;
		this.phone_number = phone_number;
		this.address = address;
		this.position = position;
		this.created_at = created_at;
	}
	
	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	@Override
	public String toString() {
		return "UserObject [user_id=" + user_id + ", username=" + username + ", password=" + password + ", role_id="
				+ role_id + ", full_name=" + full_name + ", email=" + email + ", phone_number=" + phone_number
				+ ", address=" + address + ", position=" + position + ", created_at=" + created_at + "]";
	}

	

	
	

}
