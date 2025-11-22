package com.mphasis;

public class Calculator implements ScientificCalculatorInterface{
	
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	public void add(double d1,double d2) {
		System.out.println(d1+d2);
	}
	public void add(String s1,String s2) {
		System.out.println(s1+s2);
	}
	public void add(long l,double d) {
		System.out.println(l+d);
		
	}
	public void add(double d,long l) {
		System.out.println(l+d);
		
	}
	
	
	public void add(ComplexNum c1,ComplexNum c2) {
		ComplexNum c3=new ComplexNum();
		c3.real=c1.real+c2.real;
		c3.imag=c1.imag+c2.imag;
		System.out.println(c3.real+"+i"+c3.imag);
	}
	//adding two complex numbers
	//adding two fractions
	//adding two matrices
	public static void main(String[] args) {
		
		Calculator ca=new Calculator();
		ca.add(5, 8);
		ca.add("swapna", " motupally");
		ComplexNum c1=new ComplexNum(3,4);
		ComplexNum c2=new ComplexNum(5,6);
		ca.add(c1,c2);
		
		
	}

	@Override
	public double power(double m, double n) {
		
		return Math.pow(m,n);
	}

	@Override
	public double squearRoot(double m) {
		return Math.sqrt(m);
	}

	@Override
	public double logValue(double m) {
		
		return Math.log(m);
	}

}
