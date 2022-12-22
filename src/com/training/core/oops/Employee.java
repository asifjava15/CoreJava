/**
 * 
 */
package com.training.core.oops;

/**
 * @author Asif_
 *
 */
public class Employee{ //implements Comparable<Employee> {
	private Integer empId;
	private String name;
	private Integer age;
	private String gender;
	private Address address;
	
	public Employee(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public Employee(Integer empId,String name,Integer age,String gender,Address address) {
		this.empId=empId;
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.address=address;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", age=" + age + ", gender=" + gender + ", address="
				+ address + "]";
	}
//	@Override
//	public int compareTo(Employee o) {
//		return this.empId.compareTo(o.getEmpId());
//	}
	
}
