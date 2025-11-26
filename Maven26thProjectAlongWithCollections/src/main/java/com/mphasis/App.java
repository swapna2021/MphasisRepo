package com.mphasis;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	
       System.out.println("Immutable class creation");	
       System.out.println("1.class need to be final "
       		+ "\n2.Properties need to be final"
       		+ "\n3.Properties need to get value thorugh constructor"
       		+ "\n4.No setters to modify data");
       Person p1=new Person("Swapna Motupally",32453);
       System.out.println(p1);
       
    }
}
