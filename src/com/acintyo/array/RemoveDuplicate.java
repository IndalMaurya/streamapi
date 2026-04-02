package com.acintyo.array;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 3, 4, 2, 4 ,1};
		int[] temp = new int[arr.length];
		int size = 0;

		for (int i = 0; i < arr.length; i++) {
			boolean isDuplicate = false;

			for (int j = 0; j < size; j++) {
				if (arr[i] == temp[j]) {
					isDuplicate = true;
					break;
				}
			}

			if (!isDuplicate) {
				temp[size++] = arr[i];
			}
		}
		for (int i = 0; i < size; i++) {
			System.out.println(temp[i]);
		}
	}
}
