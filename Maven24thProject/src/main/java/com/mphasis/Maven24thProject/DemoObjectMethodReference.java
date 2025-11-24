package com.mphasis.Maven24thProject;

import java.time.chrono.IsoChronology;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DemoObjectMethodReference {

	public static void main(String[] args) {
		
		String myname="swapna motupally";
		Supplier<Integer> lengthUsingLambda=()->myname.length();
		Supplier<Integer> lengthUsingMR=myname::length;
		
		System.out.println(lengthUsingLambda.get());
		System.out.println(lengthUsingMR.get());
		
	
		Hello h=new Hello();
		Supplier<String> helloUsingLambda=()->h.sayHello();
		Supplier<String> helloUsingMR=h::sayHello;
		
		System.out.println(helloUsingLambda.get());
		System.out.println(helloUsingMR.get());
		
		
		NumberUtilMR nu=new NumberUtilMR();
		Predicate<Integer> isEvenUsingMr=nu::isEven;
		System.out.println(isEvenUsingMr.test(45));
		
		
		Function<Integer,Integer> squareNumMR=nu::squareNum;
		System.out.println(squareNumMR.apply(10));
		
		
		Function<Double,Double> logMr=nu::logNum;
		System.out.println(logMr.apply(2.0));
		
		
		int arr[]= {45,23,12,89,67};
		Consumer<int[]> printMR=nu::printNum;
		printMR.accept(arr);
	
	}

}

class Hello{
	public String sayHello() {
		return "hello....";
	}
}

class NumberUtilMR{
	
	
	public boolean isEven(int num) {
		return num%2==0;
	}
	
	public int squareNum(int num) {
		return num*num;
	}
	
	
	public double logNum(double num) {
		return Math.log(num);
	}
	
	
	public void printNum(int[] arr) {
		for(int i=0;i<arr.length;i++)
			System.out.println(i);
	}
}


