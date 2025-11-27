package com.mphasis;

import java.util.Scanner;

public class BinSearch {

	public static void main(String[] args) {
		
		int arr[]= {10,23,26,45,56,66,68,79,87,90};
		System.out.println("Enter key element to search");
		Scanner sc=new Scanner(System.in);
		int key=sc.nextInt();
		int low=0;
		int high=arr.length-1;int mid;
		while(low<=high) {
			
			mid=(low+high)/2;
			
			if(arr[mid]==key) {
				System.out.println("Element foune at "+(mid+1)+"th position");
				break;
				
			}
			else if(arr[mid]>key)
				high=mid-1;
				
			else
				low=mid+1;
		}
		if(low>high)
			System.out.println("element not found");

	}

}
