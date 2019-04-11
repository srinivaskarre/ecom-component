package com.skarre.ecom.ecomcomponent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.skarre.*")
public class EcomComponentApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcomComponentApplication.class, args);
	}
}
