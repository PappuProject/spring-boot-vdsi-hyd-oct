package com.demo.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StreamsDemo {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("ankit");
		names.add("raju");
		names.add("poonam");
		names.add("kirti");
		names.add("romel");
		names.add("karan");
		names.add("chundi");
		names.add("ramesh");
		names.add("zishan");
		names.add("babu");

		List<String> filteredList = new ArrayList<>();

		for (String name : names) {
			if (name.startsWith("r")) {
				filteredList.add(name);
			}
		}

		System.out.println(filteredList.size());

		for (String name : filteredList) {
			System.out.println(name);
		}
		
		//java8
		
		names.parallelStream().filter(a->a.startsWith("r")).forEach(System.out::println);
		
		Predicate<String> p1= t->t.startsWith("r");
		Consumer<String> c1=c->System.out.println(c);
		
		names.stream().filter(p1).forEach(c1);
		
		System.out.println(names.stream().filter(a->a.startsWith("r")).count());
	}
}
