package com.mphasis;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	
    	//singleton design pattern
//        DBConnection conn1=DBConnection.getInstance();
//        System.out.println(conn1.hashCode());
//        DBConnection conn2=DBConnection.getInstance();
//        System.out.println(conn2.hashCode());
//        DBConnection conn3=DBConnection.getInstance();
//        System.out.println(conn3.hashCode());
    	
    	
    	//Factory pattern
//    	Shape s=ShapesFactory.getShape("square");
//    	s.draw();
//    	
//    	Shape s1=ShapesFactory.getShape("circle");
//    	s.draw();
    	
    	//Abstract Factory Pattern
    	
    	
//    	GUIFactory gui=new WinFactory();
//    	Button button=gui.createButton();
//    	CheckBox checkBox=gui.createCheckBox();
//    	button.click();
//    	checkBox.check();
//    	
//    	
//    	GUIFactory gui1=new MacFactory();
//    	Button button1=gui1.createButton();
//    	CheckBox checkBox1=gui1.createCheckBox();
//    	button1.click();
//    	checkBox1.check();
    	
    	
    	//Builder pattern
    	
    	
//    	Pizza pizza=new Pizza.Builder("medium")
//    				.cheese(true)
//    				.olives(false)
//    				.build();
//    	
//    	System.out.println(pizza);
    	
    	
    	DrinkMaker tea=new TeaMaker();
    	tea.prepareDrink();
    }
}
