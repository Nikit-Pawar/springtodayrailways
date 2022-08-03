package com.cdac.springtodayrailways;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"com.cdac.springtodayrailways.controller",
		"com.cdac.springtodayrailways.dto",
		"com.cdac.springtodayrailways.entity",
		"com.cdac.springtodayrailways.repository"})
public class SpringtodayrailwaysApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringtodayrailwaysApplication.class, args);
	}

}
