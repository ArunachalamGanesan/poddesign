package com.poddesign.poddesign;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Slf4j
public class PoddesignApplication {

	public static void main(String[] args) {
		SpringApplication.run(PoddesignApplication.class, args);
	}


	@GetMapping("/hello")
	public String getValue() {
		log.info("request recieved");
		return "Hello World";
	}

	@GetMapping("/rajini")
	public String getValue1() {
		log.info("request recieved");
		return "Annathe";
	}

}
