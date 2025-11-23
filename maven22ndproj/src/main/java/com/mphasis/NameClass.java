package com.mphasis;

import java.util.Arrays;

public class NameClass {

	public static void main(String[] args) {
//		NameInterface ni=(String name)->System.out.println(name);
//		ni.printName("swapna Motupally");
		
//		NameInterface ni=(String str)->{
//			System.out.println(new StringBuffer(str).reverse().toString());
//		};
//		ni.stringReverse("swapna");
		
//		NameInterface ni=(int num)->System.out.println(num%2==0?"even":"odd");
//		ni.isEven(45);
		
//		NameInterface ni=(int arr[])->{
//			for( int i:arr)
//				System.out.println(i*i);
//		};
//		
//		int arr[]={1,2,3,4,5};
//		ni.squareNum(arr);
		
		
//		String[] str= {"swapna","amit","raj","banu"};
//		
//		NameInterface ni=(String[] str1)->{
//			
//			Arrays.sort(str);
//			for( String i:str)
//				System.out.println(i);
//		};
//		ni.sortStrings(str);
		
		String[] str1= {"swapna","amit","raj","banu"};
		NameInterface ni=(String[] str)->{
			
			int lengths[]=new int[str.length];
			for(int i=0;i<str.length;i++) {
				lengths[i]=str[i].length();
			}
			return lengths;
			
		};
		
		   int len[]=ni.findLength(str1);
		   for(int i=0;i<len.length;i++)
			   System.out.println(len[i]);
		
	}

}
