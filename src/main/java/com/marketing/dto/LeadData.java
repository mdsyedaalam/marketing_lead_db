package com.marketing.dto;
public class LeadData { //This is an ordinary JAVA Class
	//Create variables matching to .jsp file from attribute names
	private long id;
	private String firstName;
	private String lastName;
	private String email;
	private long mobile;
	//Getters and Setters
	public long getId() { return id; }
	public void setId(long id) { this.id = id; }
	public String getFirstName() { return firstName; }
	public void setFirstName(String firstName) { this.firstName = firstName; }
	public String getLastName() { return lastName; }
	public void setLastName(String lastName) { this.lastName = lastName; }
	public String getEmail() { return email; }
	public void setEmail(String email) { this.email = email; }
	public long getMobile() { return mobile; }
	public void setMobile(long phone) { this.mobile = phone; }
}
