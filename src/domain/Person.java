package domain;

public class Person {
	private String id;
	private String firstName;
	private String lastName;
	private Address address;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String id, String firstName, String lastName, Address address) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	
	public Address getAddress() {
		return address;
	}
	
	
}
