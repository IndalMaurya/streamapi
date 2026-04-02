package com.acintyo.multithreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {
	public static void main(String[] args) {
		BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
		// Producer
		new Thread(() -> {
			try {
				queue.put(10);
				System.out.println("Produced : 10");
			} catch (Exception e) {
			}
		}).start();

		// Consumer
		new Thread(() -> {
			try {
				int value = queue.take();
				System.out.println("Consumed : " + value);
			} catch (Exception e) {
			}
		}).start();

	}
}
