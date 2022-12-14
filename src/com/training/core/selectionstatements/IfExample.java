/**
 * 
 */
package com.training.core.selectionstatements;

import java.util.Scanner;

/**
 * @author Asif_
 *
 */
public class IfExample {

	/**
	 * Greater among 2 numbers
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter x value");
		int x=scanner.nextInt();
		System.out.println("Enter y value");
		int y=scanner.nextInt();
		scanner.close();
		if(x>y) {
			System.out.println(x+" is greater than "+y);
		}else {
			System.out.println(x+" is less than "+y);
		}
		
	}

}
