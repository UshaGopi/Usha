package com.training.bean;

public class RegBean {
	private String firstname;
	private String lastname;
	private String email;
	private String username;
	private String password;
	private String confirmpass;
	private String phone;

	public RegBean() {
	}

	public RegBean(String firstname, String lastname,String email, String userName,String password,String confirmpass,String phone) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.username = username;
		this.password = password;
		this.confirmpass = confirmpass;
		this.phone = phone;
	}

	public String getFirstName() {
		return firstname;
	}
		public void setFirstName(String firstname) {
			this.firstname = firstname;
	}

	public String getLastName() {
		return lastname;
	}

	public void setLastName(String lastname) {
		this.lastname = lastname;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getUserName() {
		return username;
	}

	public void setUserName(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getConfirmPass() {
		return confirmpass;
	}

	public void setConfirmPass(String confirmPass) {
		this.confirmpass = confirmPass;
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

	@Override
	public String toString() {
		return "RegBean [firstname=" + firstname + ",lastname=" + lastname + ",email=" + email + "\n username=" + username + "\n password=" + password + "\n"
				+ " confirmPass=" + confirmpass + ",phone=" + phone + "\n]";
	}

}

