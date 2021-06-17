package com.predicate;
@FunctionalInterface
public interface CustomInterface {

	public void sayHello();
	
	public default void sayWelcom() {
		System.out.println("Welcome in Java 8 ");
	}
	
}
