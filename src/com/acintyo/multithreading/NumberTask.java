package com.acintyo.multithreading;

public class NumberTask implements Runnable {

	@Override
	public synchronized void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}

	public static void main(String[] args) {
		NumberTask numberTask = new NumberTask();
		Thread t1 = new Thread(numberTask, "Java");
		Thread t2 = new Thread(numberTask, "React");

		t1.start();
		t2.start();

	}
}
