package com.alextim.health.tracker.rest;

import org.springframework.boot.SpringApplication;

public class TestHealthTrackerRestApplication {

	public static void main(String[] args) {
		SpringApplication.from(HealthTrackerRestApplication::main)
				.with(TestcontainersConfiguration.class)
				.run(args);
	}

}
