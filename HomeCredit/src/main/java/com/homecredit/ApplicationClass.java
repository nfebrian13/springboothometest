package com.homecredit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * @author Nana Febriana
 */

@SpringBootApplication
@EnableJpaAuditing
public class ApplicationClass {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationClass.class, args);
	}
}
