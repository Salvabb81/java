package org.sbru.api.stream.examples;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class ExampleStreamInfiniteGenerate {

	public static void main(String[] args) {

		AtomicInteger count = new AtomicInteger(0);
		Stream.generate(() -> {
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
//			return "Hello World!";
			return count.incrementAndGet();
		}).limit(7).forEach(System.out::println);
	}

}
