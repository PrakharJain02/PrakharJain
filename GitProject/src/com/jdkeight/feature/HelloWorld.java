package com.jdkeight.feature;
@FunctionalInterface
interface HelloWorldInterface{
	public void sayHello();
}

public class HelloWorld {
	
	public static void main(String[] args) {
		// here we are using FunctionalInterface for print helloWorld. we are already created HelloWorldInterface
		// which has sayHello() method.
		HelloWorldInterface hwi = ()-> System.out.println("Hello Prakhar ! Welcome in JDK 1.8");
		hwi.sayHello();
		
	}

}
