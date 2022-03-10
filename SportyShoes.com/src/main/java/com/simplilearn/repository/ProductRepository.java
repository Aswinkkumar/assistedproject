package com.simplilearn.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.simplilearn.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {
	@Query(value = "SELECT * FROM product WHERE season = :season", nativeQuery = true)
	public Optional<Product> getProductBySeason(@Param("season") String season);
	
	@Query(value = "SELECT * FROM product WHERE brand = :brand", nativeQuery = true)
	public Optional<Product> getProductByBrand(@Param("brand") String brand);
	
	@Query(value = "SELECT * FROM product WHERE category = :category", nativeQuery = true)
	public Optional<Product> getProductByCategory(@Param("category") String category);
	
	@Query(value = "SELECT * FROM product WHERE price = :price", nativeQuery = true)
	public Optional<Product> getProductByPrice(@Param("price") int price);
	
	@Query(value = "SELECT * FROM product WHERE color = :color", nativeQuery = true)
	public Optional<Product> getProductByColor(@Param("color") String color);
	
	@Query(value = "SELECT * FROM product WHERE created_date = :created_date", nativeQuery = true)
	public Optional<Product> getProductByCreatedDate(@Param("created_date") String created_date);
}