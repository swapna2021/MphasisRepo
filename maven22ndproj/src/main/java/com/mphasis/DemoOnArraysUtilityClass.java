package com.mphasis;

import java.util.Arrays;

public class DemoOnArraysUtilityClass {

	public static void main(String[] args) {
		
		int[] arr= {10,35,20,72,30,11,40,5};
		System.out.println(Arrays.toString(arr));
		String nums=Arrays.toString(arr);
		System.out.println(nums);
		Arrays.sort(arr);
		for(int ele:arr)
			System.out.println(ele);
		
		System.out.println(Arrays.binarySearch(arr, 30));
		
		int[] brr= {10,35,20,72,30,11,40,5};
		System.out.println(Arrays.equals(arr,brr));//arr is sorted ,so positional values are not equal in both arrays

		Arrays.sort(brr);
		System.out.println(Arrays.equals(arr,brr));//brr is also sorted,so both are equal
		
		int[] crr=Arrays.copyOf(arr, 10);
		for(int ele:crr)
			System.out.println(ele);
		

		Arrays.fill(arr, 78);
		for(int ele:arr)
			System.out.println(ele);
		
	}

}
