package com.mphasis;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		int num1,num2;
		char op;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two num");
		num1=sc.nextInt();
		num2=sc.nextInt();
		System.out.println("Enter an arithmetic operator");
		op=sc.next().charAt(0);
		switch(op) {
		case '+':System.out.println(num1+num2);
		break;
		case '-':System.out.println(num1-num2);
		break;
		case '*':System.out.println(num1*num2);
		break;
		case '/':System.out.println((float)num1/num2);
		break;
		default:System.out.println("not a valid operation");
		}

	}

}
