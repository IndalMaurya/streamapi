package com.acintyo;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};

        // Map: sorted word -> list of anagrams
        Map<String, List<String>> map = new HashMap<>();

        for (String word : words) {
            // Sort the characters in the word
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            // Put into HashMap
            map.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(word);
        }

        // Print grouped anagrams
        System.out.println("Grouped Anagrams: " + new ArrayList<>(map.values()));
    }
}

