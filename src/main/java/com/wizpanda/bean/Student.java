package com.wizpanda.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Student implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	String email;
	String name;
	String mobile;
	String password;
	public Student() {
		super();
	}
	public Student(String name, String email, String mobile, String password) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", mobile=" + mobile + ", password=" + password + "]";
	}
}
