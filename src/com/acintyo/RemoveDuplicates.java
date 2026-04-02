package com.acintyo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicates {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("apple");
		list.add("banana");
		list.add("apple");
		list.add("orange");
		list.add("banana");
		list.add("grape");

//		List<String> newList = new ArrayList<>(new HashSet<>(list));
//		System.out.println(newList);
		
//		List<String> list2 = list.stream().distinct().toList();
//		System.out.println(list2);
		
		List<String> uniqueList = new ArrayList<>();
		for (String item : list) {
		    if (!uniqueList.contains(item)) {
		        uniqueList.add(item);
		    }
		}

		System.out.println(uniqueList);
	}
}
