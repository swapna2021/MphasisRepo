package com.mphasis;

public class DBConnection {
	
	private static DBConnection instance;
	
	private DBConnection() {
		System.out.println("instance created");
	}
	
	public static DBConnection getInstance() {
		
		if(instance!=null)
			return instance;
		
			return instance= new DBConnection();
	}

}
