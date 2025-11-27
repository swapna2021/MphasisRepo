package com.mphasis;

public class InsertSortApp {

	public static void main(String[] args) {
		int arr[]= {10,23,45,12,65,87,44,9,98};
		int n=arr.length;

		for(int i=1;i<n;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0&&arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+"   ");
	}

}
