package com.acintyo;

import java.util.Arrays;

public class ReverseWords {
	public static void main(String[] args) {
		String str = "I love Java";
		//Java love I
		
		String[] split = str.split("\\s+");
		
		System.out.println(Arrays.toString(split));
		
		String s = "";
		
		for(int i=split.length-1;i>=0;i--) {
			s+=split[i]+" ";
		}
		System.out.println(s);
	}
}
