package org.sbru.threads.examples.executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeoutException;

import org.sbru.threads.syncexamples.Bakery;
import org.sbru.threads.syncexamples.runnable.Baker;
import org.sbru.threads.syncexamples.runnable.Consumer;

public class ExampleExecutorProducerConsumer {

	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

//		ExecutorService executor = Executors.newSingleThreadExecutor();
		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

		System.out.println("Pool's size: " + executor.getPoolSize());
		System.out.println("Quantity of tasks in the pool: " + executor.getQueue().size());
		
		Bakery bakery = new Bakery();
		Runnable producer = new Baker(bakery);
		Runnable consumer = new Consumer(bakery);
		
		Future<?> futur1 = executor.submit(producer);
		Future<?> futur2 = executor.submit(consumer);

		
		System.out.println("Pool's size: " + executor.getPoolSize());
		System.out.println("Quantity of tasks in the pool: " + executor.getQueue().size());
		
		executor.shutdown();

		System.out.println("Keep executing the main method 1.");



	}
}
