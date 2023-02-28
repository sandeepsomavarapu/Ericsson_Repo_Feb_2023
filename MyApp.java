package com.ericcson.threads;

public class MyApp implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println("child thread ...");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		MyApp app = new MyApp();
		Thread th = new Thread(app);// start
		th.start();// run() runnable-->ready run
		th.join();
		for (int i = 0; i < 5; i++) {

			System.out.println("main thread ...");
		}
	}
	// waiting
} // | sleep,yield,wait...
//Initial--->runnable-->running --->dead/end
// run()
