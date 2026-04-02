package com.acintyo.multithreading;

public class ReverseString implements Runnable {

	private String str;
	public ReverseString(String string) {
		str=string;
	}
	
	@Override
	public void run() {
	//	String reversed = new StringBuilder(str).reverse().toString();
		System.out.println(str.toUpperCase());
	}

	public static void main(String[] args) {
		Thread t = new Thread(new ReverseString("Java"));
		t.start();
	}
}
