package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Deparment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int dId;
	private String dName;
	private String dEmail;
	private String contactNo;
	private String facultyList;
	private String profit;
	private String password;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public String getdEmail() {
		return dEmail;
	}
	public void setdEmail(String dEmail) {
		this.dEmail = dEmail;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getFacultyList() {
		return facultyList;
	}
	public void setFacultyList(String facultyList) {
		this.facultyList = facultyList;
	}
	public String getProfit() {
		return profit;
	}
	public void setProfit(String profit) {
		this.profit = profit;
	}

}
