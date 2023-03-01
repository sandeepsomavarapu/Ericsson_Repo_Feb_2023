package com.ericcson.collections;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapEx1 {
	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> cm = new ConcurrentHashMap<Integer, String>();
		cm.put(10, "suresh");
		cm.put(20, "naresh");
		cm.put(30, "harsih");
		System.out.println(cm);
		// cm.compute(10,(key,val)->val+" hello");
		cm.putIfAbsent(20, "ramesh");
		System.out.println(cm);
		cm.remove(30, "somesh");
		cm.replace(10, "suresh", "gopi");

		System.out.println(cm);
	}
}
