package com.mphasis;


import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
public class DemoOnMaps {

	public static void main(String[] args) {
		
//		HashMap<Integer, String> hashMap=new HashMap<Integer, String>();
//		hashMap.put(1, "hyd");
//		hashMap.put(43, "bglr");
//		hashMap.put(23, "chennai");
//		hashMap.put(3,"delhi");
//		
//		System.out.println(hashMap);
//		hashMap.put(3,"pune");
//		System.out.println(hashMap);
//		
//		System.out.println(hashMap.keySet());
//		System.out.println(hashMap.values());
//		System.out.println(hashMap.entrySet());
//		
//		System.out.println(hashMap.get(3));
//		System.out.println(hashMap.getOrDefault(13,"Madhurai"));
//		System.out.println(hashMap);
//		
//		Set<Integer> keySet=hashMap.keySet();
//		Set<String> valueSet=new HashSet<String>( hashMap.values());
//		System.out.println(valueSet);
//		Iterator<Integer> keyItr=keySet.iterator();
//		while(keyItr.hasNext())
//			System.out.println(keyItr.next());
//		
//		
//		Iterator<Entry<Integer,String>> entryItr=hashMap.entrySet().iterator();
//		while(entryItr.hasNext())
//			System.out.println(entryItr.next());
//		
		
		
//		TreeMap<Integer, Integer> treeMap=new TreeMap<Integer, Integer>();
//		treeMap.put(1,1);
//		treeMap.put(2, 4);
//		treeMap.put(7, 49);
//		treeMap.put(4, 16);
//		treeMap.put(12,144);
//		treeMap.put(3, 9);
//		System.out.println(treeMap);
//		System.out.println(treeMap.ceilingEntry(5));
//		System.out.println(treeMap.descendingMap());
//		//complete rest of the code
		
		Hashtable<Integer, String> table=new Hashtable<Integer, String>();
		table.put(3, "swapna");
		table.put(2, "amit");
		table.put(8, "raj");
		table.put(7, "ram");
		
		System.out.println(table);
		Enumeration<Integer> keys=table.keys();
		while(keys.hasMoreElements())
			System.out.println(keys.nextElement());
		
		
		Enumeration<String> values= table.elements();
		while(values.hasMoreElements())
			System.out.println(values.nextElement());
			

	}

}
