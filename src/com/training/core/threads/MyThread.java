package com.training.core.threads;

import java.util.Date;

/**
 * @author Asif_
 *
 */
public class MyThread extends Thread{
	
	@Override
	public void run() {
		System.out.println("This is a run method before sleep: "+new Date().toString()+" name:"+getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("This is a run method after sleep time: "+new Date().toString()+" name:"+getName());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(Thread.activeCount());
		for(int i=0;i<10;i++) {
		MyThread myThread= new MyThread();
		myThread.setName("Asif");
		myThread.start();
		}
		System.out.println("Count:--->"+Thread.activeCount());
	}

}
