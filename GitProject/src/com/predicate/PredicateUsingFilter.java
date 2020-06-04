package com.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateUsingFilter {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		// First Way 
		List<Integer> collect = list.stream().filter(a -> a > 5).collect(Collectors.toList());
		System.out.println("First Approach :: "+collect);
		// Second Way
		Predicate<Integer> p = a -> a > 4;
		List<Integer> intList = list.stream().filter(p).collect(Collectors.toList());
		System.out.println("Second Approach :: "+ intList);
	}
}
