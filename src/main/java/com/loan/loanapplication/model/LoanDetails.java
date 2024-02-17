package com.loan.loanapplication.model;

import org.hibernate.annotations.DialectOverride.GeneratedColumn;
import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Component
@Entity (name = "LOAN_DETAILS")
public class LoanDetails {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)

	
	
	private long Id;
	
	@Column(name = "Loan_Application_Id")
	private String loanApplicationId;
	
	@Column(name = "Loan_Type")
	private String loanType;
	
	@Column (name = "Years")
	private int years;
	
	@Column (name = "Sanctioned_Amount")
	private long sanctionedAmount;
	
	@Column (name = "Emi")
	private int emi;

	
	
	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getLoanApplicationId() {
		return loanApplicationId;
	}

	public void setLoanApplicationId(String loanApplicationId) {
		this.loanApplicationId = loanApplicationId;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	public long getSanctionedAmount() {
		return sanctionedAmount;
	}

	public void setSanctionedAmount(long sanctionedAmount) {
		this.sanctionedAmount = sanctionedAmount;
	}

	public int getEmi() {
		return emi;
	}

	public void setEmi(int emi) {
		this.emi = emi;
	}

}
