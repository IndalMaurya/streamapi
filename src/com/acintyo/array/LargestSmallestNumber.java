package com.acintyo.array;

public class LargestSmallestNumber {
	public static void main(String[] args) {
		int[] arr = { 5, 2, 9, 1, 7 };
		int largest = arr[0];
		int smallest = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
			if(arr[i]<smallest) {
				smallest=arr[i];
			}
		}
		
		System.out.println("Largest Number : "+largest);
		System.out.println("Smallest Number : "+smallest);
	}
}
