package com.david.study.springboot.clienta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
//@EnableAdminServer
@SpringBootApplication
@RestController
public class ClientA {

	@GetMapping("/")
	public String name() {
		return "a";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ClientA.class, args);
	}
}
