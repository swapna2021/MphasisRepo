package com.mphasis;

public class TryWithResourcesDemo implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("resource closed successfully");
		
	}
	
	
	

}

