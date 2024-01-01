/**
 * 
 */
package com.banking.application.serviceimpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.application.model.Address;
import com.banking.application.model.Applicants;
import com.banking.application.model.BankDetails;
import com.banking.application.model.ContactDetails;
import com.banking.application.repository.AddressRepository;
import com.banking.application.repository.ApplicantDetailsRepository;
import com.banking.application.repository.BankRepository;
import com.banking.application.repository.ContactRepository;
import com.banking.application.service.BankDetailsInterface;

/**
 * 
 */
@Service
public class BankDetailsImpl implements BankDetailsInterface{
	@Autowired
	BankRepository bankRepository;
	@Autowired
	ContactRepository contactRepository;
	@Autowired
	ApplicantDetailsRepository applicantDetailsRepository;
	@Autowired
	AddressRepository addressRepository;

	@Override
	public void display() {
		System.out.println("we are in display");
		
	}

	@Override
	public BankDetails getBankDetails(String ifscCode) {
		// TODO Auto-generated method stub
		BankDetails bankDetails = new BankDetails();
		if(ifscCode.equalsIgnoreCase("icic0000076")) {
			bankDetails.setBankName("ICICI BANK");
			bankDetails.setIfsc(ifscCode.toUpperCase());
			bankDetails.setBranch("BANGALORE");
		}
		else if(ifscCode.equalsIgnoreCase("icic0000026")) {
			bankDetails.setBankName("ICICI BANK");
			bankDetails.setIfsc(ifscCode.toUpperCase());
			bankDetails.setBranch("NELLORE");
		}
		else if(ifscCode.equalsIgnoreCase("citi0000001")) {
			bankDetails.setBankName("CITI BANK");
			bankDetails.setIfsc(ifscCode.toUpperCase());
			bankDetails.setBranch("MUMBAI");
		}
		else if(ifscCode.equalsIgnoreCase("citi0000006")) {
			bankDetails.setBankName("CITI BANK");
			bankDetails.setIfsc(ifscCode.toUpperCase());
			bankDetails.setBranch("BANGALORE");
		}else {
			bankDetails.setBankName("NOT FOUND");
			bankDetails.setIfsc(ifscCode.toUpperCase());
			bankDetails.setBranch("NOT FOUND");
		}
		return bankDetails;
	}

	@Override
	public String getInterestRate(String panCard,String lastName) {
		// TODO Auto-generated method stub
		String interestRate = "";
		boolean  valid = validatePanCard(panCard,lastName);
		if(valid) {
			int creditScore = getcreditScore(panCard);
			if(creditScore>800) {
				interestRate = "7.5%";
			}else if(creditScore>700) {
				interestRate = "8.25%";
			}else if(creditScore>650) {
				interestRate = "8.5%";
			}else if(creditScore>600) {
				interestRate = "9.25%";
			}else {
				return "not eligiable";
			}
		}else {
			return "invalid pan card";
		}
		return interestRate;
	}

	private int getcreditScore(String panCard) {
		if(panCard.equalsIgnoreCase("BMSPR2333E")) {
			return 830;
		}
		else if(panCard.equalsIgnoreCase("AYDPM8804E")) {
			return 750;
		}
		else if(panCard.equalsIgnoreCase("XRPPS5648E")) {
			return 620;
		}
		else if(panCard.equalsIgnoreCase("ACCPC8672E")) {
			return 680;
		}else {
			return 400;
		}
	}

	private boolean validatePanCard(String panCard,String lastName) {
		if(panCard.length()!=10) {
			return false;
		}
		else if(panCard.toUpperCase().charAt(3)!='P') {
			return false;
		}
		else if(panCard.toUpperCase().charAt(4)!= lastName.toUpperCase().charAt(0)) {
			return false;
		}
		
		return true;
	}

	@Override
	public String loanApprovalProcess(Applicants applicantDetails) {
		HashMap<String,String> errors = validate(applicantDetails);
		if(errors.size()>0) {
			for(Map.Entry<String, String> error : errors.entrySet()) {
				System.out.println("variable name : " + error.getKey()+" error message : " + error.getValue());
			}
		}
		else {
			boolean validPan = validatePanCard(applicantDetails.getPanCard(),applicantDetails.getLastName());
			if(validPan) {
				int creditScore = getcreditScore(applicantDetails.getPanCard());
				if(creditScore< 0 || creditScore>900) {
					System.out.println("in valid credit score");
				}
				else if(creditScore>800) {
					return "7.5%";
				}else if(creditScore>700) {
					return "8.25%";
				}else if(creditScore>650) {
					return "8.5%";
				}else if(creditScore>600) {
					return "9.25%";
				}else {
					return "not eligiable";
				}
			}
			else {
				System.out.println("in valid pancard");
			}
		}
		return null;
	}

