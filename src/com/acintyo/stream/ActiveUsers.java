package com.acintyo.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class User1 {
    String name;
    String email;
    boolean active;

    User1(String name, String email, boolean active) {
        this.name = name;
        this.email = email;
        this.active = active;
    }

	@Override
	public String toString() {
		return "User1 [name=" + name + ", email=" + email + ", active=" + active + "]";
	}
    
    
}
public class ActiveUsers {
	public static void main(String[] args) {
		 List<User1> users = Arrays.asList(
	             new User1("A", "a@mail.com", true),
	             new User1("C", "c@mail.com", false),
	             new User1("B", "b@mail.com", true)
	     );
	
		 List<String> emails = users.stream().filter(u ->u.active)
				 .sorted(Comparator.comparing(u-> u.name))
				 .map(u-> u.email)
				 .collect(Collectors.toList());
				 
				 System.out.println(emails);
	}
}
