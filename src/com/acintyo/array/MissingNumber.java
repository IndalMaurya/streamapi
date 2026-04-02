package com.acintyo.array;

public class MissingNumber {
	public static void main(String[] args) {
		int[] arr = {1, 2, 4, 5};
		int n = 5;
		int expectedSum = (n*(n+1))/2;
		int totSum=0;
		for(int num: arr) {
			totSum+=num;
		}
		
		System.out.println("Missing number : "+(expectedSum-totSum));
	}
}
