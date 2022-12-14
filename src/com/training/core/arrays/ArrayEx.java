/**
 * 
 */
package com.training.core.arrays;

/**
 * @author Asif_
 *
 */
public class ArrayEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for(int i=0;i<cars.length;i++) {
			System.out.println(cars[i]);
		}
		System.out.println("Exception-->"+cars[4]);
		for(int j=0;j<10;j++) {
			System.out.println(j);
		}
	}

}
