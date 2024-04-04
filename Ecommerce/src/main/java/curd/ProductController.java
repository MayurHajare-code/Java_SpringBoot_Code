package curd;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
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
	private ProductService pService;
	
	@PostMapping("/addProductData")
	@ResponseBody
	public Product addProduct(@RequestBody Product p) {
		return pService.addProduct(p);
	}
	
	@PutMapping("/updateProductData")
	@ResponseBody
	public Product updateProduct(@RequestBody Product p) {
		return pService.updateProduct(p);
	}
	
	@DeleteMapping("/deleteProductData/{id}")
	@ResponseBody
	public void deleteProduct(@PathVariable Integer id) {
		pService.deleteProduct(id);
	}

	//@CrossOrigin(origins = "http://localhost:4200/")
	@GetMapping("/getProductData")
	@ResponseBody
	public List<Product> getProduct() {
		return pService.getProduct();
	}
	
	@GetMapping("/getProductData/{id}")
	@ResponseBody
	public Optional<Product> getProductById(@PathVariable Integer id) {
		return pService.getProductById(id);
	}
	
}
