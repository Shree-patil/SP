package com.loan.loanapplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.loan.loanapplication.model.AddressDetails;
import com.loan.loanapplication.model.ApplicantDetails;
import com.loan.loanapplication.model.ContactDetails;
import com.loan.loanapplication.model.LoanDetails;

@Component
public interface LoanDetailsInterface {

	public LoanDetails getLoanDetails(String loanApplicationId);

	public String getInterestRate(String panCard, String lastName);

	public String loanApprovalProcess(ApplicantDetails applicantDetails);

	public ApplicantDetails loanApprovalProcess(String loanApplicationNumber);

    public void creatLoan(LoanDetails loanDetails);
    
    public List<LoanDetails> getloanDetails();
    
    public Optional<AddressDetails> getAddressDetials(long addressId);
    
    public List<AddressDetails> getAddressDetails();
    
    public void creatAddress(AddressDetails addressDetails );
    
    public void creatContactDetails( ContactDetails contactDetails);
    
    public List<ContactDetails> getContactDetails();

	
	
	 public Optional<ContactDetails> getContactDetials(long contactId);
	    
    
    

	

	

	
	
	

}
