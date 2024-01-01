/**
 * 
 */
package com.banking.application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.banking.application.model.Address;
import com.banking.application.model.Applicants;
import com.banking.application.model.BankDetails;
import com.banking.application.model.ContactDetails;

/**
 * 
 */
@Component
public interface BankDetailsInterface {
	public void display();
	public BankDetails getBankDetails( String ifscCode);
	public String getInterestRate(String panCard,String lastName);
	public String loanApprovalProcess(Applicants applicantDetails);
	public Applicants loanApprovalProcess(String applicationNumber);
	public void createBank(BankDetails bankDetails);
	public List<BankDetails> getBankDetails();
	public List<ContactDetails> getContacts();
	public void saveContacts(ContactDetails contactDetails);
	public Optional<ContactDetails> getContacts(long contactId);
	public List<Applicants> getApplications();
	public Optional<Applicants> getApplications(long applicationId);
	public Applicants saveApplications(Applicants applicantDetails);
	public List<Address> getAddress();
	public Optional<Address> getAddress(long addressId);
	

}
