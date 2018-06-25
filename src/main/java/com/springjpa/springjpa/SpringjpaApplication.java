package com.springjpa.springjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.springjpa.springjpa.entity.Company;
import com.springjpa.springjpa.jpa.CompanyRepository;

@SpringBootApplication
@EnableJpaRepositories
public class SpringjpaApplication implements CommandLineRunner{
	
	@Autowired
	private CompanyRepository companyRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringjpaApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception{
		
		companyRepository.deleteAllInBatch(); //clean up
		
		Company company = new Company();
		company.setCompanyId("1001");
		company.setCity("New Delhi");
		companyRepository.save(company);
		
	}
}
