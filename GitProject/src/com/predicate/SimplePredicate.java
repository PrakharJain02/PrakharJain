package com.predicate;

import java.util.function.Predicate;

public class SimplePredicate {

	public static void main(String[] args) {
		
		// Simple Predicate Example to understand how to use it.
		//Predicate<Integer> predicate = i->(i*i);// compile time error as it is used to conditional check.
		Predicate<Integer> predicate = i -> i < 10 ;
		System.out.println("Checking with Value 10 = "+predicate.test(10));
		System.out.println("Checking with Value 20 = "+predicate.test(20));
		System.out.println("Checking with Value 5 = "+predicate.test(5));
		System.out.println("Checking with Value 1 = "+predicate.test(1));
		System.out.println("Checking with Value 9 = "+predicate.test(9));
		
	}

}
