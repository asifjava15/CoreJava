/**
 * 
 */
package com.training.core.selectionstatements;

import java.util.Scanner;

/**
 * @author Asif_
 *
 */
public class SwitchExam2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Choose any  number from 1 to 5");
		int x=scanner.nextInt();
		switch(x){
			case 1:
				System.out.println("You have choosen 1");
				break;
			case 2:
				System.out.println("You have choosen 2");
				break;
			case 3:
				System.out.println("You have choosen 3");
				break;
			case 4:
				System.out.println("You have choosen 4");
				break;
			case 5:
				System.out.println("You have choosen 5");
				break;
			default:
				System.out.println("You have choosen a different number outside of given range");
				break;
		}
		scanner.close();
		
	}

}
