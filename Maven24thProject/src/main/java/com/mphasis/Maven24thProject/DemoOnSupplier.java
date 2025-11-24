package com.mphasis.Maven24thProject;

import java.util.function.Supplier;

public class DemoOnSupplier {
	
	
	public static void main(String[] args) {
		
		String name="swapna";
		
		Supplier<String> supplier=()->name.toUpperCase();
		System.out.println(supplier.get());

		
		Supplier<Integer> randomSupplier=()->{
			return (int)Math.round(Math.random()*10000);
		};
		System.out.println(randomSupplier.get());
		
		
		int a=89,b=34;
		Supplier<Integer> maxSupplier=()->{
			return (a>b?a:b);
		};
		
		System.out.println(maxSupplier.get());

		
	}

}
