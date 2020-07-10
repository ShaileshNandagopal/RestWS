package com.prft.EmployeeProject.model;

public class Employee {

	private Integer employeeID;
	private String employeeName;
	private String employeeDesignation;
	private String employeeAddress;
	
	public Employee() {
		
	}
	public Employee(Integer i, String name, String designation, String address) {
		employeeID = i;
		employeeName = name;
		employeeDesignation = designation;
		employeeAddress = address;
	}
	public Integer getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeDesignation() {
		return employeeDesignation;
	}
	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
}
