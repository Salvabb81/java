package org.sbru.threads.examples.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExampleExecutor {

	public static void main(String[] args) throws InterruptedException {

		ExecutorService executor = Executors.newSingleThreadExecutor();

		Runnable task = () -> {
			System.out.println("Starting the task...");
			try {
				System.out.println("Name of the Thread: " + Thread.currentThread().getName());
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				e.printStackTrace();
			}
			System.out.println("End of the Task.");
		};
		executor.submit(task);
		executor.shutdown();
		
		System.out.println("Keep executing the main method 1.");
		executor.awaitTermination(2, TimeUnit.SECONDS);
		System.out.println("Keep executing the main method 2.");
	}
}
