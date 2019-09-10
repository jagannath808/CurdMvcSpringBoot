package com.SpringMvc.UsingBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.SpringMvc.UsingBoot.controller")
public class SpringMvcUsingBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcUsingBootApplication.class, args);
	}

}
