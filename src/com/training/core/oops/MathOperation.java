/**
 * 
 */
package com.training.core.oops;

/**
 * @author Asif_
 *
 */
public class MathOperation {
	
	public int add(int x,int y) {
		System.out.println("Both the parameters are int");
		return x+y;
	}
	
	public int add(int x,int y, int z) {
		System.out.println("All the parameters are int");
		return x+y+z;
	}
	
	public int add(int x,long y) {
		System.out.println("one parameter is int and the other is long");
		return (int) (x+y);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MathOperation mathOperation= new MathOperation();
		System.out.println(mathOperation.add(10,20L));
	}

}
