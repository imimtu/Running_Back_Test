package org.example.running_test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {
	@GetMapping("/health")
	public String healthCheck() {
		return "Running Backend is up and running!";
	}
}