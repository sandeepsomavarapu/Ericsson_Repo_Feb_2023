package com.ericcson.oops;

class SuperParent
{
	float salary=234.56f;
	public void m3()
	{
		System.out.println("welcome to india");
	}
	public void m4()
	{
		System.out.println("welcome to banglore");
	}
}
class Parent extends SuperParent
{
	int marks=234;
	public void m2()
	{
		System.out.println("welcome to hyderabad");
	}

}
public class InteritanceTest extends Parent {

	public void m1()
	{
		System.out.println("welcome to Inheritance");
	}
	public static void main(String[] args) {
		InteritanceTest obj=new InteritanceTest();
		obj.m1();
		obj.m2();
		System.out.println(obj.marks);
		obj.m3();
		obj.m4();
		System.out.println(obj.salary);
	}

}
