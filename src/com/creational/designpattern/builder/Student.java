package com.creational.designpattern.builder;

public class Student {

	private String name;
	private String email;
	private String address;
	private int age;
	private String university;
	
	
	/**
	 * we know that this builder is going to store all the information
	 * concerning the student so.
	 * @param builder
	 */
	public Student(Builder builder) {
		this.name = builder.name;
		this.email = builder.email;
		this.address = builder.address;
		this.age = builder.age;
		this.university=builder.university;

	}

	/**
	 * static inner class build the student object for us
	 * 
	 */
	public static class Builder {
		// compulsory member
		private final String name;
		private final String email;
		private String address;
		private int age;
		private String university;

		public Builder(String name, String email) {
			super();
			this.name = name;
			this.email = email;
		}

		public Builder setAddress(String address) {
			this.address = address;
			return this;
		}

		public Builder setAge(int age) {
			this.age = age;
			return this;
		}

		public Builder setUniversity(String university) {
			this.university = university;
			return this;
		}

		// since inner class will build the student object
		public Student build() {
			return new Student(this);
		}

	}// end of static inner class

	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", address=" + address + ", age=" + age + ", university="
				+ university + "]";
	}
	
	
}
