package com.ericcson.java8;

interface Calculator {
	public void calci(int a, int b);

}

public class MethodReferenceEx {
	public MethodReferenceEx(int a, int b) {
		System.out.println("mul of two numbers : " + (a * b));
	}

	public MethodReferenceEx() {
		// TODO Auto-generated constructor stub
	}

	public void addOfTwo(int a, int b) {
		System.out.println("add of two numbers : " + (a + b));
	}

	public static void subOfTwo(int a, int b) {
		System.out.println("sub of two numbers : " + (a - b));
	}

	public static void main(String[] args) {
		MethodReferenceEx obj=new MethodReferenceEx();
		Calculator cal=obj::addOfTwo;
		cal.calci(12, 13);
		Calculator cal1=MethodReferenceEx::subOfTwo;
		cal1.calci(12, 3);
		Calculator cal2=MethodReferenceEx::new;
		cal2.calci(12, 3);
	}

}
