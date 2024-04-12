package com.example.pojo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class User {

	@Id
	private String username;
	private String password;
	private String email;
	private String phone;
	private String role;
	private String voteStatus;
	/******************************** this is code of one to one relationship  *************************/
	
//	@OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
//	private Voting vot;
	
	public User() {
		super();
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
//	public Voting getVot() {
//		return vot;
//	}
//	public void setVot(Voting vot) {
//		this.vot = vot;
//	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	public String getVoteStatus() {
		return voteStatus;
	}

	public void setVoteStatus(String voteStatus) {
		this.voteStatus = voteStatus;
	}

	public User(String username, String password, String email, String phone, String role,String voteStatus
			//, Voting vot
			) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.role = role;
		this.voteStatus = voteStatus;
		//this.vot = vot;
	}


	
	
	
}
