package com.mphasis.Maven24thProject;

import java.util.Arrays;

/**
 * Hello world!
 */
interface MyComarator{
	//public int salComparator(Employee emp1,Employee emp2);
	
	public int NameComparator(Employee e1,Employee e2);
}




public class App {
    public static void main(String[] args) {
    	
    	Employee emp1=new Employee(123,"swapna",70000);
    	Employee emp2=new Employee(121,"swathi",60000);
    	Employee emp3=new Employee(127,"swetha",90000);
    	Employee emp4=new Employee(122,"swarna",30000);
    	Employee emp5=new Employee(129,"smith",50000);
    	
    	Employee[] empArr= {emp1,emp2,emp3,emp4,emp5};
    	
//    	
//    	MyComarator comparator=(e1,e2)->Double.compare(e1.getSalary(), e2.getSalary());
//    	
//    	Arrays.sort(empArr,(e3,e4)->comparator.salComparator(e3, e4));
    	
    	Arrays.sort(empArr,(e1,e2)->e1.getEmpName().compareTo(e2.getEmpName()));
    	for(Employee employee:empArr)
    		System.out.println(employee);
        
    }
}
