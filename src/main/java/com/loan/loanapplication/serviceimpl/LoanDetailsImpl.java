package com.loan.loanapplication.serviceimpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.loanapplication.model.AddressDetails;
import com.loan.loanapplication.model.ApplicantDetails;
import com.loan.loanapplication.model.ContactDetails;
import com.loan.loanapplication.model.LoanDetails;
import com.loan.loanapplication.repository.AddressDetailsRepository;
import com.loan.loanapplication.repository.ContactDetailsRepository;
import com.loan.loanapplication.repository.LoanDetailsRepository;
import com.loan.loanapplication.service.LoanDetailsInterface;

@Service
public class LoanDetailsImpl implements LoanDetailsInterface {

	@Autowired
	LoanDetailsRepository loanRepository;
	@Autowired
	AddressDetailsRepository addressDetailsRepository;
	@Autowired
	ContactDetailsRepository contactDetailsRepository;
	

	@Override
	public LoanDetails getLoanDetails(String loanApplicationId) {
		// TODO Auto-generated method stub

		LoanDetails loanDetails = new LoanDetails();

		if (loanApplicationId.equalsIgnoreCase("ACC0012345")) {
			loanDetails.setLoanType("Personal Loan");
			loanDetails.setLoanApplicationId(loanApplicationId.toUpperCase());
			loanDetails.setYears(5);
			loanDetails.setSanctionedAmount(100000);
			loanDetails.setEmi(1000);
		} else if (loanApplicationId.equalsIgnoreCase("BCC0012345")) {
			loanDetails.setLoanType("Home Loan");
			loanDetails.setLoanApplicationId(loanApplicationId.toUpperCase());
			loanDetails.setYears(6);
			loanDetails.setSanctionedAmount(200000);
			loanDetails.setEmi(2000);
		} else if (loanApplicationId.equalsIgnoreCase("CCC0012345")) {
			loanDetails.setLoanType("Gold Loan");
			loanDetails.setLoanApplicationId(loanApplicationId.toUpperCase());
			loanDetails.setYears(7);
			loanDetails.setSanctionedAmount(300000);
			loanDetails.setEmi(3000);
		} else {
			loanDetails.setLoanType("Not Found");
		}

		return null;
	}

	@Override
	public String getInterestRate(String panCard, String lastName) {
		// TODO Auto-generated method stub

		String interestRate = "";
		boolean valid = validatePanCard(panCard, lastName);
		if (valid) {
			int creditScore = getcreditScore(panCard);
			if (creditScore > 800) {
				interestRate = "7.5%";
			} else if (creditScore > 700) {
				interestRate = "8.25%";
			} else if (creditScore > 650) {
				interestRate = "8.5%";
			} else if (creditScore > 600) {
				interestRate = "9.25%";
			} else {
				return "not eligiable";
			}
		} else {
			return "invalid pan card";
		}
		return interestRate;
	}

	private int getcreditScore(String panCard) {
		if (panCard.equalsIgnoreCase("BMSPR2333E")) {
			return 830;
		} else if (panCard.equalsIgnoreCase("AYDPM8804E")) {
			return 750;
		} else if (panCard.equalsIgnoreCase("XRPPS5648E")) {
			return 620;
		} else if (panCard.equalsIgnoreCase("ACCPC8672E")) {
			return 680;
		} else {
			return 400;
		}
	}

	private boolean validatePanCard(String panCard, String lastName) {
		if (panCard.length() != 10) {
			return false;
		} else if (panCard.toUpperCase().charAt(3) != 'P') {
			return false;
		} else if (panCard.toUpperCase().charAt(4) != lastName.toUpperCase().charAt(0)) {
			return false;
		}

		return true;
	}

	@Override
	public String loanApprovalProcess(ApplicantDetails applicantDetails) {
		// TODO Auto-generated method stub

		HashMap<String, String> errors = validate(applicantDetails);
		if (errors.size() > 0) {
			for (Map.Entry<String, String> error : errors.entrySet()) {
				System.out.println("variable name : " + error.getKey() + " error message : " + error.getValue());
			}
		} else {
			boolean validPan = validatePanCard(applicantDetails.getPanCard(), applicantDetails.getLastName());
			if (validPan) {
				int creditScore = getcreditScore(applicantDetails.getPanCard());
				if (creditScore < 0 || creditScore > 900) {
					System.out.println("in valid credit score");
				} else if (creditScore > 800) {
					return "7.5%";
				} else if (creditScore > 700) {
					return "8.25%";
				} else if (creditScore > 650) {
					return "8.5%";
				} else if (creditScore > 600) {
					return "9.25%";
				} else {
					return "not eligiable";
				}
			} else {
				System.out.println("in valid pancard");
			}
		}
		return null;
	}

