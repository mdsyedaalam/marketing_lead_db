package com.marketing.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "leads") //Annotation should be used when table name needed in DB is different than class name
public class Lead {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //primary & auto increment
	private long id;
	
	@Column(name = "first_name", nullable=false) 
	//Annotation should be used when column name needed in DB is different than method name, it shouldn't have null value
	private String firstName;
	

	@Column(name = "last_name", nullable=false) 
	private String lastName;
	
	@Column(nullable=false, unique=true) //no null value & should be unique, to avoid duplicate data in database
	private String email;
	
	@Column(nullable=false, unique=true) //nullable=false means the data is mandatory
	private long mobile;

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
}
