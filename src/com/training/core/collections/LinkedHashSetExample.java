/**
 * 
 */
package com.training.core.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Asif_
 *
 */
public class LinkedHashSetExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<String> hashSetEx= new LinkedHashSet<String>();
		hashSetEx.add("First");
		hashSetEx.add("12");
		hashSetEx.add("red");
		hashSetEx.add("12.1234567");
		hashSetEx.add("1.23");
		hashSetEx.add(null);
		hashSetEx.add("c");
		hashSetEx.add("blue");
		hashSetEx.add("12");
		hashSetEx.add("red");
		hashSetEx.add("blue");
		hashSetEx.add(null);
		hashSetEx.add("12.1234567");
		hashSetEx.add("green");
		if(hashSetEx.contains("blue")) {
			System.out.println("Blue is present in the list");
		}
		System.out.println("--------------------------------");
		for (String s : hashSetEx) {
			System.out.println(s);
		}
	}

}
