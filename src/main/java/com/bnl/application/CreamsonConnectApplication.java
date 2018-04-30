package com.bnl.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.bnl")
public class CreamsonConnectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreamsonConnectApplication.class, args);
	}
}