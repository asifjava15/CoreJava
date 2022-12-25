/**
 * 
 */
package com.training.core.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.training.core.oops.Address;
import com.training.core.oops.Employee;

/**
 * @author Asif_
 *
 */
public class HashMapKeyEmployeeExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<Employee, String> map = new HashMap<>();
		map.put(new Employee(21,"Arun",25,"Male",new Address("1","10", "LA", "NC", "US", 12345)), "Basha");
		map.put(new Employee(10,"asif",25,"Male",new Address("1","10", "LA", "NC", "US", 12345)), "Sandeep");
		map.put(new Employee(1,"gagan",25,"Male",new Address("1","10", "LA", "NC", "US", 12345)), "Arun");
		map.put(new Employee(15,"harsh",25,"Male",new Address("1","10", "LA", "NC", "US", 12345)), "Gagan");
		map.put(new Employee(25,"Pinky",25,"Female",new Address("1","10", "LA", "NC", "US", 12345)), "Dinesh");
		map.put(new Employee(2,"shaik",25,"Male",new Address("1","10", "LA", "NC", "US", 12345)), "Asif");
		map.put(new Employee(2,"shaik",25,"Male",new Address("1","10", "LA", "NC", "US", 12345)), "Shaik");
		//Approach 1
//		Set<Integer> keys=map.keySet();
//		for(Integer key:keys) {
//			System.out.println("Key is-->"+key);
//			System.out.println("Value is-->"+map.get(key));
//		}
		//Approach 2 more standard way
//		Set<Map.Entry<Integer, String>> entries=map.entrySet();
//		for(Map.Entry<Integer, String> entry:entries) {
//			System.out.println("Key is-->"+entry.getKey());
//			System.out.println("Value is-->"+entry.getValue());
//		}
		//Approach 3
		Set<Employee> keys=map.keySet();
		for (Iterator iterator = keys.iterator(); iterator.hasNext();) {
			Employee key = (Employee) iterator.next();
			System.out.println("Key is-->"+key);
			System.out.println("Value is-->"+map.get(key));
		}
	}

}
