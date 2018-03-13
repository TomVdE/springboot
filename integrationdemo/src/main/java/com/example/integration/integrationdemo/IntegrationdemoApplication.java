package com.example.integration.integrationdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.integration.config.EnableIntegrationManagement;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;

@SpringBootApplication
@EnableIntegrationManagement
public class IntegrationdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntegrationdemoApplication.class, args);
	}

	@Bean
	public IntegrationFlow flow() {
		IntegrationFlows.from(
				Htt ttp.inboundGateway("/receiveGateway")
					.requestMapping())

		return null;
	}
}
