package com.sevansu.springWebMvc.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sevansu.springWebMvc.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	
}
