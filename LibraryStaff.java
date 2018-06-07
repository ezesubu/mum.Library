package Library;

public class LibraryStaff extends Person{
	
	private String userName;
	private String password;
	private String email;
	
	public LibraryStaff(String id, String firstName, String lastName, Address address, String userName,
			String password, String email) {
		super(id, firstName, lastName, address);
		this.userName = userName;
		this.password = password;
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	

	public String getEmail() {
		return email;
	}
	
	public Boolean login() {
		return false;
	}

}
