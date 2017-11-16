package com.jvpt.foodmart.entity;

public class Branch {
	private int id;
	private String name;
	private String address;
	private String province;
	private String phone;
	private int numOfTable;
	private String description;
	
	public Branch() {
		
	}
	
	public Branch(int id, String name, String address, String province, String phone, int numOfTable,
			String description) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.province = province;
		this.phone = phone;
		this.numOfTable = numOfTable;
		this.description = description;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getNumOfTable() {
		return numOfTable;
	}
	public void setNumOfTable(int numOfTable) {
		this.numOfTable = numOfTable;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
