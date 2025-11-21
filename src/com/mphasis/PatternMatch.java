package com.mphasis;

import java.util.Scanner;

public class PatternMatch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String mobileNum=sc.next();
		if(mobileNum.matches("[6-9]\\d{9}"))
			System.out.println("valid mobile number");
		else
			System.out.println("not a valid mobile number");
				
	}

}