	private HashMap<String, String> validate(Applicants applicantDetails) {
		// TODO Auto-generated method stub
		HashMap<String, String> validateMessages = new HashMap<>();
		if(applicantDetails.getFirstName().length()<3) {
			validateMessages.put("firstName", "first name length is not matching");
		}
		if(applicantDetails.getLastName().length()<3) {
			validateMessages.put("lastName", "last name length is not matching");
		}
		if(!validatePanCard(applicantDetails.getPanCard(), applicantDetails.getLastName())) {
			validateMessages.put("pancard", "in valid pancard");
		}
		ArrayList<String> addressType = new ArrayList();
		addressType.add("present address".toLowerCase());
		addressType.add("office address".toLowerCase());
		addressType.add("permenent address".toLowerCase());
		/*
		 * for(Address address : applicantDetails.getAddress()) {
		 * if(!addressType.contains(address.getAddressType().toLowerCase())) {
		 * validateMessages.put(address.getAddressType(), "in valid addressType"); }
		 * if(address.getDoorNo().length()<=1) {
		 * validateMessages.put(address.getAddressType().concat(" doorNo"),
		 * address.getAddressType().concat(" in valid doorNo") ); } }
		 */
		return validateMessages;
	}

	@Override
	public Applicants loanApprovalProcess(String applicationNumber) {
		// TODO Auto-generated method stub
		Applicants applicantDetails = new Applicants();
		applicantDetails.setFirstName("Kiran");
		applicantDetails.setLastName("reddy");
		applicantDetails.setBankStmt("provided");
		applicantDetails.setPanCard("BMSPR2333E");
		Address address = new Address();
		address.setAddressType("present address");
		address.setDoorNo("1-99");
		address.setFlatNo("506");
		address.setStreet("6th cross");
		address.setArea("whitefield");
		address.setPost("white field");
		address.setDistrict("bangalore");
		address.setState("karnataka");
		address.setCountry("india");
		address.setPinCode(560076);
		Address add = new Address();
		add.setAddressType("permenent address");
		add.setDoorNo("1-99");
		add.setFlatNo("506");
		add.setStreet("6th cross");
		add.setArea("whitefield");
		add.setPost("white field");
		add.setDistrict("bangalore");
		add.setState("karnataka");
		add.setCountry("india");
		add.setPinCode(560076);
		ArrayList<Address> addresses = new ArrayList<>();
		addresses.add(address);
		addresses.add(add);
	//	applicantDetails.setAddress(addresses);
		ContactDetails contact = new ContactDetails();
		contact.setMobileNo(9997778468l);
		contact.setEmailId("reddy6373@hotmail.com");
		ArrayList<ContactDetails> contactDetailsList = new ArrayList<>();
		contactDetailsList.add(contact);
	//	applicantDetails.setContacts(contactDetailsList);
		return applicantDetails;
	}

	@Override
	public void createBank(BankDetails bankDetails) {
		// TODO Auto-generated method stub
		bankRepository.save(bankDetails);
	}

	@Override
	public List<BankDetails> getBankDetails() {
		// TODO Auto-generated method stub
		return (List<BankDetails>) bankRepository.findAll();
		
	}

	@Override
	public List<ContactDetails> getContacts() {
		// TODO Auto-generated method stub
		return contactRepository.findAll();
	}

	@Override
	public void saveContacts(ContactDetails contactDetails) {
		// TODO Auto-generated method stub
		contactRepository.save(contactDetails);
	}

	@Override
	public Optional<ContactDetails> getContacts(long contactId) {
		// TODO Auto-generated method stub
		return contactRepository.findById(contactId);
	}

	@Override
	public List<Applicants> getApplications() {
		// TODO Auto-generated method stub
		return applicantDetailsRepository.findAll();
	}

	@Override
	public Optional<Applicants> getApplications(long applicationId) {
		// TODO Auto-generated method stub
		return applicantDetailsRepository.findById(applicationId);
	}

	@Override
	public Applicants saveApplications(Applicants applicantDetails) {
		// TODO Auto-generated method stub
		 applicantDetailsRepository.save(applicantDetails);
		 return null;
	}

	@Override
	public List<Address> getAddress() {
		// TODO Auto-generated method stub
		return addressRepository.findAll();
	}

	@Override
	public Optional<Address> getAddress(long addressId) {
		// TODO Auto-generated method stub
		return addressRepository.findById(addressId);
	}

}
