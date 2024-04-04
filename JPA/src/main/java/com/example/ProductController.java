package com.example;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ProductController {
	@Autowired
	private ProductService service;
	 
	@PostMapping("/addProduct")
	@ResponseBody
	public Product addProduct(@RequestBody Product p) {
		return service.addProduct(p);
	}
	
	
	@GetMapping(value = "/getProduct")
	@ResponseBody
	public List<Product> getprodcuct()
	{
		return service.findAll();
	}
	
	
	@GetMapping("/getProduct/{id}")
	@ResponseBody
	public Optional<Product> getProductById(@PathVariable Integer id) {
		return service.getProductById(id);
	}
	
	
	@DeleteMapping("/deleteProduct/{id}")
	@ResponseBody
	public void deleteProduct(@PathVariable Integer id) {
		service.deleteById(id);
	}
	
	@PutMapping("/updateProduct")
	@ResponseBody
	public Product updateProduct(@RequestBody Product p) {
		return service.updatePro(p);
	}
	
	
	@GetMapping("/getProductName/{name}")
	@ResponseBody
	public Optional<Product> getProductName(@PathVariable String name) {
		return service.getProductByName(name);
	}
	
	
}
