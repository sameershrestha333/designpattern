package com.mvcdemo.model;

import java.util.ArrayList;
import java.util.List;

public class Database {

	private List<Person> personDatabase;

	public Database() {
		this.personDatabase = new ArrayList<>();
	}

	public void addPerson(Person person) {
		this.personDatabase.add(person);
	}

	public void removePerson(Person person) {
		this.personDatabase.remove(person);
	}

	public List<Person> getPrson() {
		return this.personDatabase;
	}

}
