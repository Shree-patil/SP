/**
 * 
 */
package com.banking.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banking.application.model.ContactDetails;

/**
 * 
 */
@Repository
public interface ContactRepository extends JpaRepository<ContactDetails, Long>{

}
