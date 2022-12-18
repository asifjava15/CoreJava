/**
 * 
 */
package com.training.core.oops;

import java.io.IOException;

/**
 * @author Asif_
 *
 */
public class Vehicle {
	protected void run() {
		System.out.println("Vehicle is running");
	}
	
	protected void move() throws IOException {
        System.out.println("Vehicle is moving");
    }
}
