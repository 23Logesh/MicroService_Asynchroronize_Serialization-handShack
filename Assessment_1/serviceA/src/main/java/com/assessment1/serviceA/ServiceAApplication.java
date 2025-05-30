package com.assessment1.serviceA;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ServiceAApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceAApplication.class, args);
	}
	
	
	@Bean
	RestTemplate restTemplate() {
	    return new RestTemplate();
	}
	
	@Bean
	ModelMapper modelMapper() {
		
		return new ModelMapper();

	}

}
