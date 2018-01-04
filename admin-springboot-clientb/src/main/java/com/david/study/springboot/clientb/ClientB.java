package com.david.study.springboot.clientb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import de.codecentric.boot.admin.config.EnableAdminServer;

@EnableDiscoveryClient
//@EnableAdminServer
@SpringBootApplication
@RestController
public class ClientB {

	@GetMapping("/")
	public String name() {
		return "B";
	}
	public static void main(String[] args) {
		SpringApplication.run(ClientB.class, args);
	}

}
