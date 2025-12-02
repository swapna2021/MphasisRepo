package com.mphasis;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		while(true) {
			System.out.println("object creating");
			new MyClass().listItem.add(new int[15]);
		}

	}

}

class MyClass{
	
	 List<int[]> listItem=new ArrayList<int[]>();
	
}
