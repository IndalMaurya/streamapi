package com.acintyo.string;

public class ReverseString2 {

	public static void main(String[] args) {
		String name = "Indal";

		char[] array = name.toCharArray();
//		int start = 0;
//		int end = name.length()-1;
//		
//		for(int i=end; i>=0 ;i--) {
//			array[start++] = name.charAt(i);
//		}
//		System.out.println(new String(array));

		int left = 0;
		int right = name.length() - 1;

		while (left < right) {
			char temp = array[left];
			array[left] = array[right];
			array[right] = temp;

			left++;
			right--;
		}
		System.out.println(new String(array));
	}

}
