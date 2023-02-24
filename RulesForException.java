package com.ericcson.exceptions;

import java.io.IOException;

class A {
	protected  Object add(String a, String b) 
	{
		int c = Integer.parseInt(a) + Integer.parseInt(b);
		System.out.println("Add of two numbers :" + c);
		return null;
	}
	public void sub(String a, String b) throws IOException {
		int c = Integer.parseInt(a) - Integer.parseInt(b);
		System.out.println("sub of two numbers " + c);
	}
}
public class RulesForException extends A {
	@Override
	public  Integer add(String a, String b) throws ArithmeticException {
		int c = Integer.parseInt(a) + Integer.parseInt(b);
		System.out.println("Addition of two numbers :" + c);//Covairent return type
		return null;
	}
	@Override
	public void sub(String a, String b) throws ArithmeticException   {
		int c = Integer.parseInt(a) - Integer.parseInt(b);
		System.out.println("subtraction of two numbers :" + c);
	}

	public static void main(String[] args) throws Exception {
		RulesForException re = new RulesForException();
		re.add("12", "13");
		re.sub("11", "12");
	}
}
