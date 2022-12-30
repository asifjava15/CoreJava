/**
 * 
 */
package com.training.core.threads;

/**
 * @author Asif_
 *
 */
public class MyThreadEx implements Runnable {

	@Override
	public void run() {
		System.out.println("MyThreadEx: This is run method from Runnable");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyThreadEx myThreadEx= new MyThreadEx();
		Thread thread= new Thread(myThreadEx);
		thread.start();
	}

}
