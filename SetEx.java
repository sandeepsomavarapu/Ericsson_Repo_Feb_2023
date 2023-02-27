package com.ericcson.collections;

import java.util.Comparator;
import java.util.TreeSet;

//homogeneous ,heterogeneous data only allowed 
//lot's utility methods
//duplicates are not allowed 				
//insertion order is not preserved 
class A {
}

public class SetEx {

	public static void main(String[] args) {

		TreeSet<String> names = new TreeSet<String>(new MyOrder());// 16 hashmap
														// java.lang.Comparable-->NSO,java.util.Comparator-->CSO
														// compare
		names.add("sandeep");// key
		names.add("mahesh");
		names.add("mahesh");
		names.add("rajesh");
		names.add("somesh");
		names.add("mukesh");

		System.out.println(names);

		// compareTo
		// returns -ve if obj1 has to come before obj2
		// returns +ve if obj1 has to come after obj2
		// returns 0 if both are same

	}

}

class MyOrder implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {

		return o2.compareTo(o1);
		//return -o1.compareTo(o2);
	}

}
