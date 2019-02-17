package com.training.bean;

public class SelectuserBean_TC081 {
	private String firstname;
	private String lastname;
	private String login;


	public SelectuserBean_TC081() {
	}

	public SelectuserBean_TC081(String firstname, String lastname, String login) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.login = login;
	}

	public String getFirstName() {
		return firstname;
	}

	public void setFirstName(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastname;
	}

	public void setLastName(String lastname) {
		this.lastname = lastname;
	}
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
	
	@Override
	public String toString() {
		return "SelectuserBean [firstname=" + firstname + ", lastname=" + lastname + ", login=" + login + "]";
	}

}
