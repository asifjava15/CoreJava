/**
 * 
 */
package com.training.core.collections;

import java.util.Set;
import java.util.TreeSet;

import com.training.core.oops.Address;
import com.training.core.oops.Employee;

/**
 * @author Asif_
 *
 */
public class TreeSetEmployee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<Employee> hashSetEx= new TreeSet<Employee>();
		hashSetEx.add(new Employee(21,"Arun",25,"Male",new Address("1","10", "LA", "NC", "US", 12345)));
		hashSetEx.add(new Employee(10,"asif",25,"Male",new Address("1","10", "LA", "NC", "US", 12345)));
		hashSetEx.add(new Employee(1,"gagan",25,"Male",new Address("1","10", "LA", "NC", "US", 12345)));
		hashSetEx.add(new Employee(15,"harsh",25,"Male",new Address("1","10", "LA", "NC", "US", 12345)));
		hashSetEx.add(new Employee(25,"Pinky",25,"Female",new Address("1","10", "LA", "NC", "US", 12345)));
		hashSetEx.add(new Employee(2,"shaik",25,"Male",new Address("1","10", "LA", "NC", "US", 12345)));
		System.out.println("--------------------------------");
		for (Employee s : hashSetEx) {
			System.out.println(s);
		}
	}

}
