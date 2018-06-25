/**
 * 
 */
package com.springjpa.springjpa.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springjpa.springjpa.entity.CompositeEntity;
import com.springjpa.springjpa.entity.Employee;
import org.springframework.stereotype.Repository;

/**
 * @author daddy
 *
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, CompositeEntity> {

}
