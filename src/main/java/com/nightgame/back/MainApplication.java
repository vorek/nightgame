package com.nightgame.back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nightgame.cofig.JpaConfig;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		SpringApplication.run(new Class<?>[] {MainApplication.class, JpaConfig.class}, args);
	}
}
