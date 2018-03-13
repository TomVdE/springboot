package com.example.shippingservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ShippingserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShippingserviceApplication.class, args);
	}
}

@RestController
class ShippingCostsController {
	@Value("${shipping.cost}")
	private double shippingCosts;

	@GetMapping("shipping-costs")
	public double getShippingCosts() {
		return shippingCosts;
	}
}
