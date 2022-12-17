/**
 * 
 */
package com.training.core.oops;

/**
 * @author Asif_
 *
 */
public class Employee {
	private String name;
	private int age;
	private String gender;
	private Address address;
	
	public Employee() {
		System.out.println("Employee object has been created");
	}
	
	public Employee(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address + "]";
	}
	
	
}
