/**
 * 
 */
package com.training.core.selectionstatements;

import java.util.Scanner;

/**
 * @author Asif_
 *
 */
public class IfElseIfExam {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter your name");
		String name=scanner.next();
		System.out.println("Enter your age");
		int age=scanner.nextInt();
		if(age>18) {
			System.out.println("Enter your graduation colleage");
			String colleage= scanner.next();
		}
		String school;
		if(age<18) {
			if(age>5 && age <10) {
				System.out.println("Enter elimentary school");
				school=scanner.next();
			}
			else if(age>10 && age<15) {
				System.out.println("Enter middle school");
				school=scanner.next();
			}
			else if(age>=15 && age<=16) {
				System.out.println("Enter high school");
				school=scanner.next();
			}
			else if(age>16 && age<=18) {
				System.out.println("Enter grade II school");
				school=scanner.next();
			}
		}
		scanner.close();
	
	}

}
