package com.mphasis;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class MutableStrings {

	public static void main(String[] args) {
		StringBuffer buff=new StringBuffer();
		buff.append("swapna");
		buff.append("Amit");
		buff.append("preethi");
		buff.append("swapna");
		buff.append("Amit");
		buff.append("preethii");
		System.out.println(buff);
		System.out.println(buff.capacity());
		StringBuffer sbf=new StringBuffer("name");
		System.out.println(sbf.capacity());
		sbf.ensureCapacity(15)	;
		System.out.println(sbf.capacity());
		sbf.ensureCapacity(30)	;
		System.out.println(sbf.capacity());//20*2+2=42
		
		StringBuilder sbl=new StringBuilder("Swapna Motupally");
		//sbl.replace(7, 13, "*****");
		System.out.println(sbl.reverse());
		
		
		String str="apple,banana,orange,pineapple";
		StringTokenizer tokenizer=new StringTokenizer(str,","); 
		while(tokenizer.hasMoreTokens())
			System.out.println(tokenizer.nextToken());
		
		StringJoiner sj=new StringJoiner(",");
		sj.add("swapna");
		sj.add("ram");
		sj.add("swapna");
		sj.add("ram");
		sj.add("swapna");
		sj.add("ram");
		System.out.println(sj);
			

	}

}
