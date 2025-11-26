package com.mphasis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DemoOnArrayList {
	
	
	public static void main(String[] args) {
		
//		ArrayList alist=new ArrayList();
//		alist.add(56);
//		alist.add("swapna");
//		alist.add(true);
//		alist.add(89.76);
//		Person p=new Person("swapna",12345);
//		alist.add(p);
//		System.out.println(alist);
//		System.out.println(alist.get(2));
//		alist.add(56);
//		alist.add("swapna");
//		alist.add(true);
//		alist.add(89.76);
//		System.out.println(alist);
//		alist.add(null);
//		alist.add(null);
//		System.out.println(alist);
//		
//		ArrayList<String> namesList=new ArrayList<String>();
//		namesList.add("amit");
//		namesList.add("Preethi");
//		namesList.add("varun");
//		namesList.add("keerthi");
//		System.out.println("using syso");
//		System.out.println(namesList);
//		
//		System.out.println("enhanced for loop");
//		for(String name:namesList)
//			System.out.println(name);
//		
//		System.out.println("using iterator");
//		Iterator<String> itr=namesList.iterator();
//		while(itr.hasNext())
//			System.out.println(itr.next());
//		
//		
//		
//		System.out.println("using list iterator");
//		
//		ListIterator<String> litr=namesList.listIterator();
////		System.out.println("forward direction");
////		while(litr.hasNext())
////			System.out.println(litr.next());
//		System.out.println("Backward direction");
//		while(litr.hasPrevious())
//			System.out.println(litr.previous());
//	
//		System.out.println(namesList.contains("amit"));
//		
//		
//		System.out.println("ForEach");
//		namesList.forEach(name->System.out.println(name));//consumer using lambda
//		namesList.forEach(System.out::println);//consumer using mr
//		
//		//System.out.println(namesList.remove(2)+" got removed");
//		
//		Integer[] arr= {2,3,4,5,6,7};
//		Integer[] brr= {1,2,3,4,5};
//		
//		
//		List<Integer> numsList1=new ArrayList<Integer>( Arrays.asList(arr));
//		List<Integer> numsList2=new ArrayList<Integer>(Arrays.asList(brr));
//		System.out.println("Before retainsAll operation"+numsList1);
//		numsList1.retainAll(numsList2);
//		System.out.println("After retainsAll operation"+numsList1);
//		
//		namesList.add("Anand");
//		
//		System.out.println("NamesList:"+namesList);
//		
//		Collections.sort(namesList);
//		System.out.println("After sorting\n"+namesList);
//		
//		
//		ArrayList<String> clonedNamesList=(ArrayList<String>) namesList.clone();
//		System.out.println(namesList.hashCode());
//		System.out.println(clonedNamesList.hashCode());
//		
//		//clonedNamesList.add("swapna");
//		namesList.add("swapna");
//		System.out.println(clonedNamesList.hashCode());
//		System.out.println(clonedNamesList);
//		//System.out.println(namesList.hashCode());
		
		
		ArrayList<Student> studentList=new ArrayList<Student>();
		studentList.add(new Student(123,"swapna",44,90,"Hyderabad"));
		studentList.add(new Student(16,"swapna",44,87,"Hyderabad"));
		studentList.add(new Student(1234,"swapna",44,65,"Hyderabad"));
		studentList.add(new Student(12345,"swapna",44,100,"Hyderabad"));
		studentList.add(new Student(121,"swathi",25,78,"Chennai"));
		studentList.add(new Student(231,"swetha",54,34,"Delhi"));
		studentList.add(new Student(678,"swarna",30,88,"Bengaluru"));
		studentList.add(new Student(12,"smit",22,90,"Pune"));
		studentList.add(new Student(13,"kruthi",31,55,"Vijayawada"));
		studentList.add(new Student(23,"pooja",44,65,"Hyderabad"));
		studentList.add(new Student(127,"swathi",25,78,"Chennai"));
		studentList.add(new Student(2314,"swetha",54,34,"Delhi"));
		studentList.add(new Student(679,"amit",30,88,"Bengaluru"));
		studentList.add(new Student(11,"smit",22,90,"Pune"));
		studentList.add(new Student(14,"kruthi",31,55,"Vijayawada"));
		studentList.add(new Student(125,"lakshmi",44,80,"Hyderabad"));
		studentList.add(new Student(120,"swathi",25,78,"Chennai"));
		studentList.add(new Student(239,"swetha",54,34,"Delhi"));
		studentList.add(new Student(675,"krishna",30,88,"Bengaluru"));
		studentList.add(new Student(1,"smit",22,90,"Pune"));
		studentList.add(new Student(3,"kruthi",31,55,"Vijayawada"));
		
		//System.out.println(studentList);
		
		for(Student s:studentList)
			System.out.println(s);
		
		//Collections.sort(studentList);
		studentList.sort(new CityComparator()
				.thenComparing(new NameComparator())
				.thenComparing(new MarksComparator()));
				
		System.out.println("******After sorting**********");
		for(Student s:studentList)
			System.out.println(s);
		
		
		
		
	}

}
