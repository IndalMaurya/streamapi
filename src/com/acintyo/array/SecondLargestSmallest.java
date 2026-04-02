package com.acintyo.array;

public class SecondLargestSmallest {
	public static void main(String[] args) {
		int[] arr = { 10, 5, 20, 8, 2 };

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;

		for (int num : arr) {

			if (num > largest) {
				secondLargest = largest;
				largest = num;
			} else if (num > secondLargest && num != largest) {
				secondLargest = num;
			}

			if (num < smallest) {
				secondSmallest = smallest;
				smallest = num;
			} else if (num < secondSmallest && num != smallest) {
				secondSmallest = num;
			}
		}

		System.out.println("Second Largest: " + secondLargest);
		System.out.println("Second Smallest: " + secondSmallest);

	}
}
