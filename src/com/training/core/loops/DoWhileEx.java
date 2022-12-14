/**
 * 
 */
package com.training.core.loops;

/**
 * @author Asif_
 *
 */
public class DoWhileEx {

	/**
	 * @param args
	 */
	public static void main(String args) {
		int i = 0;
		System.out.println("Return values--->"+doWhileMethod(i));
//		DoWhileEx doWhileEx= new DoWhileEx();
//		doWhileEx.main("");
//		main("");
	}
	
	public static void main(String[] args) {
		System.out.println("Args length---->"+args.length);
		System.out.println(args[1]);
		int i = 0;
		System.out.println("Duplicate Return values--->"+doWhileMethod(i));
	}

	private static int doWhileMethod(int i) {
		do {
			System.out.println(i);
			if (i == 50) {
				return i;
			}
		} while (i++ < 10);
		return i;
	}

}
