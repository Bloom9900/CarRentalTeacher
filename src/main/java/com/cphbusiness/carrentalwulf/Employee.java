package com.cphbusiness.carrentalwulf;
import Util.IdFactory;

public class Employee {
	String name;
	String email;
	Address add;
	String empId;

	public Employee(String name) {
		this.name = name;
		this.add = null;
		this.email = null;
		empId = IdFactory.getEmpId();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}


	
}
