/**
 * 
 */
package com.training.core.java8;

/**
 * @author Asif_
 *
 */
public class LambdaExpressionExample {
	  
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  
		//without lambda, Drawable implementation using anonymous class  
        Drawable d=l->{System.out.println("Drawing length "+l);};  
        d.draw(20);  
	}

}
