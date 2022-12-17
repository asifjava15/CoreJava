/**
 * 
 */
package com.training.core.oops;

/**
 * @author Asif_
 *
 */
public class EncapsulationEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee employee= new Employee("Anil",25);
//		employee.setAge(25);
		employee.setGender("Male");
//		employee.setName("Anil");
		Address address= new Address("12", "Indian LN", "Dallas", "Texas", "USA", 12345);
		employee.setAddress(address);
		System.out.println(employee);
	}

}
