package com.ericcson.collections;
//collections are not fixed in size / growable in nature   ArrayList al=new ArrayList();//10,16 (cc*3/2)+1

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//homogeneous ,heterogeneous data only allowed 
//lot's of utility methods

//duplicates are allowed 				
//insetion order is preserved 
public class ListEx {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();// 10 ,16 (cc*3/2)+1
		al.add("sandeep");
		al.add("kavitha");
		al.add("aruna");
		al.add("prabdeep");
		al.add("sandeep");
		al.set(2, "tanya");

		ListIterator<String> emps = al.listIterator();

		while (emps.hasNext()) {
			System.out.println(emps.next());
		}

		while (emps.hasPrevious()) {
			System.out.println(emps.previous());
		}
//		System.out.println(al);
//		System.out.println(al.indexOf("sandeep"));
//		System.out.println(al.lastIndexOf("sandeep"));
//
//			al.add(1, "apoorva");
//			System.out.println(al);
//		Iterator<String> itr = al.iterator();
//		while (itr.hasNext()) {
//			System.out.println("hello :" +itr.next());
//		}
//
//		Object[] names = al.toArray();
//		List<Object> names1 = Arrays.asList(names);
//
//		for (int i = 0; i < names.length; i++) {
//			System.out.println(names[i]);
//		}
//		System.out.println(al.size());
//
//		// System.out.println(al.remove("sandeep"));
//		System.out.println(al.remove(4));
//		System.out.println(al);
//		// System.out.println(al);
//
//		ArrayList<String> al2 = new ArrayList<String>();// 10
//		al2.add("mahesh");
//		al2.add("naresh");
//		System.out.println(al2.get(1));
//
//		al2.addAll(0,al);
//		System.out.println(al2);
//		System.out.println(al2.containsAll(al));
//		System.out.println(al2.contains("kavitha"));
//
//		// al2.removeAll(al);
//		// al2.retainAll(al);
//		// al2.clear();
//		System.out.println(al2.isEmpty());
//
//		ArrayList al1 = new ArrayList();// 10
//		al1.add("mahesh");
//		al1.add(true);
//		al1.add(89.4f);
//
//		System.out.println(al1);

	}

}
