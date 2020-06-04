package com.predicate;

import java.util.Objects;
import java.util.function.Predicate;

public class PredicateInFunction {
	
	public static void check(int number,Predicate<Integer> predicate) {
		System.out.println(predicate.test(number));
	}
	
	public static boolean isNullorBlank(String value) {
		Predicate<String> predicate = string -> string.isEmpty() || string ==null || string.equals("") || string.trim().equalsIgnoreCase("null");
		return predicate.test(value);
	}
	
	public static boolean isNull(String string) {
		Predicate<String> nonNullPredicate = Objects::isNull; 
		return nonNullPredicate.test(string);
	}
	public static void main(String[] args) {
		
		check(10, i-> i > 11);
		String string ="null";
		String nullString =null;
		// checking null or blank through Predicate 
		System.out.println(isNullorBlank(string));
		System.out.println(isNull(nullString));
		
	}

}
