/**
 * 
 */
package com.training.core.java8;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Asif_
 *
 */
public class ForEachExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> gamesList = new ArrayList<String>();
		gamesList.add("Football");
		gamesList.add("Cricket");
		gamesList.add("Chess");
		gamesList.add("Hockey");
		System.out.println("------------Iterating by passing lambda expression--------------");
		gamesList.forEach(games -> System.out.println(games));
	}

}
