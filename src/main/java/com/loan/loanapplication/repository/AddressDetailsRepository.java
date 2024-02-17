package com.loan.loanapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loan.loanapplication.model.AddressDetails;

@Repository

public interface AddressDetailsRepository extends JpaRepository<AddressDetails, Long> {
	
	

}
