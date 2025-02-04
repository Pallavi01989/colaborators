package com.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MicroServiceEurekaServerApplication {

	public static void main(String[] args) {
		System.out.println("This is Eureka Server");
		
		Syso
		SpringApplication.run(MicroServiceEurekaServerApplication.class, args);
	}

}

