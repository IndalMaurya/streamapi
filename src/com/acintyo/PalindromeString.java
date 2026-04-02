package com.acintyo;

public class PalindromeString {
	public static void main(String[] args) {
		String str = "madam";
//		String rev=new StringBuilder(str).reverse().toString();
//		System.out.println(str.equals(rev)?"Palindrome":"Not");

//		char [] ch = new char[str.length()];
//		int k =0;
//		for(int i = str.length()-1;i>=0;i--,k++) {
//			ch[k]=str.charAt(i);
//		}
//		
//		System.out.println(ch);

		StringBuilder sb = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		System.out.println(sb.toString().equals(str));
	}
}
