package com.employeemanagementsystem.service;

import java.util.List;

import com.employeemanagementsystem.domain.Employee;
import com.employeemanagementsystem.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeemanagementsystem.repository.EmployeeRepository;

@Service // This means that this class is a service
public class EmployeeService {
	@Autowired
	// This means to get the bean which is auto-generated by Spring
	// We will use it to handle the data
	private EmployeeRepository employeeRepository;

	//	get all employees
	public List<Employee> getAllEmployees() {

		//		find all employees data, then return it
		return employeeRepository.findAll();
	}

	// save an employee
	public void saveEmployee(Employee emp) {
		//		save employee data to database
		employeeRepository.save(emp);
	}

	//	get employee by id
	public Employee getEmployeeById(Long id) {
		//		find an employee by id
		Employee emp = employeeRepository.getById(id);

		//		if there is not an employee who has the id, throw the error.
		if (emp == null) {
			throw new ResourceNotFoundException("Employee", "Id", id);
		}
		return emp;

	}

	//	delete employee by id
	public String deleteEmployeeById(Long id) {
		//		find an employee by id
		Employee emp = employeeRepository.getById(id);

		//		if there is not an employee who has the id, throw the error.
		if (emp == null) {
			throw new RuntimeException("Employee not found");
		}

		//		delete an employee who has the id from the database
		employeeRepository.deleteById(id);
		return "Deleted: " + emp.getEmpName();
	}
}
