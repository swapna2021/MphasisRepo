package com.mphasis.dao;

import java.util.List;

import com.mphasis.model.Employee;

public interface EmployeeDaoInterface {
	
	
	public List<Employee> findAll();
	public Employee findById(int i);
	public void addEmployee();
	public Employee updateEmployee(Employee employee,int id);
	public void deleteEmployee(int id);
	public List<Employee> findByDept(String dept);
	public List<Employee> findByDeptAndDesg(String dept,String desg);
	public List<Employee> findByFilters(String dept,String desg,Double salary);
	
	

}
