package com.acintyo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class VowelConsonantCount2 {
	public static void main(String[] args) {
		String str = "Hello World";
		str = str.toLowerCase(); 
		
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
		System.out.println("_______________________________________");
		long vowels1 = str.chars().filter(ch -> "aeiou".indexOf(ch)!=-1).count();
		long consonants1 = str.chars().filter(Character::isLetter).filter(ch -> "aeiou".indexOf(ch)==-1).count();
		System.out.println("Vowels: " + vowels1);
		System.out.println("Consonants: " + consonants1);
	}
}
