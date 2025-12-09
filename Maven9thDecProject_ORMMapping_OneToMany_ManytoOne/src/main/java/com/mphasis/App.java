package com.mphasis;

import com.mphasis.daos.DepartmentDao;
import com.mphasis.daos.EmployeeDao;
import com.mphasis.entities.Department;
import com.mphasis.entities.Employee;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        
    	DepartmentDao deptDao=new DepartmentDao();
    	EmployeeDao empDao=new EmployeeDao();
    	Department dept=new Department("Accounts");
    	Employee e1=new Employee("Priya");
    	Employee e2=new Employee("varun");
    	
    	
    	dept.addEmployee(e1);dept.addEmployee(e2);
    	//deptDao.addDepartment(dept);
    	
    	//deptDao.findAll().forEach(System.out::println);
    	
    	deptDao.delete(102);
    	
    }
}
