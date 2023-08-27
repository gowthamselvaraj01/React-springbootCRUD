package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EntityScan({"com.example.model"})
@ComponentScan({"com.example.Controller","com.example.demo"})
@EnableJpaRepositories("com.example.dao")

public class SpringBootJpaMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaMysqlApplication.class, args);
		
	}
	
	/*
	 * @Configuration
	 * 
	 * @EnableWebMvc public class WebConfig implements WebMvcConfigurer {
	 * 
	 * @Override public void addCorsMappings(CorsRegistry registry) {
	 * registry.addMapping("/**"); } }
	 */
	 

}
