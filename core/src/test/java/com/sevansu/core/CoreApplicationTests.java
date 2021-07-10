package com.sevansu.core;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sevansu.core.services.PaymentService;
import com.sevansu.core.services.PaymentServicesImpl;

@SpringBootTest
class CoreApplicationTests {

	@Autowired
	PaymentService services;
	
	@Autowired
	PaymentServicesImpl iservices;
	
	@Test
	void testDependencyInjection() {
		assertNotNull(services);
		assertNotNull(iservices.getDao());
	}

}
