/**
 * 
 */
package com.training.core.oops;

/**
 * @author Asif_
 *
 */
public class AISpecialist extends Analyst {
	
	int bonus=20000;  
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AISpecialist aiSpecialist= new AISpecialist();
		System.out.println(aiSpecialist);
	}
	@Override
	public String toString() {
		return "AISpecialist [bonus=" + bonus + ", salary=" + salary + "]";
	}
	
	
}
