/**
 * 
 */
package com.training.core.exception;

import com.training.core.Emp;

/**
 * @author Asif_
 *
 */
public class RunTimeExceptionEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		String s=null;
//		System.out.println(s.length());
//		int x=10;
//		double y= x/0;
//		System.out.println(y);
		Emp e= new Emp();
		Object o= new Object();
		e.setName((String) o);
	}

}
