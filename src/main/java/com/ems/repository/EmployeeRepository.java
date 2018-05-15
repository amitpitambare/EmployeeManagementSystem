package com.ems.repository;

import org.springframework.data.repository.CrudRepository;

import com.ems.model.Employee;

// interface extending crud repository
public interface EmployeeRepository extends CrudRepository<Employee, String>{
	
}
