/**
 * 
 */
package com.training.core.loops;

import java.util.Scanner;

/**
 * @author Asif_
 *
 */
public class ForLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a range to print number ");
		int x=scanner.nextInt();
		for (int i = 0; i <= x; i++) {
			int j=i;
			System.out.println(i);
		}
		scanner.close();
	}

}
