/**
 * 
 */
package com.training.core.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author Asif_
 *
 */
public class TreeMapExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<>();
		map.put(34, "Basha");
		map.put(1, "Sandeep");
		map.put(11, "Arun");
		map.put(15, "Gagan");
		map.put(14, "Dinesh");
		map.put(19, "Asif");
		map.put(34, "Shaik");
		map.put(24, "Sandeep");
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
		Set<Integer> keys=map.keySet();
		for (Iterator iterator = keys.iterator(); iterator.hasNext();) {
			Integer key = (Integer) iterator.next();
			System.out.println("Key is-->"+key);
			System.out.println("Value is-->"+map.get(key));
		}
	}

}
