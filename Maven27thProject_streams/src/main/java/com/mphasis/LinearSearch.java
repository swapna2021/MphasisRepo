package com.mphasis;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		
		
		int arr[]= {10,23,45,12,65,87,44,9,98};
		System.out.println("Enter key element to search");
		Scanner sc=new Scanner(System.in);
		int key=sc.nextInt();
		int i=0;
		for(;i<arr.length;i++)
			if(key==arr[i])
			{
				System.out.println("Element found at "+(i+1)+"th position");
				break;
			}
		
		if(i==arr.length)
			System.out.println("Element not found");
	
		

	}

}
