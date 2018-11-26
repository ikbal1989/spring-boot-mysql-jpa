package com.tutorial.springbootmysqlmavenhibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.tutorial.springbootmysqlmavenhibernate.repository")
@SpringBootApplication
public class SpringBootMysqlMavenHibernateApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootMysqlMavenHibernateApplication.class, args);
	}
}
