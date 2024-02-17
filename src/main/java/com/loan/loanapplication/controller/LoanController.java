package com.loan.loanapplication.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loan.loanapplication.model.AddressDetails;
import com.loan.loanapplication.model.ApplicantDetails;
import com.loan.loanapplication.model.ContactDetails;
import com.loan.loanapplication.model.LoanDetails;
import com.loan.loanapplication.service.LoanDetailsInterface;

@RestController
@RequestMapping(value = "/loanDepartment")
public class LoanController {

	@Autowired
	LoanDetailsInterface loanInfo;

	@GetMapping(value = "/loans")
	ArrayList<LoanDetails> getLoan() {
		System.out.println("We are in loans");
		ArrayList<LoanDetails> loanDetails = new ArrayList<>();
		return loanDetails;
	}

	@GetMapping(value = "/loans/{loanApplicationId}")

	public LoanDetails getLoan(@PathVariable String loanApplicationId) {
		LoanDetails loanDetails = new LoanDetails();
		System.out.println("We arew in loanApplicationId " + loanApplicationId);
		return loanDetails;
	}

	@PostMapping(value = "/loans")

	public String addloan(@RequestBody LoanDetails loanDetails) {
		System.out.println("We are in post loan" + loanDetails.getLoanApplicationId() + "---"
				+ loanDetails.getLoanType() + "---" + loanDetails.getSanctionedAmount() + "---" + loanDetails.getYears()
				+ "---" + loanDetails.getEmi());
		loanInfo.creatLoan(loanDetails);
		String message = "";
		return message;

	}

	@GetMapping(value = "/loans/loanTypes/{loanApplicationNumber}")
	public ApplicantDetails applicantDetails(@PathVariable String loanApplicationNumber) {
		return loanInfo.loanApprovalProcess(loanApplicationNumber);
	}

	@PostMapping(value = "/loans/loanType")

	public String applyLoan(@RequestBody ApplicantDetails applicantDetails) {
		return loanInfo.loanApprovalProcess(applicantDetails);
	}

	@GetMapping(value = "/addresses")
	public List<AddressDetails> getAddressDetails() {
		return loanInfo.getAddressDetails();
	}

	@GetMapping(value = "/addresses/{addressId}")
	public Optional<AddressDetails> getAddess(@PathVariable long addressId) {
		return loanInfo.getAddressDetials(addressId);
	}

	@PostMapping(value = "/addresses")
	public String addAddressDetails (@RequestBody AddressDetails addressDetails) {
		System.out.println("we are in post address"+addressDetails.getAddressType()+"=="+addressDetails.getCountry()+"=="+addressDetails.getState()+"=="+addressDetails.getDistrict()+"=="+
	addressDetails.getTaluka()+"=="+addressDetails.getPincode()+"=="+addressDetails.getPost()+"=="+addressDetails.getDoorNumber()+"=="+addressDetails.getStreetName()+"=="+addressDetails.getId());
		loanInfo.creatAddress(addressDetails);
		String message ="";
		return message;
		
		}
	
	@GetMapping(value = "/contacts")
	public List<ContactDetails> getContactDetails(){
		return loanInfo.getContactDetails();
		
		
	}

	@GetMapping(value = "/contacts/{contactId}")
	public Optional<ContactDetails>  getContactDetails(@PathVariable long contactId){
		return loanInfo.getContactDetials(contactId);
	}
	
	@PostMapping(value = "/contacts")
	public String addContactDetails(@RequestBody ContactDetails contactDetails) {
		System.out.println("we are in post contact details"+contactDetails.getEmailId()+"=="+contactDetails.getId()+"=="+contactDetails.getMobileNumber()+"=="+contactDetails.getLandNumber());
		loanInfo.creatContactDetails(contactDetails);
		String message ="";
		return message;
	}
	
	
	
}
