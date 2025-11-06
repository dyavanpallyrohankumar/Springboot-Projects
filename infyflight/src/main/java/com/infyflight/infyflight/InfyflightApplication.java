package com.infyflight.infyflight;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.infyflight.infyflight",
		"com.infyflight.repository",
		"com.infyflight.services",
		"com.infyflight.controllers", "com.infyflight.DAO", "com.infyflight.interfaces" })
public class InfyflightApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfyflightApplication.class, args);
	}

}
