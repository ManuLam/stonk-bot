package com.example.stonk_bot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class StonkBotApplication {

	public static void main(String[] args) {
		SpringApplication.run(StonkBotApplication.class, args);
	}

}
