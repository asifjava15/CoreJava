/**
 * 
 */
package com.training.core.java8;

/**
 * @author Asif_
 *
 */
public class Person {

	private String name;
	private Integer age;

	// Constructor
	public Person(String name, int age) {
		// This keyword refers to current instance itself
		this.name = name;
		this.age = age;
	}

	// Getter-setters
	public Integer getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
