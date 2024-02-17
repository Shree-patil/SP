package com.loan.loanapplication.model;

import java.util.List;

import org.springframework.stereotype.Component;





@Component
public class ApplicantDetails {

	private String firstName;
	private String lastName;
	private String panCard;
	private String bankStmt;
	
    private List<AddressDetails> addressDetails;
    
    
	
	

	public List<AddressDetails> getAddressDetails() {
		return addressDetails;
	}

	public void setAddressDetails(List<AddressDetails> addressDetails) {
		this.addressDetails = addressDetails;
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

	public String getPanCard() {
		return panCard;
	}

	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}

	public String getBankStmt() {
		return bankStmt;
	}

	public void setBankStmt(String bankStmt) {
		this.bankStmt = bankStmt;
	}

}
