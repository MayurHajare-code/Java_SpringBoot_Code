package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pojo.Voting;
import com.example.repository.VotingRepository;

@Service
public class VotingService {

	@Autowired
	private VotingRepository votRepo;
	
	public Voting addVot(Voting v) {
		return votRepo.save(v);
	}

	public Voting getByName(String name) {
		return votRepo.getByName(name);
	}
	
	
}
