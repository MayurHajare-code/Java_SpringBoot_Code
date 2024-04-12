package com.example.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Voting {
	@Id
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private Long count;
	
	/******************************** this is code of one to one relationship  *************************/
	
//	@OneToOne
//	@JoinColumn(name="user_name")
//	private User user;
	
	public Voting() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getCount() {
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}

	public Voting(int id, String name, Long count
			//, User user
			) {
		super();
		this.id = id;
		this.name = name;
		this.count = count;
		//this.user = user;
	}
	
}
