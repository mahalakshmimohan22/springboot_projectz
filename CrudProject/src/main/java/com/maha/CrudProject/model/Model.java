package com.maha.CrudProject.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customer")
public class Model {
	@Id
	private int id;
	private String name;
	private int age;
	private String phoneNo;
	private String mailId;
	public Model() {
		super();
	}

	public Model(int id, String name, int age, String phoneNo, String mailId) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.phoneNo = phoneNo;
		this.mailId = mailId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

}
