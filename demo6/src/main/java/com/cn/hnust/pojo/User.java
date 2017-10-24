package com.cn.hnust.pojo;

public class User {

	private String id;
	private String account;
	private String pwd;
	private String user_email;
	private String user_phone;
	private String user_role;
	
		
		
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String id, String account, String pwd, String user_email, String user_phone, String user_role) {
		super();
		this.id = id;
		this.account = account;
		this.pwd = pwd;
		this.user_email = user_email;
		this.user_phone = user_phone;
		this.user_role = user_role;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", account=" + account + ", pwd=" + pwd + ", user_email=" + user_email
				+ ", user_phone=" + user_phone + ", user_role=" + user_role + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	public String getUser_role() {
		return user_role;
	}
	public void setUser_role(String user_role) {
		this.user_role = user_role;
	}
	
	
	
	
	

}
