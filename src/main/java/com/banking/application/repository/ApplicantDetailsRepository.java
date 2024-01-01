/**
 * 
 */
package com.banking.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banking.application.model.Applicants;

/**
 * 
 */
public interface ApplicantDetailsRepository extends JpaRepository<Applicants, Long>{

}
