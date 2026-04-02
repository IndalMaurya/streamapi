package com.acintyo;

import java.util.HashSet;
import java.util.Set;

public class PairSum2 {
	public static void main(String[] args) {
		int[] arr = { 1, 5, 7, -1, 5 };
		int target = 6;
		findPairs(arr, target);
	}

	private static void findPairs(int[] arr, int target) {
		Set<Integer> set = new HashSet<>();
		for(int num : arr) {
			int complements = target-num;
			if(set.contains(complements)) {
				System.out.println("("+complements+", "+num+")");
			}
			set.add(num);
		}

	}
}
