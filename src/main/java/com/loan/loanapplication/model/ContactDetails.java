package com.loan.loanapplication.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Component
@Entity(name = "CONTACT_DETAILS")
public class ContactDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    
	
	private long Id;
	
	@Column(name= "EMAIL_ID")
	private String emailId;
	
	@Column(name ="MOBILE_NUMBER")
	private long mobileNumber;
	
	@Column(name ="land_NUMBER")
	private long landNumber;
	
	
	 
	public long getLandNumber() {
		return landNumber;
	}
	public void setLandNumber(long landNumber) {
		this.landNumber = landNumber;
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	

}
