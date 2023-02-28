package com.ericcson.collections;

import java.util.HashMap;

public class TestEmployee {

	public static void main(String[] args) {
		Employee emp = new Employee(121, "sandeep");
		Employee emp1 = new Employee(121, "sandeep");
		
	//	System.out.println(emp.hashCode());
	//	System.out.println(emp1.hashCode());
		
	//	System.out.println(emp.equals(emp1));//false   ==
		

		HashMap<Employee, String> hs = new HashMap<Employee, String>();

		hs.put(emp, "developer");	//emp.hashcode()
		hs.put(emp1, "trainer");	//emp1.hashcode()

		System.out.println(hs);

	}

}
