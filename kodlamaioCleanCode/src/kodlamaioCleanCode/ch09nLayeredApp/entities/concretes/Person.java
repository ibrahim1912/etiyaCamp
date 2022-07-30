package kodlamaioCleanCode.ch09nLayeredApp.entities.concretes;

import kodlamaioCleanCode.ch09nLayeredApp.entities.abstracts.Entity;

public class Person implements Entity{
	int id;
	String firstName;
	String lastName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
