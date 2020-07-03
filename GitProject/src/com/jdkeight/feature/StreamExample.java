package com.jdkeight.feature;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		for(int i=1;i<=100;i++) {
			list.add(i);
		}
		
		Stream<Integer> stream = list.stream();
		Stream number = stream.filter(p->p>85);
		number.forEach(p->System.out.println("Chekcing "+p));
		// paraller stream is not in order so it will be very helpfull while working with huge Collection,.
		Stream<Integer> stream1 = list.parallelStream();
		Stream number1 = stream1.filter(p->p>85);
		number1.forEach(p->System.out.println("Chekcing 1 "+p));
	}

}
