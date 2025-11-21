package com.mphasis;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	
    	Employee emp=new Employee();
    	System.out.println(emp);
    	emp.setEmpId(123);
    	emp.setEmpName("swapna");
    	emp.setDesg("trainer");
    	emp.setMobileNum("6281614948");
    	System.out.println(emp);
    	
    	Employee e1=new Employee("amit",678, "Manager", "9090909090");
    	System.out.println(e1);
    	
        
    }
}
