package com.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NegalateMethod {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("aa","bb","aabb","bbcc","aadd");
		Predicate<String> p = a -> a.startsWith("a");
		List<String> filterList = list.stream().filter(p.negate()).collect(Collectors.toList());
		System.out.println(filterList);
		
	}
}
