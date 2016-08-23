package com.egen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class EgenChallengeApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(EgenChallengeApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(EgenChallengeApplication.class);
	}
}
