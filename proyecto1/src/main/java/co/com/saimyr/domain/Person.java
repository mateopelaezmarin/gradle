package co.com.saimyr.domain;

public class Person {
	private String name;
	private String lastName;
	public Person(String name,String lastname){
		this.name=name;
		this.lastName=lastname;
	}
	public String getName() {
		return name;
	}
	
	public String getLastName() {
		return lastName;
	}
}
