package com.ericcson.collections;

import java.util.TreeSet;

//homogeneous ,heterogeneous data only allowed 
//lot's utility methods
//duplicates are not allowed 				
//insertion order is not preserved 

public class SetEx {

	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<String>();
		names.add("sandeep");
		names.add("mahesh");
		names.add("mahesh");
		names.add("rajesh");

		names.add("somesh");

		names.add("mukesh");
		System.out.println(names);

	}

}
