package com.acintyo.array;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateNumber {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2, 4, 1 };

//		for (int i = 0; i < arr.length; i++) {
//			boolean isDuplicate = false;
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] == arr[j]) {
//					isDuplicate = true;
//					break;
//				}
//			}
//			if (isDuplicate) {
//				boolean alreadyPrinted = false;
//				for (int k = 0; k < i; k++) {
//					if (arr[k] == arr[i]) {
//						alreadyPrinted = true;
//						break;
//					}
//				}
//				if (!alreadyPrinted) {
//					System.out.print(arr[i] + " ");
//				}
//			}
//		}
		
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], map.getOrDefault(arr[i],0)+1);
		}
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			 System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
	}
}
