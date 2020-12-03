package org.sbru.java8.lambda;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.BiConsumer;

public class Consumer {

	public static void main(String[] args) {
		
		java.util.function.Consumer<Date> consumer = date -> {
			SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
			System.out.println(f.format(date));
		};
		consumer.accept(new Date());
		
		BiConsumer<String, Integer> biConsumer = (name, age) -> {
			System.out.println(name + " is " + age + " years old.");
		};
		
		biConsumer.accept("John", 39);
		
	}
	
}
