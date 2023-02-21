package com.ericcson.oops;

import java.util.Date;

interface Calculator {
	public abstract void subOfTwo(int a, int b);

	void mulOfTwo(int a, int b);// public abstract void mulOfTwo(int a,int b);
}

abstract class Parent implements Calculator {
	public void printTime() {
		Date date = new Date();
		System.out.println("Current Time  : " + date.getHours());
	}

	public abstract void addOfTwo(int a, int b);
}

public class AbstractionEx extends Parent {

	public void printDate() {
		Date date = new Date();
		System.out.println("Today's Date  : " + date);
	}

	public static void main(String[] args) {
		AbstractionEx obj = new AbstractionEx();
		obj.printDate();
		obj.printTime();
		obj.mulOfTwo(2, 200);
	}

	@Override
	public void subOfTwo(int a, int b) {
		System.out.println(a - b);
	}

	@Override
	public void mulOfTwo(int a, int b) {
		System.out.println(a * b);
	}

	@Override
	public void addOfTwo(int a, int b) {
		System.out.println(a + b);
	}

}
