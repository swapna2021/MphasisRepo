package com.mphasis;

//import com.mphasis.Student.College;

public class StudentMain {

	public static void main(String[] args) {
//		non-static inner class
		Student s1=new Student(123,"swapna",90);
//		Student.College c1=s1.new College("abc college", "bglr", 1234);
//
//		
		Student s2=new Student(12,"amit",90);
//		Student.College c2=s2.new College("xyz college", "bglr", 1298);
		//static inner class
		College c=new  College("xyz college", "bglr", 1298);
		c.sayHello();
		c.display();
		
		
		

	}

}
