package com.loan.loanapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loan.loanapplication.model.ContactDetails;

public interface ContactDetailsRepository extends JpaRepository<ContactDetails,Long> {

}
