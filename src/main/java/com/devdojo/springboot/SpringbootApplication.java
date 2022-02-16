package com.devdojo.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class SpringbootApplication {
	public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
	}
}
