/**
 * 
 */
package com.springjpa.springjpa.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * @author daddy
 *
 */
@Entity
@Table(name = "EMPLOYEE")
public class Employee {
	
	@EmbeddedId
	private CompositeEntity compositeEntity;
	
	@NotNull
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@NotNull
	@Column(name="LAST_NAME")
	private String lastName;

	public CompositeEntity getCompositeEntity() {
		return compositeEntity;
	}

	public void setCompositeEntity(CompositeEntity compositeEntity) {
		this.compositeEntity = compositeEntity;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Employee(CompositeEntity compositeEntity, @NotNull String firstName, @NotNull String lastName) {
		super();
		this.compositeEntity = compositeEntity;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Employee() {
		super();
	}
	
	
	
	

}
