package com.collections;

import java.util.HashSet;

/**
 * @author User
 * NOT maintain any order 
 */
public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("1");
		set.add("2");
		set.add("3");
		set.add("4");
		set.add("5");
		System.out.println(set);
		set.forEach(System.out :: println);
	}
	
}
