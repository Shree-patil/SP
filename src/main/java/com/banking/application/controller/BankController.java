/**
 * 
 */
package com.banking.application.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banking.application.model.Address;
import com.banking.application.model.Applicants;
import com.banking.application.model.BankDetails;
import com.banking.application.model.ContactDetails;
import com.banking.application.service.BankDetailsInterface;
import com.banking.application.service.ExcelService;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

/**
 * 
 */
@RestController
@RequestMapping(value = "/bankDetails")
public class BankController {
	@Autowired
	private BankDetailsInterface bankDet;
	@Autowired
	ExcelService excelService;
	
	
	
	@GetMapping(value = "/banks")
	//@RequestMapping(value = "/banks", method = RequestMethod.GET)
	public List<BankDetails> getBanks(){
		System.out.println("we are in GET all banks");
		List<BankDetails> bankDetails = new ArrayList<>();
		bankDetails = bankDet.getBankDetails();
		return bankDetails;
	}
	@GetMapping(value = "/banks/{ifscCode}")
	public BankDetails getBank(@PathVariable String ifscCode){
		BankDetails bankDetails = new BankDetails();
		System.out.println("we are in GET  bank" +ifscCode);
		bankDetails = bankDet.getBankDetails(ifscCode);
		return bankDetails;
	}
	@PostMapping(value = "/banks")
	public String addBank(@RequestBody BankDetails bankDetails) {
		System.out.println("we are in POST add bank : "+bankDetails.getBankName() +"----"+bankDetails.getBranch()+"-----"+bankDetails.getIfsc());
		bankDet.createBank(bankDetails);
		String message = "";
		
		return message;
	}
	@PutMapping(value = "/banks")
	public String updateBank(@RequestBody BankDetails bankDetails) {
		System.out.println("we are in PUT  bank");
		String message = "";
		
		return message;
	}
	@DeleteMapping(value = "/banks/{ifscCode}")
	public BankDetails deleteBank(@PathVariable String ifscCode){
		System.out.println("we are in DELETE  bank"+ifscCode);
		BankDetails bankDetails = new BankDetails();
		
		return bankDetails;
	}
	@PatchMapping(value = "/banks")
	public String updateBankName(@RequestBody BankDetails bankDetails) {
		System.out.println("we are in PATCH  bank");
		String message = "";
		
		return message;
	}
	@GetMapping(value = "/banks/{panCard}/{lastName}")
	public String getInterest(@PathVariable String panCard,@PathVariable String lastName) {
		return bankDet.getInterestRate(panCard, lastName);
	}
	@PostMapping(value = "/banks/loans")
	public String applyLoan(@RequestBody  Applicants applicantDetails) {
		return bankDet.loanApprovalProcess(applicantDetails);
	}
	@GetMapping(value = "/banks/loans/{applicationNumber}")
	public Applicants applicantDetails(@PathVariable String applicationNumber) {
		return bankDet.loanApprovalProcess(applicationNumber);
	}
	@GetMapping(value =  "/contacts")
	public List<ContactDetails> getContacts(){
		 return bankDet.getContacts();
	}
	@PostMapping(value =  "/contacts")
	public void saveContacts(@RequestBody ContactDetails contactDetails){
		bankDet.saveContacts(contactDetails);
	}
	@GetMapping(value =  "/contacts/{contactId}")
	public Optional<ContactDetails> getContacts(@PathVariable long contactId){
		 return bankDet.getContacts(contactId);
	}
	
	
	@GetMapping(value = "/applications")
	public List<Applicants> getApplications(){
		return bankDet.getApplications();
	}
	@GetMapping(value = "/applications/{applicationId}")
	public Optional<Applicants> getApplication(@PathVariable long applicationId){
		return bankDet.getApplications(applicationId);
	}
	@PostMapping(value = "/applications")
	public Applicants addApplications(@RequestBody Applicants applicantDetails){
		return bankDet.saveApplications(applicantDetails);
	}
	@GetMapping(value = "/addresses")
	public List<Address> getAddress(){
		return bankDet.getAddress();
	}
	@GetMapping(value = "/addresses/{addressId}")
	public Optional<Address> getAddress(@PathVariable long addressId){
		return bankDet.getAddress(addressId);
	}
	@GetMapping(value = "/excel")
	public void getexcel() throws IOException,InvalidFormatException{
		System.out.println("we are in Excel reading");
		String path="C:\\Users\\reddy\\work";
		String fileName = "test.xlsx";
		String sheetName ="krm";
		excelService.readExcel(sheetName, fileName, path);
	}

}


/*
 * GETMAPPING get all get particular
 * 
 * POSTMAPPING add PUTMAPPING update PATCHMAPPING update particular
 * DELETEMAPPING delete
 */

//GETMAPPTING--REQUESTMAPPING + METHOD is GET


//CRUD ---Create,Read,Update,Delete
//RESTCONTROLLER = REST + CONTROLLER
