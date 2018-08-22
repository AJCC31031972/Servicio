package org.cjava.eurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class TestcjavaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestcjavaServiceApplication.class, args);
	}
}
