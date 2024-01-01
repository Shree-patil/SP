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
@Entity(name = "BANK_DETAILS")
public class BankDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "BANK_ID")
	private long bankId;
	@Column(name = "BANK_NAME")
	private String bankName;
	@Column(name = "IFSC_CODE")
	private String ifsc;
	@Column(name = "BRANCH_NAME")
	private String branch;
	/**
	 * @return the bankName
	 */
	public String getBankName() {
		return bankName;
	}
	/**
	 * @param bankName the bankName to set
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	/**
	 * @return the ifsc
	 */
	public String getIfsc() {
		return ifsc;
	}
	/**
	 * @param ifsc the ifsc to set
	 */
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	/**
	 * @return the branch
	 */
	public String getBranch() {
		return branch;
	}
	/**
	 * @param branch the branch to set
	 */
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	
	

}
