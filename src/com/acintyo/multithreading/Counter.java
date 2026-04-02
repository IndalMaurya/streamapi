package com.acintyo.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
	private AtomicInteger counter = new AtomicInteger();
	
	public void increment() {
		counter.incrementAndGet();
	}
	
	public int getValue() {
		return counter.get();
	}
	public static void main(String[] args) {
		Counter c = new Counter();
		c.increment();
		System.out.println(c.getValue());
	}
}
