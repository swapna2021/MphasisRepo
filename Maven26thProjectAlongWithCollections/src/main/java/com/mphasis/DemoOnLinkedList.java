package com.mphasis;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class DemoOnLinkedList {

	public static void main(String[] args) {
		
		
		Integer[] irr= {56,34,23,89,66,90,12,33};
		LinkedList<Integer>ll=new LinkedList<Integer>( Arrays.asList(irr));
		Iterator<Integer> itr=ll.descendingIterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println(ll.offer(95));
		System.out.println(ll);
		System.out.println(ll.peekLast());
		System.out.println(ll.pollLast());
		System.out.println(ll);
		
		//complete code with all methods of linkedlist
		
	}

}
