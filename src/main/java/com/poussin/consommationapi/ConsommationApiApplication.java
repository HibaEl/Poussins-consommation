package com.poussin.consommationapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.poussin.consommation.rest")
public class ConsommationApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsommationApiApplication.class, args);
	}

}

