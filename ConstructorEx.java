package com.ericcson.oops;

public class ConstructorEx {
	float value=23232.12123f;
	 float value1=2321.43202020f;
	public ConstructorEx() {
		System.out.println("am from default constructor");
	}

	ConstructorEx(String orgName) {
		System.out.println("am from param constructor " + orgName);
	}

	public strictfp void speakUp() {
		System.out.println("Speaking......");
	}

	public void speakUp(String name) {
		System.out.println("Speaking......mr :" + name);
	}

	public static void main(String[] args) {
		ConstructorEx obj = new ConstructorEx("ericcson");// calling the constructor
		obj.speakUp("mahesh");
	}

}
