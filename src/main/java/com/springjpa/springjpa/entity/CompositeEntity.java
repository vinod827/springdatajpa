/**
 * 
 */
package com.springjpa.springjpa.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.validation.constraints.NotNull;

/**
 * @author daddy
 *
 */
@Embeddable
public class CompositeEntity implements Serializable{

	private static final long serialVersionUID = 1L;

	@NotNull
	@Column(name="COMPANY_ID")
	private String companyId;
	
	@NotNull
	@Column(name="EMPLOYEE_ID")
	private String employeeId;

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public CompositeEntity(String companyId, String employeeId) {
		super();
		this.companyId = companyId;
		this.employeeId = employeeId;
	}

	public CompositeEntity() {
		super();
	}
	
	
}
