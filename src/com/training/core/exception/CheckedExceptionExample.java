/**
 * 
 */
package com.training.core.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author Asif_
 *
 */
public class CheckedExceptionExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File f= new File("D://Training/Notes.txt");
//		File f= new File("Training/Notes.txt"); //failure
		try {
			FileInputStream stream = new FileInputStream(f);
		}catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
