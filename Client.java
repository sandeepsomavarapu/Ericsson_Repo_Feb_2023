package com.ericcson.oops;

public class Client {
public static void main(String[] args) {
	Employee emp=new Employee(111, "mahesh", 9000,"trainer");
	System.out.println(emp.toString());
	
	
	System.out.println(emp.getEid());
	System.out.println(emp.getEname());
	
	
	
}
}
