/**
 * 
 */
package com.training.core.oops;

/**
 * @author Asif_
 *
 */
public class Programmer extends Analyst {
	
	int bonus=10000;  
	public Programmer() {
		super();
		System.out.println("Child constructor");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Programmer programmer= new Programmer();
		System.out.println(programmer);
	}

	@Override
	public String toString() {
		return "Programmer [bonus=" + bonus + ", salary=" + salary + "]";
	}
}
