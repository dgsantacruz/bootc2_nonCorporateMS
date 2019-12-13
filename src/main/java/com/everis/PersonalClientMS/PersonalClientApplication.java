package com.everis.PersonalClientMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PersonalClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalClientApplication.class, args);
	}

}
