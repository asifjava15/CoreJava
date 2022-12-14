package com.training.core;

/**
 * @author Asif_
 *
 */
public class SecondExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x=10;
//		boolean b=false;
//		System.out.println(!b);
		int y=23;
		System.out.println("Addition of x and y--->"+(x+y));
		System.out.println("Subtraction of x and y--->"+(x-y));
		System.out.println("Multiplication of x and y--->"+x*y);
		System.out.println("Division of y by x--->"+y/x);
		
		int a = 10, b = 5, c = 1, result;
    	result = a-++c-++b;
    	
    	System.out.println(result);
//    	System.out.println(x==20);
//    	if(x==20 || y==20) {
//    		System.out.println("if block");
//    	}else {
//    		System.out.println("else block");
//    	}
    	int z;
//    	if(x==20) {
//    		z=20;
//    	}else {
//    		z=0;
//    	}
    	
    	z= x==20?20:1;
    	System.out.println("z---->"+z);
    	System.out.println("Reminder of y by x--->"+y%x);
	}

}
