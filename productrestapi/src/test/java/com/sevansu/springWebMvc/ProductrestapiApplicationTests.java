package com.sevansu.springWebMvc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import com.sevansu.springWebMvc.controllers.ProductRestControllers;
import com.sevansu.springWebMvc.entities.Product;


@SpringBootTest
class ProductrestapiApplicationTests {
	
	//private final Logger logger = LoggerFactory.getLogger(ProductRestControllers.class);

	@Test
	void testGetProduct() {
		//TestCase or REST Client
		RestTemplate rt=new RestTemplate();
		Product p = rt.getForObject("http://localhost:8080/productapi/products/1", Product.class);
		assertNotNull(p);
		assertEquals("iphone",p.getName());
	}
	
	@Test
	void testCreateProduct() {
		//TestCase or REST Client
		RestTemplate rtt=new RestTemplate();
		Product product=new Product();
		product.setName("Samsung Galaxy");
		product.setDescription("It's very good");
		product.setPrice(500);
		Product np = rtt.postForObject("http://localhost:8080/productapi/products/",product, Product.class);
		assertNotNull(np);
		assertNotNull(np.getId());
		assertEquals("Samsung Galaxy",np.getName());
	}
	@Test
	void testUpdateProduct() {
		//TestCase or REST Client
		RestTemplate rt=new RestTemplate();
		Product p = rt.getForObject("http://localhost:8080/productapi/products/1", Product.class);
		p.setPrice(1400);
		rt.put("http://localhost:8080/productapi/products/",p);
	}
}
