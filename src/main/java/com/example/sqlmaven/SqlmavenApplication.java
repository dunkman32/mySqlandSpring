package com.example.sqlmaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.example.sqlmaven")
@SpringBootApplication
public class SqlmavenApplication {

	public static void main(String[] args) {

		SpringApplication.run(SqlmavenApplication.class, args);
	}
}
