package com.optional.example;
// importing Optional Class
import java.util.Optional;

public class OptionalClassExample {
	// used for Null check 
	public static void main(String[] args) {
		String[] string = new String[10];
		string[5] = "This is Optional Class Example";
		Optional<String> nullCheck = Optional.ofNullable(string[5]);
		if(nullCheck.isPresent()) {
			System.out.println(string[5].toLowerCase());
		}else {
			System.out.println("String is Null");
		}
		String str = "";
		System.out.println(Optional.empty());
		// Creating optional Class object with of () and pass the  String value
		Optional<String> optional = Optional.of("This is Object of Optional Class");
		System.out.println(optional);
		// Creating empty optional Class object
		Optional<String> emptyObj = Optional.empty();
		//System.err.println(emptyObj);
		
		if(optional.isPresent()) {
			System.out.println(optional);
		}else {
			System.out.println("Nothing");
		}
		
		optional.ifPresent(option -> System.out.println("Existing"));
		
		
	}
}
