/**
 * 
 */
package com.training.core.collections;

import java.util.Comparator;

import com.training.core.oops.Employee;

/**
 * @author Asif_
 *
 */
public class EmpNameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
