package org.sbru.threads.examples;

import org.sbru.threads.examples.threads.NameThread;

public class ExampleExtendThread {
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new NameThread("John Doe");
		thread.start();
		// Thread.sleep(100);
		Thread thread2 = new NameThread("Maria");
		thread2.start();
		
		NameThread thread3 = new NameThread("Peter");
		thread3.start();
		
		System.out.println(thread.getState());
	}
}
