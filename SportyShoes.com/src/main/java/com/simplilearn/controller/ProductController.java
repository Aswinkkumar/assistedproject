package com.simplilearn.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.model.Product;
import com.simplilearn.repository.ProductRepository;

@RestController
@RequestMapping("products")
public class ProductController {
	@Autowired
	ProductRepository productRepository;
	
	@GetMapping("all")
	public List<Product> getAllProducts() {
		List<Product> products = (List<Product>) productRepository.findAll();
		return products;
	}
	
	@PostMapping("add")
	public Product addProduct(@RequestBody Product product) {
		return productRepository.save(product);
	}
	
	@GetMapping("product1/{id}")
	public Optional<Product> getProductById(@PathVariable int id) {
		return productRepository.findById(id);
	}
	
	@GetMapping("product2/{season}")
	public Optional<Product> getProductBySeason(@PathVariable String season) {
		return productRepository.getProductBySeason(season);
	}
	
	@GetMapping("product3/{brand}")
	public Optional<Product> getProductByBrand(@PathVariable String brand) {
		return productRepository.getProductByBrand(brand);
	}
	
	@GetMapping("product4/{category}")
	public Optional<Product> getProductByCategory(@PathVariable String category) {
		return productRepository.getProductByCategory(category);
	}
	
	@GetMapping("product5/{price}")
	public Optional<Product> getProductByPrice(@PathVariable int price) {
		return productRepository.getProductByPrice(price);
	}
	
	@GetMapping("product6/{color}")
	public Optional<Product> getProductByColor(@PathVariable String color) {
		return productRepository.getProductByColor(color);
	}
	
	@GetMapping("product7/{created_date}")
	public Optional<Product> getProductByCreatedDate(@PathVariable String created_date) {
		return productRepository.getProductByCreatedDate(created_date);
	}
	
	@PutMapping("product/update/{id}")
	public Product updateProduct(@RequestBody Product product) {
		return productRepository.save(product);
	}
	
	@DeleteMapping("product/delete/{id}")
	public void deleteProduct(@PathVariable int id) {
		productRepository.deleteById(id);
	}
}