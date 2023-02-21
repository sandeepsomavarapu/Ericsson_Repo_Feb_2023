package com.ericcson.oops;

interface A {

	void m1();// public abstract void m1()

}

interface B {
	void m1();// public abstract void m1()
}

public class MultipleInheritanceEx implements A, B {

	public static void main(String[] args) {
		MultipleInheritanceEx obj = new MultipleInheritanceEx();
		obj.m1();
	}

	@Override
	public void m1() {
		System.out.println("Multiple inharitance can be achieved by using interfaces in java");
	}

}
