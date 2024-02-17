package com.loan.loanapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loan.loanapplication.model.LoanDetails;

@Repository

public interface LoanDetailsRepository extends JpaRepository<LoanDetails, Long> {
	
	
	
	
	

}
