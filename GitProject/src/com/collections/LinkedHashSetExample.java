package com.collections;

import java.util.LinkedHashSet;

/**
 * @author Prakhar Jain
 * maintain insertion order
 *
 */
public class LinkedHashSetExample {
	
	public static void main(String[] args) {
		// empty Constructor 
		// 16 IC & .75 lf
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("a");
		lhs.add("i");
		lhs.add("u");
		lhs.add("e");
		lhs.add("o");

		System.out.println(lhs);
		lhs.forEach(System.out :: println);
	}
}
