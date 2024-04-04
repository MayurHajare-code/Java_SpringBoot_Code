package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repo;
	
	public Product addProduct(Product p) {
		return repo.save(p);
	}
	
	public List<Product> findAll()   
	{  
	List<Product> products = new ArrayList<Product>();  
	repo.findAll().forEach(ps -> products.add(ps));
	return products;  
	} 
	
	public Optional<Product> getProductById(Integer id) {
		return repo.findById(id);
	}
	
	public void deleteById(Integer id) {
		 repo.deleteById(id);
	}
	
	public Product updatePro(Product p) {
		return repo.save(p);
	}
	
	public Optional<Product> getProductByName(String name) {
		return repo.findByname(name);
	}

}
