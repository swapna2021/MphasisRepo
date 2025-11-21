package com.mphasis;

import java.util.Scanner;

public class PrintName {

	public static void main(String[] args) {
		char choice;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("swapna");
			System.out.println("do you wanna repeat y/n");
			choice=sc.next().charAt(0);
		}while(choice!='n');
		System.out.println("Thank You....");
	}

}
