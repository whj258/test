package com.jds.service;

import java.util.List;

import com.jds.dto.Employee;

/**
* @author whj
* @date 2020-9-3 16:57:52
* @Description   
*/
public interface EmployeeService {
public List<Employee> listall();
	
	
	public  int addemp(Employee emp);
	
	public int deleteemp(int id);
	
	
	public Employee findbyemp(int  id);
	
	
	public int updateemp(Employee emp);
}
