/**
 * 
 */
package com.training.core.collections;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author Asif_
 *
 */
public class TreeSetExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<Integer> hashSetEx= new TreeSet<Integer>();
		hashSetEx.add(1234);
		hashSetEx.add(12);
		hashSetEx.add(3456);
		hashSetEx.add(4567);
		hashSetEx.add(12345);
		hashSetEx.add(65);
		hashSetEx.add(7686);
		hashSetEx.add(987);
		hashSetEx.add(33333);
		hashSetEx.add(1212);
		hashSetEx.add(1);
		hashSetEx.add(34);
		if(hashSetEx.contains(34)) {
			System.out.println("34 is present in the list");
		}
		System.out.println("--------------------------------");
		for (Integer s : hashSetEx) {
			System.out.println(s);
		}
	}

}
