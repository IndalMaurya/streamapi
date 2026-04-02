package com.acintyo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicate {
	public static void main(String[] args) {
		List<Integer> list = List.of(10,20,30,10,40,20,50);
		
		List<Integer> newList = new ArrayList<>(new HashSet<>(list));
		System.out.println(newList);
		newList.stream().sorted((a,b)->a-b).forEach(System.out::println);
	}
}
