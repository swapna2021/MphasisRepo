package com.mphasis;

public class QuickSottApp {
	
	public static void quickSort(int arr[],int low,int high) {
		if(low<high) {
			int pivot=partition(arr,low,high);
			quickSort(arr, low, pivot);
			quickSort(arr, pivot+1, high);
			
		}
		
	}

	private static int partition(int[] arr, int low, int high) {
		int pivot=arr[low];
		int i=low+1,j=high;
		while(i<=j) {
			
			while(i<=j&&arr[i]<pivot) i++;
			while(i<=j&&arr[j]>=pivot) j--;
			if(i<=j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;j--;
			}
		}
		
		int temp=arr[low];
		arr[low]=arr[j];
		arr[j]=temp;
		return j;
	}

	public static void main(String[] args) {
		int arr[]= {10,23,45,12,65,87,44,9,98};
		
		System.out.println("----------Before sorting------------");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"  ");
		
		quickSort(arr,0,arr.length-1);
		System.out.println("\n----------After sorting------------");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"  ");

	}

}
