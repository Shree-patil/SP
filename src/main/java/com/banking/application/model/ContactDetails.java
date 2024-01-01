/**
 * 
 */
package com.banking.application.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * 
 */
@Component
@Entity(name = "CONTACT_DETAILS")
public class ContactDetails {
	@Id
	@GeneratedValue(strategy  = GenerationType.AUTO)
	@Column(name = "CONTACT_ID")
	private long contactId;
	@Column(name = "EMAIL_ID")
	private String emailId;
	@Column(name = "CONTACT_NUMBER")
	private long mobileNo;
	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}
	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	/**
	 * @return the mobileNo
	 */
	public long getMobileNo() {
		return mobileNo;
	}
	/**
	 * @param mobileNo the mobileNo to set
	 */
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	

}
