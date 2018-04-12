package com.nd.social.forexservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(value = {"controller"})
@EnableJpaRepositories(basePackages = "repository")
@EntityScan(value = "domain")
public class ForexserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForexserviceApplication.class, args);
	}
}
