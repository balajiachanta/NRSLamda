package com.bala.NRSLamda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

/**
 * @author Balaji Achanta
 */
@SpringBootApplication
public class NrsLamdaApplication {

	public static void main(String[] args) {
		SpringApplication.run(NrsLamdaApplication.class, args);
	}

	@Bean
	public Function<String, String> addHello() {
		//curl localhost:8080/addHello -H "Content-Type: text/plain" -d "balu"
		return s -> s.concat("hello");

	}

}
