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
	
	
	public void setAge(int age) {
		this.age = age;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void setGender(char gender) {
		this.gender = gender;
	}



	public static void setUNIVERSITY(String uNIVERSITY) {
		UNIVERSITY = uNIVERSITY;
	}



	@Override
	public String toString() {
		return "Emp [age=" + age + ", name=" + name + ", gender=" + gender + "]";
	}

	public void display(String n) {
		System.out.println(toString());
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
