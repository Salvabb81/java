package org.sbru.api.stream.examples;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.sbru.api.stream.examples.models.User;

public class ExampleStreamDistinctUserSum {

	public static void main(String[] args) {
		
		IntStream namesLength = Stream
				.of("Salvador Bru", "John Doe", "Aimee Yao", "Maria Smith", "John Gosling", "Salvador Bru", "Salvador Bru")
				.map(firstName -> new User(firstName.split(" ")[0], firstName.split(" ")[1]))
				.distinct()
				.mapToInt(u -> u.toString().length())
				.peek((System.out::println));
				
//		namesLength.forEach(System.out::println);
		IntSummaryStatistics stats = namesLength.summaryStatistics();
		System.out.println("total: " + stats.getSum());
		System.out.println("max: " + stats.getMax());
		System.out.println("min: " + stats.getMin());
		System.out.println("average: " + stats.getAverage());
	}
}
