package com.mphasis;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
		for(int i=2;i<=num/2;i++)
			if(num%i==0) {
				count++;
				break;
			}
		if(count!=0)
			System.out.println("not prime");
		else
			System.out.println("prime");
		
		
		System.out.println("App completed");

	}

}
