/**
 * 
 */
package com.banking.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banking.application.model.ContactDetails;
import com.banking.application.service.BankDetailsInterface;

/**
 * 
 */
@RestController
@RequestMapping(name = "/bankDet")
public class ContactController {
	@Autowired
	private BankDetailsInterface bankDet;
	
	@GetMapping(value =  "/contacts")
	public List<ContactDetails> getContacts(){
		 return bankDet.getContacts();
	}
	@PostMapping(value =  "/contacts")
	public void saveContacts(@RequestBody ContactDetails contactDetails){
		bankDet.saveContacts(contactDetails);
	}

}
