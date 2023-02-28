package com.ericcson.threads;

public class MyApp implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread created ...");
		}
	}

	public static void main(String[] args) {
		MyApp app = new MyApp();
		Thread th = new Thread(app);
		th.start();//run() 
	}

}
