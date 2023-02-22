package com.ericcson.stringexamples;

public class StringEx {

	public static void main(String[] args) {
//String Literal
		String name = "ericcson";// imuttable

		String name1 = "ericcson";

		// System.out.println("ericcson".compareTo("eaiccson"));

		// returns -ve if obj1 has to come before obj2
		// returns +ve if obj1 has to come after obj2
		// returns 0 if both are same

		System.out.println(name.equals(name1));// true
		System.out.println(name.equalsIgnoreCase(name1));// true
		System.out.println(name.compareTo(name1));// 0
		System.out.println(name.compareToIgnoreCase(name1));// 0
		System.out.println(name == name1);// true

		String name2 = new String("ericcson");
		String name3 = new String("ericcson");

		
		System.out.println(name2.equals(name3));//true
		System.out.println(name2 == name3);//false 
		
	
		
		
		
		name.concat(" india");// ericcson india GC

		System.out.println(name);
//String with new 		

		String orgName = new String("ericcson");

		StringBuffer sb = new StringBuffer("ericcson");// muttable
		StringBuffer sb1 = new StringBuffer("ericcson");
		
		
		System.out.println(sb.equals(sb1));//false ==
		System.out.println(sb==sb1);//false
		
		
		System.out.println(sb.toString().equals(sb1.toString()));
		
		
		
		
		
		
		
		sb.append(" india");

		System.out.println(sb);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
