package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pojo.User;
import com.example.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;
	
	public User addUser(User u) {
		return userRepo.save(u);
	}
	
	public List<User> getAllUser() {
		return userRepo.findAll();
	}
}
