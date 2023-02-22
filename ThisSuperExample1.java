package com.ericcson.oops;

class SuperParent1 {
	String orgName = "IBM";

	SuperParent1() {
		System.out.println("am from parent default constructor");
	}

	SuperParent1(int marks) {
		this();
		System.out.println("am from parent param constructor  " + marks);
	}

	public void m1() {
		System.out.println("am from parent class m1 method");
	}
}

public class ThisSuperExample1 extends SuperParent1 {
	String orgName = "capgemini";

	public ThisSuperExample1() {
		//super()
		System.out.println("AM from child default constructor ");
	}

	public void m1() {
		System.out.println("am from Current class m1 method");
	}

	public void printOrgNames() {
		String orgName = "cognizant";
		this.m1();
		super.m1();
		System.out.println(orgName);
		System.out.println(this);
		System.out.println(this.orgName);
		System.out.println(super.orgName);

	}

	public static void main(String[] args) {
		ThisSuperExample1 obj = new ThisSuperExample1();

		obj.printOrgNames();
	}

}
