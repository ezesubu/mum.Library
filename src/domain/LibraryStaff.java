package domain;

import java.util.ArrayList;
import java.util.List;

public class LibraryStaff extends Person {

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	private String userName;
	private String password;
	private String email;
	private List<Role> roles;

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public LibraryStaff(String id, String firstName, String lastName, Address address, String userName, String password,
			String email) {
		super(id, firstName, lastName, address);
		this.userName = userName;
		this.password = password;
		this.email = email;
		roles = new ArrayList<Role>();
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

	@Override
	public String toString() {
		return "LibraryStaff [userName=" + userName + ", password=" + password + ", email=" + email + ", roles=" + roles
				+ "]";
	}

}
