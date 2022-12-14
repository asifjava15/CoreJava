/**
 * 
 */
package com.training.core.arrays;

import java.util.Arrays;

/**
 * @author Asif_
 *
 */
public class ArrayEx2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] x = new int[5];
		x[0]=10;
		x[1]=15;
		x[2]=5;
		x[3]=25;
		x[4]=20;
		//x[5]=30;
		//Arrays.sort(x);
		for(int i=0;i<x.length;i++) {
			System.out.println(x[i]);
		}
	}

}
