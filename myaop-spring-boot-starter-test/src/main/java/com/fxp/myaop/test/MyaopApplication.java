package com.fxp.myaop.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.fxp.myaop.spring.boot.autoconfigure","com.fxp.myaop.test"})
public class MyaopApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyaopApplication.class, args);
	}
}
