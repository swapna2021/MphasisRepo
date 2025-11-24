package com.mphasis.Maven24thProject;

import java.util.function.Predicate;

public class DemoOnPredicate {

	public static void main(String[] args) {
		Predicate<Integer> isEven=(n)->n%2==0;
		System.out.println(isEven.test(56));
		
		if(isEven.test(35))
			System.out.println("even");
		else
			System.out.println("odd");
		System.out.println(isEven.test(78)?"even":"odd");
		
		
		Predicate<String> checkLength=(str)->str.length()>7;
		System.out.println(checkLength.test("swapna"));
		
		
		Employee emp1=new Employee(123,"swapna",70000);
    	Employee emp2=new Employee(121,"swathi",60000);
    	Employee emp3=new Employee(127,"swetha",90000);
    	Employee emp4=new Employee(122,"swarna",30000);
    	Employee emp5=new Employee(129,"smith",50000);
    	
    	Employee[] empArr= {emp1,emp2,emp3,emp4,emp5};
    	Predicate<Employee> checkSalary=(emp)-> emp.getSalary()> 50000;
    	for(Employee e:empArr)
    		if(checkSalary.test(e))
    			System.out.println(e);
	}

}
