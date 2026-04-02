package com.acintyo;

public class StringOccurance2 {
	public static void main(String[] args) {
		String str = "aabttttccccc";

		StringBuilder sb = new StringBuilder();
		int count = 1;
		for (int i = 0; i < str.length()-1; i++) {
			if(str.charAt(i)==str.charAt(i+1)) {
				count++;
			}else {
				sb.append(str.charAt(i)).append(count);
				 count = 1;
			}
		}
		System.out.println(sb.append(str.charAt(str.length()-1)).append(count));
	}
}
