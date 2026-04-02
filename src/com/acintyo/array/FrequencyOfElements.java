package com.acintyo.array;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElements {
	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 3, 1};
		
//		Map<Integer, Integer> map = new HashMap<>();
//		
//		for(int num : arr) {
//			map.put(num, map.getOrDefault(num, 0)+1);
//		}
//		
//		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
//			System.out.println(entry.getKey()+" : "+entry.getValue());
//		}
//		
		
		boolean[] visited = new boolean[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(visited[i]) {
				continue;
			}
			int count = 1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					visited[j]=true;
				}
			}
			System.out.println(arr[i]+" -> "+count);
		}
	}
}
