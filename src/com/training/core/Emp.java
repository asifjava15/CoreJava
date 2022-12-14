/**
 * 
 */
package com.training.core;

/**
 * @author Asif_
 *
 */
public class Emp {
	int age;
	String name;
	char gender;
	public static String UNIVERSITY="UNCC";
	
	
	@Override
	public String toString() {
		return "Emp [age=" + age + ", name=" + name + ", gender=" + gender + "]";
	}



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Emp e= new Emp();
		e.age=25;
		e.name="Sekhar";
		e.gender='M';
		System.out.println(e);
		System.out.println(Math.PI);
	}

}
