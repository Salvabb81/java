package org.sbru.threads.examples.executor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ExampleExecutorFuture {

	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

		ExecutorService executor = Executors.newSingleThreadExecutor();

		Callable<String> task = () -> {
			System.out.println("Starting the task...");
			try {
				System.out.println("Name of the Thread: " + Thread.currentThread().getName());
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				e.printStackTrace();
			}
			System.out.println("End of the Task.");
			return "Some important task result.";
		};
		Future<String> result = executor.submit(task);
		executor.shutdown();

		System.out.println("Keep executing the main method 1.");

//		System.out.println(result.isDone());
		while (!result.isDone()) {
			System.out.println("executing the task...");
			TimeUnit.MILLISECONDS.sleep(1500);
		}
		System.out.println("We get the result of the task: " + result.get());
//		System.out.println("We get the result of the task: " + result.get(5, TimeUnit.SECONDS));
		System.out.println("Task ends: " + result.isDone());

	}
}
