package com.ericcson.java8;

interface Demo {
	int addOfTwo(int a, int b);

	default void subOfTwo(int a, int b) {
	};

	static void mulOfTwo(int a, int b) {
	};
}

public class FiDemo implements Demo {

	public static void main(String[] args) {

	}

	@Override
	public void subOfTwo(int a, int b) {

	}

	@Override
	public int addOfTwo(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
}
