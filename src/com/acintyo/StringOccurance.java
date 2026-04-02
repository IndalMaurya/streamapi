package com.acintyo;

public class StringOccurance {
	public static void main(String[] args) {
		String str = "aabttttccccc";
//		Map<Character, Integer> map = new HashMap<>();
//		for (char ch : str.toCharArray()) {
//			map.put(ch, map.getOrDefault(ch, 0) + 1);
//		}
//
//		System.out.println(map.toString());
//

		StringBuilder sb = new StringBuilder();
		int count = 1;
		for (int i = 1; i <= str.length(); i++) {
			
			if (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
				count++;
			} else {
				sb.append(str.charAt(i-1)).append(count);
				count = 1;
			}
		}
		System.out.println(sb.toString());

//		StringBuilder sb = new StringBuilder();
//		int count = 1;
//		for (int i = 1; i <= str.length(); i++) {
//			if(i<str.length() && str.charAt(i) == str.charAt(i - 1)) {
//				count++;
//			}else {
//				sb.append(str.charAt(i-1)).append(count);
//				count = 1;
//			}
//		}
//		System.out.println(sb);
		
		
		
		
	}
}
