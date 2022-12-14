/**
 * 
 */
package com.training.core.loops;

import java.util.Scanner;

/**
 * @author Asif_
 *
 */
public class WhileLoopEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a range to print number ");
		int x=scanner.nextInt();
		int i = 0;
		while (i <= x) {
			System.out.println(i);
			i++;
		}
		scanner.close();
	}

}
