package com.acintyo.array;

import java.util.Stack;

public class ValidParentheses {
	public static void main(String[] args) {
		String input = "()[]{}";
		// String input = "({[]})";
		System.out.println("Valid: " + isValid(input));
	}

	private static boolean isValid(String s) {

		Stack<Character> stack = new Stack<>();

		for (char c : s.toCharArray()) {
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else {
				if (stack.isEmpty()) {
					return false;
				}
				char top = stack.pop();
				System.out.println(c + ":" + top);
				if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

}
