package com.mphasis;

public class DemoOnException {
	
	
	public static void extractString(String str) {
//		try {
//			System.out.println(str.charAt(5));
//			
//			}
//			catch(NullPointerException ne) {
//				ne.printStackTrace();
//			}
//			catch(RuntimeException ae) {
//				ae.printStackTrace();
//			}
		
		
			if(str==null)
			throw new NullPointerException();
			else
				System.out.println(str.charAt(5));
		
		
	}

	public static void main(String[] args) {
//		int a=5,b[]= {2,3,4,5};
//		
//		try {
//			for(int i=0;i<=b.length;i++)
//		System.out.println(a/b[i]);
//		}
//		catch(ArithmeticException ae) {
//			ae.printStackTrace();
//		}
//		catch(ArrayIndexOutOfBoundsException ae) {
//			ae.printStackTrace();
//		}
//		catch(RuntimeException ae) {
//			ae.printStackTrace();
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
		String s=null;
		extractString(s);
		System.out.println("Application closed successfully");
		

	}

}
