package com.acc.model;

public class User {
	String firstname;
	String lastname;
	String uname;
	String address;
	String password;
	String contact;
	
	public User() {
		
	}

	public User(String firstname, String lastname, String uname, String address, String password, String contact) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.uname = uname;
		this.password = password;
		this.address = address;
		this.contact = contact;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "User [firstname=" + firstname + ", lastname=" + lastname + ", uname=" + uname + 
				", password=" + password + ", address=" + address+", contact=" + contact + "]";
	}

	
}
