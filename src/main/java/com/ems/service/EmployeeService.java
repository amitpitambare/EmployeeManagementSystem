package com.ems.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ems.model.Employee;
import com.ems.repository.EmployeeRepository;

// employee service class
@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	// fetching all employees
	public List<Employee> getAllEmployees(){
		List<Employee> emps = (List<Employee>)employeeRepository.findAll(); 
		return emps;
	}
	
	// fetching employee by id
	public Employee getEmployee(String id){
		Optional<Employee> emp=employeeRepository.findById(id);
		if(emp.isPresent())
			return emp.get();
		else
			emp.orElseGet(null);
		return null;
	}
	
	// inserting employee
	public void addEmployee(Employee e) {
		employeeRepository.save(e);
	}
	
	// updating employee by id
	public void updateEmployee(Employee emp, String id){
		if(id == emp.getEmpId()) {
			employeeRepository.save(emp);
		}
	}
	
	// deleting all employees
	public void deleteAllEmployees(){
		employeeRepository.deleteAll();
	}
	
	// deleting employee by id
	public void deleteEmployeeByID(String id){
		employeeRepository.deleteById(id);
	}
	
	//patching/updating employee by id
	public void patchEmployee(Employee emp, String id) {
		if(id == emp.getEmpId()) {
			employeeRepository.save(emp);
		}
	}
}