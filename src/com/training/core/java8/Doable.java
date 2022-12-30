/**
 * 
 */
package com.training.core.java8;

/**
 * @author Asif_
 *
 */
public interface Doable {
	default void doIt() {
		System.out.println("Do it now");
	}
}
