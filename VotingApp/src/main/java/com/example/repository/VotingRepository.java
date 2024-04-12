package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.pojo.Voting;

@Repository
public interface VotingRepository extends JpaRepository<Voting, Integer> {
	
//		@Query("SELECT COUNT(v.count) as count FROM Voting v GROUP BY v.name")
//		List<Object[]> countVotesByName();
		
		public Voting getByName(String name);

}
