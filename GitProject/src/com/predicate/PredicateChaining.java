package com.predicate;

import java.util.function.Predicate;

/**
 * @author Prakhar Jain
 * @Description :: illustrate Predicate Chaining 
 */
public class PredicateChaining {
	
	public static void main(String[] args) {
		
		// Creating Predicate for greater value
		Predicate<Integer> greaterThan = i -> i > 10;
		// Creating Predicate for lowest value
		Predicate<Integer> lowestValue  = i -> i < 100;
		// predicate method calling for test 
		System.out.println("Greater Than Input Value = " + greaterThan.test(14));
		System.out.println("Lowest Than Input Value = " + lowestValue.test(14));
		
		// Predicate Chaining 
		System.out.println("Predicate Chaining = " + greaterThan.and(lowestValue).test(20));
		System.out.println("negate() = " + greaterThan.and(lowestValue).negate().test(4));
		System.out.println("Predicate Chaining = " + greaterThan.or(lowestValue).test(20));
		
		
	}

	
}
