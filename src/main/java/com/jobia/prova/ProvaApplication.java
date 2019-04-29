package com.jobia.prova;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//teste
@SpringBootApplication
@ComponentScan(basePackages = "com.jobia.prova")
public class ProvaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProvaApplication.class, args);
	}

}
