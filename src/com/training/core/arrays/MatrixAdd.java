/**
 * 
 */
package com.training.core.arrays;

import java.util.Scanner;

/**
 * @author Asif_
 *
 */
public class MatrixAdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] x= new int[2][2];
		int [][]y= new int[2][2];
		int[] []z=new int[2][2];
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter A matrix elements");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.println("Enter element");
				x[i][j]=scanner.nextInt();
			}
		}
		System.out.println("Enter B matrix elements");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.println("Enter element");
				y[i][j]=scanner.nextInt();
			}
		}
		System.out.println("Perfoming Addtion of matrix elements");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				z[i][j]=x[i][j]+y[i][j];
			}
		}
		System.out.println("X matrix elements");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(x[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("Y matrix elements");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(y[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("Z matrix elements");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(z[i][j]+"\t");
			}
			System.out.println();
		}
		scanner.close();
	}

}
