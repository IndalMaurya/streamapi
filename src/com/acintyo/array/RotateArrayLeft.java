package com.acintyo.array;

import java.util.Arrays;

public class RotateArrayLeft {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int k = 2;
		int n = arr.length;
		k = k % n;

		for (int i = 0; i < k; i++) {
			int first = arr[0];
			for (int j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[n - 1] = first;
		}

		System.out.println(Arrays.toString(arr));

	}
}
