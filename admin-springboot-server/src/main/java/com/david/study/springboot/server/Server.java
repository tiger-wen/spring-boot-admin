package com.david.study.springboot.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import de.codecentric.boot.admin.config.EnableAdminServer;

@EnableEurekaServer
//@EnableAdminServer
@SpringBootApplication
public class Server {
	
	public static void main(String[] args) {
		
		SpringApplication.run(Server.class, args);
	}

}
