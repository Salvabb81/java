package org.sbru.threads.examples.executor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ExampleExecutorFuture2 {

	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

//		ExecutorService executor = Executors.newSingleThreadExecutor();
		ExecutorService executor = Executors.newFixedThreadPool(3);

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
		
		Callable<Integer> task2 = () -> {
			System.out.println("Starting the task 3 ...");
			TimeUnit.SECONDS.sleep(3);
			return 10;
		};
		
		Future<String> result = executor.submit(task);
		Future<String> result2 = executor.submit(task);
		Future<Integer> result3 = executor.submit(task2);
		executor.shutdown();

		System.out.println("Keep executing the main method 1.");

//		System.out.println(result.isDone());
		while (!(result.isDone() && result2.isDone() && result3.isDone())) {
			System.out.println(String.format("result 1: %s - result 2: %s - result 3: %s",
					result.isDone()?"finished":"in process",
					result2.isDone()?"finished":"in process",
					result3.isDone()?"finished":"in process"));
			TimeUnit.MILLISECONDS.sleep(1000);
		}
		System.out.println("We get the result 1 of the task: " + result.get());
		System.out.println("Task 1 ends: " + result.isDone());
		
		System.out.println("We get the result 2 of the task: " + result2.get());
		System.out.println("Task 2 ends: " + result2.isDone());
		
		System.out.println("We get the result 3 of the task: " + result3.get());
		System.out.println("Task 3 ends: " + result3.isDone());

	}
}
