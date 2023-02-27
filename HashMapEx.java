package com.ericcson.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

//homogeneous ,heterogeneous data only allowed  except TS,TM
//lot's utility methods
//duplicates keys are not allowed  values can be duplicate			
//insertion order is not preserved ,LHM
//key can be any Data and value can be any data
//key and value combination ->entry
public class HashMapEx {

	public static void main(String[] args) {

		HashMap<Integer, String> emps = new HashMap<Integer, String>();

		emps.put(111, "mahesh");
		emps.put(121, "suresh");
		emps.put(919, "naresh");
		emps.put(45, "rajesh");
		emps.put(4321, "somesh");
		emps.put(989, "hitesh");
		emps.put(777, "sandeep");
		emps.put(919, "charan");

		System.out.println(emps);

		Set<Integer> keys = emps.keySet();

		Iterator<Integer> keys1 = keys.iterator();

		while (keys1.hasNext()) {
			int key = keys1.next();
			System.out.println(key + " " + emps.get(key));
		}

		Set<Entry<Integer, String>> entries = emps.entrySet();

		Iterator<Entry<Integer, String>> entries1 = entries.iterator();

		while (entries1.hasNext()) {
			Entry<Integer, String> entry = entries1.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		
	
		
		
		
		
//		System.out.println(emps.size());
//		emps.clear();
//		System.out.println(emps.isEmpty());
//		System.out.println(emps.containsKey(4321));
//		System.out.println(emps.containsValue("apoorva"));
//		// emps.remove(777);
//
//		// System.out.println(emps);
//
//		// System.out.println(emps.get(900));
//		HashMap<Integer, String> emps1 = new HashMap<Integer, String>();
//		emps1.put(9876, "srikanth");
//		emps1.putAll(emps);
//		System.out.println(emps1);

	}

}
