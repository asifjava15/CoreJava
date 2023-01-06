/**
 * 
 */
package com.training.core.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.training.core.oops.Address;
import com.training.core.oops.Employee;

/**
 * @author Asif_
 *
 */
public class TerminalOperationsEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(21, "Arun", 20, "Male", new Address("1", "10", "LA", "NC", "US", 12345)));
		employees.add(new Employee(10, "asif", 25, "Male", new Address("1", "10", "LA", "NC", "US", 12345)));
		employees.add(new Employee(1, "gagan", 35, "Male", new Address("1", "10", "LA", "NC", "US", 12345)));
		employees.add(new Employee(15, "harsh", 26, "Male", new Address("1", "10", "LA", "NC", "US", 12345)));
		employees.add(new Employee(25, "Pinky", 23, "Female", new Address("1", "10", "LA", "NC", "US", 12345)));
		employees.add(new Employee(2, "shaik", 29, "Male", new Address("1", "10", "LA", "NC", "US", 12345)));
		boolean areAllMale = employees.stream().allMatch(p -> p.getGender().equals("Male"));

		System.out.println("Are all persons male? " + areAllMale);

		boolean anyFemale = employees.stream().anyMatch(p -> p.getGender().equals("Female"));

		System.out.println("Is there any female? " + anyFemale);

		boolean noHill = employees.stream().noneMatch(p -> p.getName().equals("Hill"));

		System.out.println("No one comes from Hill family? " + noHill);

		Map<String, List<Employee>> byGender = employees.stream().collect(Collectors.groupingBy(p -> p.getGender()));

		System.out.println("Groups by gender:\n" + byGender);

		String names = employees.stream().map(p -> p.getName()).collect(Collectors.joining(", "));
		System.out.println(names);

		long totalMale = employees.stream().filter(p -> p.getGender().equals("Male")).count();
		System.out.println("Total male: " + totalMale);
	}

}
