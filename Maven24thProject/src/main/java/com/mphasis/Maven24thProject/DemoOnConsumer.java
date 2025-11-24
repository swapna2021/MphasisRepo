package com.mphasis.Maven24thProject;

import java.util.Arrays;
import java.util.function.Consumer;


public class DemoOnConsumer {

	public static void main(String[] args) {
		
	
		Consumer<Integer> squareConsumer=(num1)->{
			System.out.println(num1*num1);
		};
		squareConsumer.accept(5);
		
		Consumer<Integer[]> sortConsumer=(arr)->{
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));
			
		};
		Integer[] arr= {45,23,78,12,99,42,1};
		sortConsumer.accept(arr);
		
		
		Employee emp1=new Employee(123,"swapna",70000);
    	Employee emp2=new Employee(121,"swathi",60000);
    	Employee emp3=new Employee(127,"swetha",90000);
    	Employee emp4=new Employee(122,"swarna",30000);
    	Employee emp5=new Employee(129,"smith",50000);	
    	Employee[] empArr= {emp1,emp2,emp3,emp4,emp5};
    	Consumer<Employee[]> printConsumer=(err)->{
    		for(Employee e:err)
    			System.out.println(e.getEmpName());
    		
    	};
    	printConsumer.accept(empArr);
    	
		
		
		
	
	}

}
