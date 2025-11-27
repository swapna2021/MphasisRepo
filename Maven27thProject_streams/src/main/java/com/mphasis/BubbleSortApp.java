package com.mphasis;

public class BubbleSortApp {

	public static void main(String[] args) {
		int arr[]= {10,23,45,12,65,87,44,9,98};
		int n=arr.length;
		int temp;
		for(int i=0;i<n-1;i++)
			for(int j=0;j<n-i-1;j++)
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
	}

}
