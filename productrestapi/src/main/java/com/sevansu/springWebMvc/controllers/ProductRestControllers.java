package com.sevansu.springWebMvc.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sevansu.springWebMvc.entities.Product;
import com.sevansu.springWebMvc.repos.ProductRepository;

@RestController
public class ProductRestControllers {
	@Autowired
	ProductRepository rp;

	@RequestMapping(value = "/products/", method = RequestMethod.GET)
	public List<Product> getPreoducts() {
		return rp.findAll();
	}

	@RequestMapping(value = "/products/{iid}", method = RequestMethod.GET)
	public Product getProduct(@PathVariable("iid") int id) {
		return rp.findById(id).get();
	}

	@RequestMapping(value = "/products/", method = RequestMethod.POST)
	//http://localhost:8080/productapi/products/
	public Product createProduct(@RequestBody Product product) {
		return rp.save(product);
	}

	@RequestMapping(value = "/products/", method = RequestMethod.PUT)
	public Product updateProduct(@RequestBody Product product) {
		return rp.save(product);
	}

	@RequestMapping(value = "/products/{iid}", method = RequestMethod.DELETE)
	void deleteProduct(@PathVariable("iid") int id) {
		rp.deleteById(id);
	}
}
