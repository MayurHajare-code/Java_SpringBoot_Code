package com.example;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	public Optional<Product> findByname(String name);
	
	//public List<Product> findAll();
	
	
}
