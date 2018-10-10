package com.demo.java8;

public class TestLambda {

	public static void main(String[] args) {

		Runnable r=() -> System.out.println("This is it");
		
		Thread t1 = new Thread(r);
		t1.start();

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {

				try {
					System.out.println(i);

					Thread.sleep(1000);
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
			}
		});
		t2.start();

	}

}
