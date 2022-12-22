/**
 * 
 */
package com.training.core.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author Asif_
 *
 */
public class ListExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list= new ArrayList<String>();
		list.add("First");
		list.add("12");
		list.add("12.1234567");
		list.add("1.23");
		list.add("c");
		list.remove(2);
		list.add("blue");
		list.add(null);
		list.add(0, "Asif");
		list.add(null);
		List<String> colors= new ArrayList<>();
		colors.add("red");
		colors.add("blue");
		colors.add("green");
		list.addAll(0,colors);
		System.out.println("Blue is at index of-->"+list.indexOf("blue"));
//		list.clear();
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
//		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
//			Object object = (Object) iterator.next();
//			System.out.println(object);
//		}
//		for (String s : list) {
//			System.out.println(s);
//		}
		if(list.contains("blue")) {
			System.out.println("Blue is present in the list");
		}
//		Collections.sort(list);
		System.out.println("--------------------------------");
		for (String s : list) {
			System.out.println(s);
		}
	}

}
