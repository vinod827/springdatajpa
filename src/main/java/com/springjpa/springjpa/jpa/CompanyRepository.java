/**
 * 
 */
package com.springjpa.springjpa.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.springjpa.springjpa.entity.Company;

/**
 * @author daddy
 *
 */
public interface CompanyRepository extends JpaRepository<Company, String>{

}
