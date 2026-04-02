package com.acintyo;

public class MissingNumber {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,8};
		int arrSum=0;
		for(int i=0;i<arr.length;i++) {
			arrSum+=arr[i];
		}
		int n = arr.length+1;
		//int n=10;
		int sum = n*(n+1)/2;
		System.out.println(sum-arrSum);
	
	
	
	
	}
}
