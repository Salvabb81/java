package org.sbru.java8.lambda;

import org.sbru.java8.lambda.arithmetic.Arithmetic;
import org.sbru.java8.lambda.arithmetic.Calculator;

public class ExampleFunctionalInterface {

	public static void main(String[] args) {

		Arithmetic addition = Double::sum;// (a, b) -> a + b;
		Arithmetic substraction = (a, b) -> a - b;

		Calculator cal = new Calculator();

		System.out.println(cal.operate(10, 5, addition));
		System.out.println(cal.operate(10, 5, substraction));
		System.out.println(cal.operate(10, 5, (a, b) -> a * b));

		System.out.println(cal.operateWithBiFunction(10, 5, (a, b) -> a + b));
	}

}
