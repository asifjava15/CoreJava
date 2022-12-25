/**
 * 
 */
package com.training.core.oops;

import java.util.Objects;

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
	@Override
	public int hashCode() {
		return Objects.hash(address, age, empId, gender, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(address, other.address) && Objects.equals(age, other.age)
				&& Objects.equals(empId, other.empId) && Objects.equals(gender, other.gender)
				&& Objects.equals(name, other.name);
	}
	
}
