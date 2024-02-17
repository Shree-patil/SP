package com.loan.loanapplication.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Component
@Entity(name = "ADDRESS_DETAILS")
public class AddressDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private long Id;
	
	@Column(name = "ADDRESS_TYPE")
	private String addressType;

	@Column(name="STREET_NAME")
	private String streetName;
	@Column(name = "DOOR_NUMBER")
	private String doorNumber;

	@Column(name = "POST")
	private String post;

	@Column(name = "TALUKA")
	private String taluka;

	@Column(name = "DISTRICT")
	private String district;

	@Column(name = "STATE")
	private String state;

	@Column(name = "COUNTRY")
	private String country;

	@Column(name = "PIN_CODE")
	private int pincode;
	
	

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getStreetName() {
		return streetName;

	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getDoorNumber() {
		return doorNumber;
	}

	public void setDoorNumber(String doorNumber) {
		this.doorNumber = doorNumber;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getTaluka() {
		return taluka;
	}

	public void setTaluka(String taluka) {
		this.taluka = taluka;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

}
