/**
 * 
 */
package com.collections;

import java.util.HashMap;
import java.util.Map.Entry;

/**
 * @author User
 *
 */
public class HashMapExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Createing HashMap 
		HashMap<String, Integer> hashMap = new HashMap<>();
		System.out.println("Initial HashMap :: "+ hashMap);
		// add Element in hashMap using put method
		hashMap.put("JAVA", 1);
		hashMap.put("JAVASCRIT", 2);
		hashMap.put("PYTHON",3);
		System.out.println(hashMap);
		// access Element using get()
		System.out.println(hashMap.get("JAVa"));
		// keySet()
		System.out.println(" Key Set Method :: "+ hashMap.keySet());
		System.out.println(" Value Set Method :: "+ hashMap.values());
		System.out.println(" Entry Set Method :: "+ hashMap.entrySet());
		// Iterate HashMap key
		for (String string : hashMap.keySet()) {
			System.out.println(":: Key :: "+ string);
		}
		// Iterate HashMap Value 
		for (Integer value : hashMap.values()) {
			System.out.println(" :: Values :: "+ value);
		}
		for (Entry<String,Integer> value : hashMap.entrySet()) {
			System.out.println(" :: Entry Set :: "+ value);
		}
	}

}
