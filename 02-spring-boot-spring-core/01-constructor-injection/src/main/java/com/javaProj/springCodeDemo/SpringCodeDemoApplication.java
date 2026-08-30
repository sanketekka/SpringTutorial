package com.javaProj.springCodeDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCodeDemoApplication {

	/* Bootstrap the Spring Boot app. Create app context, register all beans
	start embedded Tommy server etc*/
	public static void main(String[] args) {
		SpringApplication.run(SpringCodeDemoApplication.class, args);
	}

}
