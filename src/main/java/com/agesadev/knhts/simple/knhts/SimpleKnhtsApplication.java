package com.agesadev.knhts.simple.knhts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SimpleKnhtsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleKnhtsApplication.class, args);
	}

}
