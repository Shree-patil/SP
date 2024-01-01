/**
 * 
 */
package com.banking.application.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

/**
 * 
 */
@Component
@Entity(name = "APPLICATION_DETAILS")
public class Applicants {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "applicants_id")
	private Long id;
	private String firstName;
	private String lastName;
	private String panCard;
	private String bankStmt;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "applicants")
    private Set<Address> addresses = new HashSet<>();
	public Applicants() {
		
	}
	public Applicants(Long id,String firstName,String lastName,String panCard,String bankStmt,Set<Address> addresses) {
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.panCard=panCard;
		this.bankStmt=bankStmt;
		this.addresses= addresses;
		
	}
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the panCard
	 */
	public String getPanCard() {
		return panCard;
	}
	/**
	 * @param panCard the panCard to set
	 */
	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}
	/**
	 * @return the bankStmt
	 */
	public String getBankStmt() {
		return bankStmt;
	}
	/**
	 * @param bankStmt the bankStmt to set
	 */
	public void setBankStmt(String bankStmt) {
		this.bankStmt = bankStmt;
	}
	/**
	 * @return the addresses
	 */
	public Set<Address> getAddresses() {
		return addresses;
	}
	/**
	 * @param addresses the addresses to set
	 */
	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}


}
