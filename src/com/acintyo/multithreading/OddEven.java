package com.acintyo.multithreading;

class PrintNumber {
	private int number = 1;

	public synchronized void printOdd() throws InterruptedException {
		while (number <= 10) {
			if (number % 2 == 0) {
				wait();
			}
			System.out.println("Odd: " + number++);
			notify();
		}
	}

	public synchronized void printEven() throws InterruptedException {
		while (number <= 10) {
			if (number % 2 != 0) {
				wait();
			}
			System.out.println("Even: " + number++);
			notify();
		}

	}
}

public class OddEven {
	public static void main(String[] args) {
		PrintNumber pn = new PrintNumber();
		new Thread(() -> {
			try {
				pn.printOdd();
			} catch (Exception e) {
			}
		}).start();

		new Thread(() -> {
			try {
				pn.printEven();
			} catch (Exception e) {
			}
		}).start();

	}
}
