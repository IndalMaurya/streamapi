package com.acintyo.string;

public class Palindrome {
	public static void main(String[] args) {
		String str = "madam";
		int right = str.length() - 1;
		boolean flg=false;
		for (int i = 0; i < str.length() / 2; i++,right--) {
			if(str.charAt(i)!=str.charAt(right)) {
				flg=true;
				break;
			}
		}
		if(flg) {
			System.out.println("Not Palindrome");
		}else {
			System.out.println("Palindrome");
		}
	}
}
