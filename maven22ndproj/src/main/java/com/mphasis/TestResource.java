package com.mphasis;

public class TestResource {

	
		public static void main(String[] args) throws Exception {
			TryWithResourcesDemo demo=new TryWithResourcesDemo();
			DemoOnFileNOtFound dof=new DemoOnFileNOtFound();
			try (demo;dof){
			System.out.println("using demo resource");
			}
		}
		

	

}
