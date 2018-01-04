package com.david.study.springboot.msd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Dashborad {

	public static void main(String[] args) {
		SpringApplication.run(Dashborad.class, args);
	}

}
