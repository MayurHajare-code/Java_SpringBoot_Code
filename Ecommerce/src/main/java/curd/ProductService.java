package curd;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	@Autowired
	public ProductRepository repo;
	
	public Product addProduct(Product p) {
		return repo.save(p);
	}
	
	public Product updateProduct(Product p) {
		return repo.save(p);
	}
	
	public void deleteProduct(Integer id) {
		repo.deleteById(id);
	}
	
	public List<Product> getProduct() {
		List<Product> products = new ArrayList<Product>();
		repo.findAll().forEach(p -> products.add(p) );
		return products;
	}
	
	public Optional<Product> getProductById(Integer id) {
		return repo.findById(id);
	}
}
