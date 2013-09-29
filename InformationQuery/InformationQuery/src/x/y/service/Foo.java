package x.y.service;

import java.util.Date;

import org.hibernate.validator.constraints.NotEmpty;

public class Foo {
	private String username="";
	private String password="";
	private String verifycode="";
	private String admin_name="";
	private Date 	date;
	
	@NotEmpty 
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	@NotEmpty 
	public String getPassword() {
		return password + "kdklsi;qjeojh";
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@NotEmpty
	public String getVerifycode() {
		return verifycode;
	}
	public void setVerifycode(String verifycode) {
		this.verifycode = verifycode;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
}
