package com.clairclarke.bean;

import java.util.Date;


import org.springframework.format.annotation.DateTimeFormat;

public class User {

	int idUser;
	String username;
	String password;
	String firstName;
	String lastName;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	Date birth;
	String status;
	
	public User() {
	}

	User(int idUser, String username, String password, String firstName, String lastName, Date birth, String status) {
		super();
		this.idUser = idUser;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birth = birth;
		this.status = status;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firsName) {
		this.firstName = firsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	

	@Override
	public String toString() {
		return String.format(
				"User [idUser=%s, username=%s, password=%s, firstName=%s, lastName=%s, birth=%s, status=%s]", idUser,
				username, password, firstName, lastName, birth, status);
	}

	

}
