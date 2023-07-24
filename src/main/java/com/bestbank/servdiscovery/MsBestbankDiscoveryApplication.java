package com.bestbank.servdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MsBestbankDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsBestbankDiscoveryApplication.class, args);
	}

}
