package com.mphasis;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class DemoOnHashSet {

	public static void main(String[] args) {
		//no duplication
		//no insertion order
		//can insert only one null
		//no random access
		HashSet<Integer> hashSet=new HashSet<Integer>();
		hashSet.add(56);
		hashSet.add(34);
		hashSet.add(99);
		hashSet.add(23);
		System.out.println(hashSet);
		hashSet.add(99);
		hashSet.add(99);
		hashSet.add(99);
		System.out.println(hashSet);
		for(Integer i:hashSet)
			System.out.println(i);
		
		Iterator<Integer> itr=hashSet.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		hashSet.forEach(i->System.out.println(i));
		hashSet.forEach(System.out::println);
		hashSet.add(null);
		System.out.println(hashSet);
		
		//complete all other operations of HashSet
		
		
		LinkedHashSet<Integer> llHashSet=new LinkedHashSet<Integer>();
		llHashSet.add(90);
		llHashSet.add(56);
		llHashSet.add(34);
		llHashSet.add(99);
		llHashSet.add(23);
		llHashSet.add(12);
		System.out.println(llHashSet);
		
		
	
	}

}
