package com.mphasis;

/**
 * Hello world!
 */
 public class App {
	 
	 
	 static {
		 System.out.println("static block1");
	 }
	 static {
		 System.out.println("static block2");
	 }
	 static {
		 System.out.println("static block4");
	 }
	 
	 
	 
	 public static void main() {
		 System.out.println("my own main method");
	 }
    public static void main(String[] args) {
    	
//    	Employee emp=new Employee();
//    	System.out.println(emp);
//    	emp.setEmpId(123);
//    	emp.setEmpName("swapna");
//    	emp.setDesg("trainer");
//    	emp.setMobileNum("6281614948");
//    	System.out.println(emp);
//    	
//    	Employee e1=new Employee("amit",678, "Manager", "9090909090");
//    	System.out.println(e1);
 
//    	Student s1=new Student(123,"swapna",90);
//    	Student s2=new Student(123,"swapna",90);
//    	System.out.println(s1.hashCode());
//    	System.out.println(s2.hashCode());
//    	System.out.println(s1==s2);
//    	System.out.println(s1.equals(s2));
//    	System.out.println(s1.collegeName);
//    	System.out.println(s2.collegeName);
//    	s2.collegeName="xyz college";
//    	System.out.println(s1.collegeName);
//    	
    	System.out.println("in main method");
    	App.main();   
    }
    
    static {
		 System.out.println("static block3");
	 }
    
    static {
		 System.out.println("static block5");
	 }
}
