/**
 * 
 */
package com.training.core.java8;

/**
 * @author Asif_
 *
 */
public class FunctionalInterfaceExample3 implements Sayable {
	public void say(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		FunctionalInterfaceExample3 fie = new FunctionalInterfaceExample3();
		fie.say("Hello there");
		fie.doIt();
	}
}
