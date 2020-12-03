package org.sbru.java8.lambda.arithmetic;

import java.util.function.BiFunction;

public class Calculator {

	public double operate(double a, double b, Arithmetic lambda) {

		return lambda.operation(a, b);
	}

	public double operateWithBiFunction(double a, double b, BiFunction<Double, Double, Double> lambda) {

		return lambda.apply(a, b);
	}

}
