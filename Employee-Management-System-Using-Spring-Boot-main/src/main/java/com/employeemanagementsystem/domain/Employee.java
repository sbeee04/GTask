package com.employeemanagementsystem.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity // This tells Hibernate to create a table of this class
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//	By @GeneratedValue, JPA makes a unique key automatically and applies the key to the field having @Id
	private long id;
	@NotBlank(message = "Name is mandatory")
	private String EmpName;
	@NotBlank(message = "Gender is mandatory")
	private String EmpGen;
	@Email(message = "Invalid email format")
	@NotBlank(message = "Email is mandatory")
	private String email;

	private String role;

	public Employee() {
	}

	public Employee(String empName, String empGen, String email, String role) {
		EmpName = empName;
		EmpGen = empGen;
		this.email = email;
		this.role = role;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		this.EmpName = empName;
	}

	public String getEmpGen() {
		return EmpGen;
	}

	public void setEmpGen(String empGen) {
		this.EmpGen = empGen;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}
