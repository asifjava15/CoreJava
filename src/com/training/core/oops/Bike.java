/**
 * 
 */
package com.training.core.oops;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Asif_
 *
 */
public class Bike extends Vehicle {

	public void run() {
		super.run();
		System.out.println("Bike is running safely");
	}
	//Valid use cases
//	protected void move() throws FileNotFoundException {
//		System.out.println("Bike is moving");
//    }

//	protected void move() throws IOException {
//		System.out.println("Bike is moving");
//    }
	protected void move() {
		System.out.println("Bike is moving");
    }
	//Invalid use cases
//	protected void move() throws InterruptedException {
//		System.out.println("Bike is moving");
//    }
//	protected void move() throws Exception {
//		System.out.println("Bike is moving");
//    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// creating an instance of child class
		Bike obj = new Bike();
		// calling the method with child class instance
		obj.run();
	}

}
