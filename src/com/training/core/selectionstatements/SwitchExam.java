/**
 * 
 */
package com.training.core.selectionstatements;

import java.util.Scanner;

/**
 * @author Asif_
 *
 */
public class SwitchExam {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Choose and color from rainbow colors");
		String colorString=scanner.next();
		switch(colorString){
			case "blue":
				System.out.println("You have choosen blue color");
				break;
			case "red":
				System.out.println("You have choosen red color");
				break;
			case "green":
				System.out.println("You have choosen green color");
				break;
			case "yellow":
				System.out.println("You have choosen yellow color");
				break;
			case "indigo":
				System.out.println("You have choosen indigo color");
				break;
			case "violet":
				System.out.println("You have choosen violet color");
				break;
			case "orange":
				System.out.println("You have choosen orange color");
				break;
			default:
				System.out.println("You have choosen a different color rather than rainbow colors");
				break;
		}
		scanner.close();
		
	}

}
