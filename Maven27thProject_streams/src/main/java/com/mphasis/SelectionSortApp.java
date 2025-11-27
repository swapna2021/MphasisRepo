package com.mphasis;

public class SelectionSortApp {

	public static void main(String[] args) {
		int arr[]= {10,23,45,12,65,87,44,9,98};
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			int mi=i;
			for(int j=i+1;j<n;j++)
				if(arr[j]<arr[mi])
					mi=j;
			int temp=arr[i];
			arr[i]=arr[mi];
			arr[mi]=temp;
			
		}
		
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
			

	}

}
