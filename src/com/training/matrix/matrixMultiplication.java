/**
 * 
 */
package com.training.matrix;
import java.util.Scanner;
/**
 * @author harsh
 *
 */
public class matrixMultiplication {

	/**
	 * 
	 */
	public matrixMultiplication() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter matrix size");
		int x = scanner.nextInt();
		int[][] a = new int[x][x];
		int[][] b = new int[x][x];
		int[][] c = new int[x][x];
		System.out.println("Enter first Matrix");
		for (int i = 0; i<x;i++) {
			for (int j = 0; j<x; j++) {
				a[i][j] = scanner.nextInt();
			}
		}
		System.out.println("Enter second Matrix");
		for (int i = 0; i<x;i++) {
			for (int j = 0; j<x; j++) {
				b[i][j] = scanner.nextInt();
			}
		}
		for (int i = 0; i<x;i++) {
			for (int j = 0; j<x; j++) {
				System.out.print(a[i][j]+",");
			}
			System.out.println();
		}
		for (int i = 0; i<x;i++) {
			for (int j = 0; j<x; j++) {
				System.out.print(b[i][j]+",");
			}
			System.out.println();
		}
		int temp = 0; 
		for(int i = 0; i< x; i++) {
			for(int j =0; j < x;j++) {
				for(int k =0; k < x;k++) {
					temp+= a[i][k]*b[k][j];
				}
				c[i][j] = temp;
				temp = 0;
			}
		}
		for (int i = 0; i<x;i++) {
			for (int j = 0; j<x; j++) {
				System.out.print(c[i][j]+",");
			}
			System.out.println();
		}
	}

}
