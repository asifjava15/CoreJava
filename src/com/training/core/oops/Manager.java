/**
 * 
 */
package com.training.core.oops;

/**
 * @author Asif_
 *
 */
public class Manager extends Programmer {
	
	int incentives=10000;  

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Manager manager= new Manager();
		System.out.println(manager);
	}

	@Override
	public String toString() {
		return "Manager [incentives=" + incentives + ", bonus=" + bonus + ", salary=" + salary + "]";
	}
	
	

}
