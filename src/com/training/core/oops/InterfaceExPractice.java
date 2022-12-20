/**
 * 
 */
package com.training.core.oops;

/**
 * @author Asif_
 *
 */
public class InterfaceExPractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Animal a= new Dog();
		a.makesSound();
		a= new Cow();
		a.makesSound();
	}

}
