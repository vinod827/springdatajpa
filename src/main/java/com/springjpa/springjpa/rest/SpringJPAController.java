/**
 * 
 */
package com.springjpa.springjpa.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springjpa.springjpa.jpa.CompanyRepository;

/**
 * @author daddy
 *
 */
@RestController
public class SpringJPAController {

	@Autowired
	CompanyRepository companyRepository;
	
	
	@GetMapping("/")
	private String defaultRoute() {
		return "Welcome to JPA";
	}
	
	
	
}
