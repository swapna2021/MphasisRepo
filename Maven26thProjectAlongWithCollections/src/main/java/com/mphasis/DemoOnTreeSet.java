package com.mphasis;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.TreeSet;

public class DemoOnTreeSet {

	public static void main(String[] args) {

		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(34);
		treeSet.add(12);
		treeSet.add(90);
		treeSet.add(56);
		System.out.println(treeSet);
		System.out.println(treeSet.ceiling(90));
		System.out.println(treeSet.floor(39));

		Iterator<Integer> itr = treeSet.descendingIterator();
		while (itr.hasNext())
			System.out.println(itr.next());
		System.out.println(treeSet.headSet(56));
		System.out.println(treeSet.tailSet(56));
		System.out.println(treeSet.higher(35));

		TreeSet<Student> studentTree = new TreeSet<Student>();
		studentTree.add(new Student(123, "swapna", 44, 90, "Hyderabad"));
		studentTree.add(new Student(16, "swathi", 44, 87, "Hyderabad"));
		studentTree.add(new Student(1234, "swetha", 44, 65, "Hyderabad"));
		studentTree.add(new Student(12345, "amit", 44, 100, "Hyderabad"));
		for (Student s : studentTree)
			System.out.println(s);
		
	

	}

}