	private HashMap<String, String> validate(ApplicantDetails applicantDetails) {
		// TODO Auto-generated method stub
		HashMap<String, String> validateMessages = new HashMap<>();
		if (applicantDetails.getFirstName().length() < 3) {
			validateMessages.put("firstName", "first name length is not matching");
		}
		if (applicantDetails.getLastName().length() < 3) {
			validateMessages.put("lastName", "last name length is not matching");
		}
		if (!validatePanCard(applicantDetails.getPanCard(), applicantDetails.getLastName())) {
			validateMessages.put("pancard", "in valid pancard");
		}
		ArrayList<String> addressType = new ArrayList<>();
		addressType.add("present address".toLowerCase());

		addressType.add("permenent address".toLowerCase());

		for (AddressDetails addressDetails : applicantDetails.getAddressDetails()) {
			if (!addressType.contains(addressDetails.getAddressType().toLowerCase())) {
				validateMessages.put(addressDetails.getAddressType(), "in valid addressType");
			}
			if (addressDetails.getDoorNumber().length() <= 1) {
				validateMessages.put(addressDetails.getAddressType().concat(" doorNo"),
						addressDetails.getAddressType().concat(" in valid doorNo"));
			}
		}

		return validateMessages;

	}

	@Override
	public ApplicantDetails loanApprovalProcess(String loanApplicationNumber) {
		// TODO Auto-generated method stub
		ApplicantDetails applicantDetails = new ApplicantDetails();
		applicantDetails.setFirstName("Ashwin");
		applicantDetails.setLastName("Patil");
		applicantDetails.setBankStmt("provided");
		applicantDetails.setPanCard("BMSPR2333E");

		AddressDetails presentAddress = new AddressDetails();
		presentAddress.setAddressType("presentAddress");
		presentAddress.setStreetName("Gumpa");
		presentAddress.setDoorNumber("10");
		presentAddress.setDistrict("Bidar");
		presentAddress.setTaluka("Bidar");
		presentAddress.setPincode(585403);
		presentAddress.setState("Karnataka");
		presentAddress.setCountry("India");

		AddressDetails permnentAddress = new AddressDetails();
		permnentAddress.setAddressType("permnentAddress");
		permnentAddress.setStreetName("Kailas nagar");
		permnentAddress.setDoorNumber("20");
		permnentAddress.setDistrict("Bidar");
		permnentAddress.setTaluka("Bidar");
		permnentAddress.setPincode(585402);
		permnentAddress.setState("Karnataka");
		permnentAddress.setCountry("India");
		
		ArrayList<AddressDetails> addresses = new ArrayList<>();
		addresses.add(presentAddress);
		addresses.add(permnentAddress);
		applicantDetails.setAddressDetails(addresses);
		
		
		  ContactDetails contactDetails = new ContactDetails();
		  contactDetails.setEmailId("asdf@Gmail.com");
		  contactDetails.setMobileNumber(8904431068l);
		  contactDetails.setLandNumber(802350050l);
		 

		return applicantDetails;

	}

	@Override
	public void creatLoan(LoanDetails loanDetails) {
		// TODO Auto-generated method stub
		loanRepository.save(loanDetails);
	}

	@Override
	public List<LoanDetails> getloanDetails() {
		// TODO Auto-generated method stub
		return loanRepository.findAll();
	}

	

	@Override
	public List<AddressDetails> getAddressDetails() {
		// TODO Auto-generated method stub
		return addressDetailsRepository.findAll();
	}

	@Override
	public Optional<AddressDetails> getAddressDetials(long addressId) {
		// TODO Auto-generated method stub
		return addressDetailsRepository.findById(addressId);
	}

	@Override
	public void creatAddress(AddressDetails addressDetails) {
		// TODO Auto-generated method stub
		addressDetailsRepository.save(addressDetails);
		
	}

	@Override
	public List<ContactDetails> getContactDetails() {
		// TODO Auto-generated method stub
		return contactDetailsRepository.findAll();
		
	}

	@Override
	public void creatContactDetails(ContactDetails contactDetails) {
		// TODO Auto-generated method stub
		contactDetailsRepository.save(contactDetails);
		
	}

	@Override
	public Optional<ContactDetails> getContactDetials(long contactId) {
		// TODO Auto-generated method stub
		return contactDetailsRepository.findById(contactId);
	}

	

	}
