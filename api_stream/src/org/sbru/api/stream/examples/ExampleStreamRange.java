package org.sbru.api.stream.examples;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class ExampleStreamRange {

	public static void main(String[] args) {

		IntStream num = IntStream.range(5, 20)/*.peek(System.out::println)*/;

//		int result = num.reduce(0, Integer::sum);
//		int result = num.sum();
		IntSummaryStatistics stats = num.summaryStatistics();
		System.out.println("Max: " + stats.getMax());
		System.out.println("Min: " + stats.getMin());
		System.out.println("Sum: " + stats.getSum());
		System.out.println("Average: " + stats.getAverage());
		System.out.println("Total: " + stats.getCount());	
	}
}
