package com.acintyo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class VowelConsonantCount {
	public static void main(String[] args) {
		String str = "Hello World";
		str = str.toLowerCase(); // convert to lowercase for uniformity

		/*int vowels = 0, consonants = 0;
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
		
			if (ch >= 'a' && ch <= 'z') { // check only alphabets
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowels++;
				} else {
					consonants++;
				}
			}
		}
		
		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonants);*/

		/*long vowels = str.chars().filter(ch -> "aeiou".indexOf(ch) != -1).count();
		long consonants = str.chars().filter(Character::isLetter).filter(ch -> "aeiou".indexOf(ch) == -1).count();
		
		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonants);*/

		Set<Character> vowelSet = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
		int vowels = 0, consonants = 0;

		for (char ch : str.toCharArray()) {
			if (Character.isLetter(ch)) {
				if (vowelSet.contains(ch)) {
					vowels++;
				} else {
					consonants++;
				}
			}
		}
		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonants);
	}
}
