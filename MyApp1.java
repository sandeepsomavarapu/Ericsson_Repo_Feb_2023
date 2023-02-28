package com.ericcson.threads;

public class MyApp1 extends Thread {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());//main
		System.out.println(Thread.currentThread().getPriority());//5
		Thread.currentThread().setName("sandeep's");
		Thread.currentThread().setPriority(10);
		System.out.println(Thread.currentThread().getName());//main
		System.out.println(Thread.currentThread().getPriority());//5
		for (int i = 0; i < 10; i++) {//1-10
			System.out.println("child thread");//5,thread-0 extended from parent
		}
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());//main
		System.out.println(Thread.currentThread().getPriority());//5
		Thread.currentThread().setName("ericcson");
		Thread.currentThread().setPriority(1);
		System.out.println(Thread.currentThread().getName());//main
		System.out.println(Thread.currentThread().getPriority());//5
		MyApp1 app = new MyApp1();
		app.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");//5,main
		}
	}

}
