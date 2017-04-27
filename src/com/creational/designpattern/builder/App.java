package com.creational.designpattern.builder;

public class App {

	public static void main(String[] args) {

		Student student=new Student.Builder("Sameer", "sameer@gmail.com").setAddress("Iowa")
				.setAge(27).setUniversity("Maharishi University").build();
		System.out.println(student);
		
		
		
	}

}
