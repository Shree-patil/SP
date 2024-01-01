/**
 * 
 */
package com.banking.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banking.application.model.Address;

/**
 * 
 */
@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{

}
