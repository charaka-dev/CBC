package com.cbc.commonwebform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.cbc.commonwebform"})
public class CommonWebFormApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommonWebFormApplication.class, args);
	}

}
