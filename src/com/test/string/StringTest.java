package com.test.string;

public class StringTest {

	public static void main(String[] args) {
		String username="Sameer";
		username.concat(" Shreshta");
		System.out.println(username);
		
		StringBuffer newUserName=new StringBuffer("Sameer");
		newUserName.append(" Shrestha");
		System.out.println(newUserName);
		
	}

}
