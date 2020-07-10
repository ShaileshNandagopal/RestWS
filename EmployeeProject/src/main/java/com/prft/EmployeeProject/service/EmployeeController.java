package com.prft.EmployeeProject.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import com.prft.EmployeeProject.model.Employee;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	
	List<Employee> employeeList = new ArrayList<Employee>();
	
	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public List<Employee> addEmployee(@RequestBody Employee emp){
	   employeeList.add(new Employee(emp.getEmployeeID(), emp.getEmployeeName() ,
			   emp.getEmployeeDesignation() , emp.getEmployeeAddress()));
	   return employeeList;
	}
   
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public List<Employee> getEmployees(){
		return employeeList;
	}
	
	@RequestMapping(value = "/employee/{Id}", method = RequestMethod.GET)
	public Employee getEmployeeByID(@PathVariable("Id") Integer Id){
		for(Employee emp: employeeList) {
			if(Id.equals(emp.getEmployeeID())) {
				return emp;
			}
		}	
	return null;	
	}
	
	@RequestMapping(value = "/employee/xml/{Id}", produces = {"application/xml"})
	public Employee getEmployeeByIDXM(@PathVariable("Id") Integer Id){
		String uri = "http://localhost:8002/emp/employee/"+Id;
		RestTemplate restTemplate = new RestTemplate();
		Employee emp  = restTemplate.getForObject(uri, Employee.class);
	return emp;	
	}
}
