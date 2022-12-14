/**
 * 
 */
package com.training.core.arrays;

/**
 * @author Asif_
 *
 */
public class SwapEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x=10;
		int y=20;
		System.out.println("x="+x+",y="+y);
		int z=0;//temp variable
		z=x;
		x=y;
		y=z;
		System.out.println("After swaping x="+x+",y="+y);
	}

}
