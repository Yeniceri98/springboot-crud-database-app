package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration		// NOT: @SpringBootApplication anotasyonu bunu da kapsar yani gereksizdir fakat eklemeyince Controller classında injection yaparken hata veriyor
public class ThymeleafSpringDataJpaCrudDatabaseAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThymeleafSpringDataJpaCrudDatabaseAppApplication.class, args);
	}

}
