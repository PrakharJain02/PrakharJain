package com.predicate;

public class Example {

	public static void main(String[] args) {
		CustomInterface ci = () -> System.out.println("Hello ");
		ci.sayHello();
		ci.sayWelcom();
	}
}
