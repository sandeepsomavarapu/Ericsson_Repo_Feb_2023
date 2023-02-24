package com.ericcson.collections;
//collections are not fixed in size / growable in nature   ArrayList al=new ArrayList();//10,16 (cc*3/2)+1

import java.util.ArrayList;

//homogeneous ,heterogeneous data only allowed 
//lot's utility methods

//duplicates are allowed 				
//insetion order is preserved 
public class ListEx {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();// 10
		al.add("sandeep");
		al.add("kavitha");
		al.add("aruna");
		al.add("prabdeep");
		al.add("sandeep");
		System.out.println(al);

		ArrayList al1 = new ArrayList();// 10
		al1.add("mhesh");
		al1.add(true);
		al1.add(89.4f);

		System.out.println(al1);

	}

}
