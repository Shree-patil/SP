/**
 * 
 */
package com.banking.application.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.banking.application.model.BankDetails;

/**
 * 
 */
@Repository
public interface BankRepository extends CrudRepository<BankDetails, Long>{

}
