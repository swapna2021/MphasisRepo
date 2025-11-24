package com.mphasis.Maven24thProject;

import java.util.function.Function;

public class DemoOnFuntion {

	public static void main(String[] args) {
		
		Function<Integer, Integer> squareFunction=(num)->num*num;
		int arr[]= {3,2,5,7,1,9};
		for(int i=0;i<arr.length;i++)
			System.out.println(squareFunction.apply(arr[i]));
		
		
		Employee emp1=new Employee(123,"swapna",70000);
    	Employee emp2=new Employee(121,"swathi",60000);
    	Employee emp3=new Employee(127,"swetha",90000);
    	Employee emp4=new Employee(122,"swarna",30000);
    	Employee emp5=new Employee(129,"smith",50000);
    	
    	Employee[] empArr= {emp1,emp2,emp3,emp4,emp5};
    	
    	Function<Employee, String> upperCaseFunction=(e)->e.getEmpName().toUpperCase();
    	for(Employee e1:empArr)
    		System.out.println(upperCaseFunction.apply(e1));
    	
    	
    	
    	Function<Integer,Integer> add20=(num)->num+20;
    	
    	System.out.println(squareFunction.andThen(add20).apply(5));
    
    	

	}

}
