package org.dnsalias.muppets.poc.springsecurity.tohbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// http://chariotsolutions.com/blog/post/angular-2-spring-boot-jwt-cors_part1/

@SpringBootApplication
public class SpringSecurityTohBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityTohBackendApplication.class, args);
	}
}
