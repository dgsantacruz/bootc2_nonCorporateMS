package com.everis.noncorporate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class NoncorporateApplication {

	public static void main(String[] args) {
		SpringApplication.run(NoncorporateApplication.class, args);
	}

}
