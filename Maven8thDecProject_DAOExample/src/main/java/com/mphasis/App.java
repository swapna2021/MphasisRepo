package com.mphasis;

import com.mphasis.dao.EmployeeDao;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	
    	EmployeeDao dao=new EmployeeDao();
    	
//    	dao.addEmployee();
//    	dao.findAll().forEach(System.out::println);
    	//System.out.println(dao.findById(2));
//    	System.out.println("---------Find by dept-------------");
//    	dao.findByDept("Training").forEach(System.out::println);
    	
//    	dao.findByFilters("Accounts", null, 0.0).forEach(System.out::println);
//    	dao.findByFilters(null, null, 70000.0).forEach(System.out::println);
    	
    	dao.findByDeptAndDesg("Sales", "Manager").forEach(System.out::println);
        
    }
}
