package com.foreach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ForEachExample {
	
	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(5, "five");
		map.put(6, "six");
		
		// display the list using foreach () of JDK 1.8
		System.out.println("------------------- :: Key and Value Pair :: -------------------------");
		map.forEach(
				(key,value)->System.out.println("Key : "+key +" Value : "+value)
				);
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<10;i++)
			list.add(i);
		// single input with list 
		System.out.println("------------------- :: Integer List :: --------------------------------");
		list.forEach(
				(l)->System.out.println(list)
				);
		// single input with single output (input and output is same)
		System.out.println("------------------- :: input and output same :: --------------------------------");
		list.forEach(
				(l)->System.out.println(l)
				);
		// using stream
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Prakhar Jain");
		arrayList.add("Prakash Jain");
		arrayList.add("Praveen Jain");
		arrayList.add("Pravesh Jain");
		arrayList.add("Nikhar Jain");
		arrayList.add("Rekha Jain");
		System.out.println("------------------- :: String Filter :: --------------------------------");
		arrayList.stream() // creating Stream
		.filter(a->a.startsWith("P"))
		.forEachOrdered(System.out::println);;
		
		

	}
	
}
