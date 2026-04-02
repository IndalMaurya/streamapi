package com.acintyo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
class User{
	int id;
	String name;
	
	public User(int id, String name) {
		this.id=id;
		this.name=name;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
}
public class ListToMap {
	public static void main(String[] args) {
//		List<String> list = Arrays.asList("Ram", "Shyam", "Mohan");
//		Map<String, Integer> collect = list.stream().collect(Collectors.toMap(name -> name, name -> name.length()));
//
//		System.out.println(collect);
		
		List<User> list = Arrays.asList(new User(1, "Indal"), new User(2, "Abhay"));
		list.stream().collect(Collectors.toMap(u-> u.id, u->u));
		Map<Integer, User> collect = list.stream().collect(Collectors.toMap(u -> u.id, u->u));
		
		System.out.println(list);
		System.out.println(collect);
		
	}
}
