package com.ericcson.exceptions;

public class PropagationEx {
	void method3() 
	{
		int result = 100 / 0; // Exception Gere
	}
	void method2() 
	{
		method3();
	}
	void method1() 
	{
		try {
			method2();
		} catch (Exception e) {
			System.out.println("Exception is handled here");
		}
	}
	public static void main(String args[]) 
	{
		PropagationEx obj = new PropagationEx();
		obj.method1();
		System.out.println("Continue with Normal Flow...");
	}
}
//only for unchecked Exception,not for checked exception 
//You must remember one rule of thumb that – “Checked Exceptions are not propagated in the chain“.