/**
 * 
 */
package com.springjpa.springjpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * @author daddy
 *
 */
@Entity
@Table(name="COMPANY")
public class Company {

	@Id
	@Column(name="COMPANY_ID")
	private String companyId;
	
	//private Employee employee;
	
	@NotNull
	@Column(name="CITY")
	private String city;

	public Company(String companyId, @NotNull String city) {
		super();
		this.companyId = companyId;
		this.city = city;
	}

	public Company() {
		super();
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}


	
	
	
}
