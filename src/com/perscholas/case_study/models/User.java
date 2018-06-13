package com.perscholas.case_study.models;

public class User {
	
	private Integer user_id; 
	private String email;
	private String password; 
	private Integer user_role;
//	private String res_type; 
//	private String address_one;
//	private String address_two;
//	private String city;
//	private String state;
//	private String zip_code;
//	private String res_use;
	
	
	public User() {
		
	}



	public User(Integer user_id, String email, String password, Integer user_role) {
		this.user_id = user_id;
		this.email = email;
		this.password = password;
		this.user_role = user_role;
	}
	

	public Integer getUser_role() {
		return user_role;
	}



	public void setUser_role(Integer user_role) {
		this.user_role = user_role;
	}



	public User(String email, String password, Integer user_role) {
		this.email = email;
		this.password = password;
		this.user_role = user_role;
	}


	public Integer getUser_id() {
		return user_id;
	}


	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
}


