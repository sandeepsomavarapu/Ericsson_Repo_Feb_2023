package com.ericcson.java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateEx {

	public static void main(String[] args) {
		Predicate<Integer> predicate = i -> i % 2 == 0;
		System.out.println(predicate.test(5));

		Predicate<String> predicate1 = i -> i.length() > 6;
		System.out.println(predicate1.test("deep"));

		Function<Integer, Integer> f = i -> i * i;
		System.out.println(f.apply(20));

		Function<String, Integer> f1 = i -> i.length();
		System.out.println(f1.apply("ericcson"));

		Function<String, String> f2 = i -> i.toUpperCase();
		System.out.println(f2.apply("ericcson"));

		Consumer<String> consumer = name -> {
			if (name.length() > 6) {
				System.out.println("name length is above 6");
			} else {
				System.out.println("name length is below 6 its invalid");
			}

		};
		consumer.accept("erriccson");
	}

}
