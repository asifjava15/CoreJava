/**
 * 
 */
package com.training.core.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.training.core.oops.Address;
import com.training.core.oops.Employee;

/**
 * @author Asif_
 *
 */
public class ListEmployee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Employee> employees= new ArrayList<Employee>();
		employees.add(new Employee(21,"Arun",20,"Male",new Address("1","10", "LA", "NC", "US", 12345)));
		employees.add(new Employee(10,"asif",25,"Male",new Address("1","10", "LA", "NC", "US", 12345)));
		employees.add(new Employee(1,"gagan",35,"Male",new Address("1","10", "LA", "NC", "US", 12345)));
		employees.add(new Employee(15,"harsh",26,"Male",new Address("1","10", "LA", "NC", "US", 12345)));
		employees.add(new Employee(25,"Pinky",23,"Female",new Address("1","10", "LA", "NC", "US", 12345)));
		employees.add(new Employee(2,"shaik",29,"Male",new Address("1","10", "LA", "NC", "US", 12345)));
		Collections.sort(employees,new EmpNameComparator());
		System.out.println("--------------------------------");
		
//		for (Employee s : employees) {
//			System.out.println(s);
//		}
		//List<Employee> ageList=employees.stream().filter(x->x.getAge()<=25).collect(Collectors.toList());
		employees.stream().filter(x->x.getAge()<=25).collect(Collectors.toList()).forEach(System.out::println);
	}

}
